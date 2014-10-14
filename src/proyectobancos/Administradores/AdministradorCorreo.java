/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancos.Administradores;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Lucia
 */
public class AdministradorCorreo {

    private final String sourceEmail; // requires valid Gmail id
    private final String password; // correct password for Gmail id
    private String toEmail; // any destination email id
    private Session session;
    private String asuntoConfirmacion;
    private String asuntoTurno;
    private String cuerpoCorreoConfirmacionParte1;
    private String cuerpoCorreoConfirmacionParte2;
    private String cuerpoCorreoConfirmacionParte3;

    private String rutaImagen = getClass().getResource("/proyectobancos/Imagenes/bgPrincipal.png").getPath();
    
    

    private String cuerpoCorreoTurno;

    public AdministradorCorreo() {
        //System.out.println("1. Propiedades del servidor de correos");

        asuntoConfirmacion = "Confirmación de tiquete";
        asuntoTurno = "Es su turno en el cajero #: ";

        cuerpoCorreoConfirmacionParte1 = "Buenas estimado cliente,<br><br>";
        cuerpoCorreoConfirmacionParte2 = "Se le informa que se le ha asignado el siguiente tiquete para ser atendido<br><br> ";
        cuerpoCorreoConfirmacionParte3 = "Saludos, <br><br>Favor espere su turno, pronto se le notificará.";

        sourceEmail = "malusoce96@gmail.com"; // requires valid Gmail id
        password = "luciasolis"; // correct password for Gmail id

        Properties props = new Properties();

        props.put(
                "mail.smtp.host", "smtp.gmail.com");
        props.put(
                "mail.smtp.port", "587");
        props.put(
                "mail.smtp.auth", "true");
        props.put(
                "mail.smtp.starttls.enable", "true");

        System.out.println(
                "2.Autentificacion");

        Authenticator authentication = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sourceEmail, password);
            }
        };
        session = Session.getInstance(props, authentication);

    }

    public boolean enviarCorreoConfirmacion(String correoDestino, String nombre, String tiquete, String rutaImagen) {
        this.toEmail = correoDestino;
        cuerpoCorreoConfirmacionParte1 += nombre + "<br><br>";
        cuerpoCorreoConfirmacionParte1 += cuerpoCorreoConfirmacionParte2 + tiquete + "<br><br>" + cuerpoCorreoConfirmacionParte3;
        return generateAndSendEmail(session, toEmail, asuntoConfirmacion, cuerpoCorreoConfirmacionParte1, rutaImagen);
    }

    public boolean enviarCorreoTurno(String correoDestino, String rutaImagen) {
        this.toEmail = correoDestino;
        return generateAndSendEmail(session, toEmail, asuntoTurno, cuerpoCorreoTurno, rutaImagen);
    }

    boolean enviarCorreoTurno(String correoDestino, String rutaFotoBanco, int numeroCajero) {
        this.toEmail = correoDestino;
        asuntoConfirmacion  += numeroCajero;
        return generateAndSendEmail(session, toEmail, asuntoTurno, cuerpoCorreoTurno, rutaImagen);
    }

    public static boolean generateAndSendEmail(Session session, String toEmail, String subject,
            String body, String rutaFoto) {
        try {
            //System.out.println("3.Generando Correo");

            MimeMessage crunchifyMessage = new MimeMessage(session);
            crunchifyMessage.addHeader("Content-type", "text/HTML; charset=UTF-8");
            crunchifyMessage.addHeader("format", "flowed");
            crunchifyMessage.addHeader("Content-Transfer-Encoding", "8bit");

            crunchifyMessage.setFrom(new InternetAddress("adminin@bacsanjose.com",
                    "Confirmación"));
            crunchifyMessage.setReplyTo(InternetAddress.parse("adminin@bacsanjose.com", false));
            crunchifyMessage.setSubject(subject, "UTF-8");
            crunchifyMessage.setSentDate(new Date());
            crunchifyMessage.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(toEmail, false));

            // Create the message body part
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(body, "text/html");

            // Create a multipart message for attachment
            Multipart multipart = new MimeMultipart();

            // Set text message part
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();

            // Valid file location
            String filename = rutaFoto; //"C:\\Users\\RUBEN\\Dropbox\\Horarios buses MUSOC.jpg";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            // Trick is to add the content-id header here
            messageBodyPart.setHeader("Content-ID", "image_id");
            multipart.addBodyPart(messageBodyPart);

            //System.out.println("4.Imagen");
            messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent("<br><h3></h3>"
                    + "<img src='cid:image_id'>", "text/html");
            multipart.addBodyPart(messageBodyPart);
            crunchifyMessage.setContent(multipart);

            System.out.println("5.Enviando correo");

            // Finally Send message
            Transport.send(crunchifyMessage);

            System.out.println("6.Correo enviado exitosamente");
            return true;

        } catch (MessagingException e) {
            //e.printStackTrace();
            //Error al enviar correo
            System.out.println("Error en el envio de correo");
            return false;
        } catch (UnsupportedEncodingException e) {
            //e.printStackTrace();
            //Error al enviar correo
            System.out.println("Error en el envio de correo");
            return false;
        }catch (Exception e) {
            //e.printStackTrace();
            //Error al enviar correo
            System.out.println("Error en el envio de correo");
            return false;
        }
    }

}
