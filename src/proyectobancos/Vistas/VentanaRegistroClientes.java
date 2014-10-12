
package proyectobancos.Vistas;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import proyectobancos.Administradores.Clientes;
import proyectobancos.Administradores.CorreoClientes;
import proyectobancos.Administradores.Queue;
import proyectobancos.Administradores.Reloj;
//import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Miller
 */
public class VentanaRegistroClientes extends javax.swing.JFrame {

    /**
     * Creates new form VentanaClientes
     */
    public VentanaRegistroClientes() {
        Discapacitados = new Queue();
        Embarazadas = new Queue();
        Corporativos = new Queue();
        Regulares = new Queue();
        Mayores = new Queue();
        Prioridad = new Queue();
        Clientes = new Queue();
        Cajas = new Lista();
        DisponibilidadCajas = new Lista();
        
        EnviarEmail = new CorreoClientes("correo server","contrase;a",imagen,imagen,"Correo Confirmacion");
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255,255,255));
        setResizable(false);
        this.setLocationRelativeTo(null);
        setImagen();
        Reloj hora = new Reloj(jLabel1);
        hora.start();
        Calendar Cal= Calendar.getInstance();
        String fecha= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        jLabel2.setText(fecha);
    }

    /**
     * This method is called from within the connluctor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreCliente = new javax.swing.JTextField();
        CorreoCliente = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jCheckClienteDiscapacitado = new javax.swing.JCheckBox();
        jCheckClienteMayor = new javax.swing.JCheckBox();
        jCheckClienteEmbarazada = new javax.swing.JCheckBox();
        jCheckClienteCorporativo = new javax.swing.JCheckBox();
        jCheckClienteRegular = new javax.swing.JCheckBox();
        BotonEnviar = new javax.swing.JButton();
        BotonCancelarEnvio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        NombreVentana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreClienteActionPerformed(evt);
            }
        });

        CorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoClienteActionPerformed(evt);
            }
        });

        jLabelNombre.setText("Nombre:");

        jLabelCorreo.setText("Correo:");

        jCheckClienteDiscapacitado.setText("Discapacitado");
        jCheckClienteDiscapacitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteDiscapacitadoActionPerformed(evt);
            }
        });

        jCheckClienteMayor.setText("AMayor");
        jCheckClienteMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteMayorActionPerformed(evt);
            }
        });

        jCheckClienteEmbarazada.setText("Embarazada");
        jCheckClienteEmbarazada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteEmbarazadaActionPerformed(evt);
            }
        });

        jCheckClienteCorporativo.setText("Corporativo");
        jCheckClienteCorporativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteCorporativoActionPerformed(evt);
            }
        });

        jCheckClienteRegular.setText("Regular");
        jCheckClienteRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteRegularActionPerformed(evt);
            }
        });

        BotonEnviar.setText("Enviar");
        BotonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnviarActionPerformed(evt);
            }
        });
        BotonEnviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotonEnviarKeyPressed(evt);
            }
        });

        BotonCancelarEnvio.setText("Cancelar");
        BotonCancelarEnvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarEnvioActionPerformed(evt);
            }
        });
        BotonCancelarEnvio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotonCancelarEnvioKeyPressed(evt);
            }
        });

        jLabel1.setText("Hora");

        jLabel2.setText("Fecha");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/LogoBAC.jpg"))); // NOI18N
        Logo.setText("jLabel3");

        NombreVentana.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NombreVentana.setForeground(new java.awt.Color(204, 0, 0));
        NombreVentana.setText("Atencion Al cliente");
        NombreVentana.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreVentana, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckClienteDiscapacitado)
                                    .addComponent(jCheckClienteRegular)
                                    .addComponent(jCheckClienteCorporativo)
                                    .addComponent(jCheckClienteEmbarazada)
                                    .addComponent(jCheckClienteMayor))
                                .addGap(38, 409, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(CorreoCliente))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BotonCancelarEnvio)
                                            .addComponent(BotonEnviar))
                                        .addGap(26, 26, 26))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelCorreo))
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCorreo))
                        .addGap(18, 18, 18)
                        .addComponent(BotonEnviar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Logo)
                            .addComponent(NombreVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(BotonCancelarEnvio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jCheckClienteDiscapacitado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckClienteMayor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckClienteEmbarazada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckClienteCorporativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckClienteRegular)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreClienteActionPerformed

    private void CorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoClienteActionPerformed

    private void BotonCancelarEnvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarEnvioActionPerformed
        // TODO add your handling code here:
        hide();
    }//GEN-LAST:event_BotonCancelarEnvioActionPerformed

    private void jCheckClienteDiscapacitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteDiscapacitadoActionPerformed
        // TODO add your handling code here:
        jCheckClienteMayor.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteDiscapacitadoActionPerformed
    
    private void jCheckClienteCorporativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteCorporativoActionPerformed
        // TODO add your handling code here:
        jCheckClienteMayor.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteDiscapacitado.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteCorporativoActionPerformed

    private void jCheckClienteEmbarazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteEmbarazadaActionPerformed
        // TODO add your handling code here:
        jCheckClienteMayor.setSelected(false);
        jCheckClienteDiscapacitado.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteEmbarazadaActionPerformed

    private void jCheckClienteMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteMayorActionPerformed
        // TODO add your handling code here:
        jCheckClienteDiscapacitado.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteMayorActionPerformed

    private void jCheckClienteRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteRegularActionPerformed
        // TODO add your handling code here:
        jCheckClienteMayor.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteDiscapacitado.setSelected(false);
    }//GEN-LAST:event_jCheckClienteRegularActionPerformed

    private void BotonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnviarActionPerformed
        // TODO add your handling code here:
        String nl = System.getProperty("line.separator");//Ingresa Saltos entre lineas
        try {
            if (jCheckClienteDiscapacitado.isSelected()==true) {
                //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su connluctor
                File archivo=new File("Clientes/Discapacitados.txt");


                //Escribir en el archivo utilizando el metodo write
                try ( //Crear objeto FileWriter que ayude a escribir sobre el archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    //Escribir en el archivo con el metodo Write
                    escribir.write(contadorDiscapacitados+"   "+NombreCliente.getText()+"   "+"Discapacitados"+"   "+Hora+"   "+Fecha+nl);
                    contadorDiscapacitados++;
                    //Cerrar
                
                }
            }
            else if (jCheckClienteMayor.isSelected()==true) {
                    //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su connluctor
                File archivo=new File("Clientes/Mayores.txt");


                //Escribir en el archivo utilizando el metodo write
                try ( //Crear objeto FileWriter que ayude a escribir sobre el archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    //Escribir en el archivo con el metodo Write
                    escribir.write(contadorMayores+"   "+NombreCliente.getText()+"   "+"Mayores"+"   "+Hora+"   "+Fecha+nl);
                    contadorMayores++;
                    
                    //Cerrar
                }
            }
            else if (jCheckClienteEmbarazada.isSelected()==true) {
                
                     //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su connluctor
                File archivo=new File("Clientes/Embarazadas.txt");


                //Escribir en el archivo utilizando el metodo write
                try (  //Crear objeto FileWriter que ayude a escribir sobre el archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    //Escribir en el archivo con el metodo Write
                    escribir.write(contadorEmbarazadas+"   "+NombreCliente.getText()+"   "+CorreoCliente.getText()+"   "+"Embarazadas"+"   "+Hora+"   "+Fecha+nl);
                    contadorEmbarazadas++;
                    
                    //Cerrar
                }
            }
            else if (jCheckClienteCorporativo.isSelected()==true) {
                File archivo=new File("Clientes/Corporativos.txt");
                //Escribir en el archivo utilizando el metodo write
                try ( //Crear objeto FileWriter que ayude a escribir sobre el archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    //Escribimos en el archivo con el metodo write
                    escribir.write(contadorCorporativos+"   "+NombreCliente.getText()+"   "+CorreoCliente.getText()+"   "+"Corporativos"+"   "+Hora+"   "+Fecha+nl);
                    contadorCorporativos++;
                    
                    //Cerrar
                }
            } 
            else if (jCheckClienteRegular.isSelected()==true) {
                File archivo=new File("Clientes/Regulares.txt");
                //Escribir en el archivo con el metodo write
                try ( //Crear objeto FileWriter que ayude a escribir sobre el archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    //Escribimos en el archivo con el metodo write
                    escribir.write(contadorRegulares+"   "+NombreCliente.getText()+"   "+CorreoCliente.getText()+"   "+"Regulares"+"   "+Hora+"   "+Fecha+nl);
                    contadorRegulares++;
                    
                    
                    
                    //Cerrar
                }
                

            }
            Nombre = NombreCliente.getText();
            if(ValidarCorreo(CorreoCliente.getText())==true){
                Correo = CorreoCliente.getText();
                Hora = jLabel1.getText();
                Fecha = jLabel2.getText();
                String Prioridad = null;
                if (jCheckClienteDiscapacitado.isSelected()) {
                    Prioridad = "Discapacitados";
                    Clientes cliente = new Clientes (Nombre,Correo,"Discapacitados",Fecha,Hora);
                    Discapacitados.queue(cliente);
                    sizeDiscapacitados = Discapacitados.getTotalSize();
                } 
                else if (jCheckClienteMayor.isSelected()) {
                    Prioridad = "Mayores";
                    Clientes cliente = new Clientes (Nombre,Correo,"Mayores",Fecha,Hora);
                    Mayores.queue(cliente);
                    sizeMayores = Mayores.getTotalSize();
                } 
                else if (jCheckClienteEmbarazada.isSelected()) {
                    Prioridad = "Embarazadas";
                    Clientes cliente = new Clientes (Nombre,Correo,"Embarazadas",Fecha,Hora);
                    Embarazadas.queue(cliente);
                    sizeEmbarazadas = Embarazadas.getTotalSize();
                } 
                else if (jCheckClienteCorporativo.isSelected()) {
                    Prioridad = "Corporativos";
                    Clientes cliente = new Clientes (Nombre,Correo,"Corporativos",Fecha,Hora);
                    Corporativos.queue(cliente);
                    sizeCorporativos = Corporativos.getTotalSize();
                } 
                else if (jCheckClienteRegular.isSelected()) {
                    Prioridad = "Regulares";
                    Clientes cliente = new Clientes (Nombre,Correo,"Regulares",Fecha,Hora);
                    Regulares.queue(cliente);
                    sizeRegulares = Regulares.getTotalSize();
                }
                Clientes cliente = new Clientes (Nombre,Correo,Prioridad,Fecha,Hora);
                Clientes.queue(cliente);
                System.out.println("se mando mail");
                JOptionPane.showMessageDialog(null,"Datos Guardados");
                EnviarEmail.sendMail(Nombre, Correo, Fecha, Hora);
                hide();
            }
            else{
                JOptionPane.showMessageDialog(null,"El correo no es valido valido");
            }
        }
        catch(IOException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"Ocurrio un error al ingresar los datos");
        }                                         

    }//GEN-LAST:event_BotonEnviarActionPerformed

    private void BotonEnviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonEnviarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEnviarKeyPressed

    private void BotonCancelarEnvioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonCancelarEnvioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarEnvioKeyPressed
    public static boolean ValidarCorreo(String email) {
        Pattern pattern = Pattern.compile(PatronEmail);
 
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelarEnvio;
    private javax.swing.JButton BotonEnviar;
    private javax.swing.JTextField CorreoCliente;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JLabel NombreVentana;
    private javax.swing.JCheckBox jCheckClienteCorporativo;
    private javax.swing.JCheckBox jCheckClienteDiscapacitado;
    private javax.swing.JCheckBox jCheckClienteEmbarazada;
    private javax.swing.JCheckBox jCheckClienteMayor;
    private javax.swing.JCheckBox jCheckClienteRegular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelNombre;
    // End of variables declaration//GEN-END:variables
    private String Nombre;
    private String Correo;
    private String Hora;
    private String Fecha;
    
    public static Queue Discapacitados;
    public static Queue Mayores;
    public static Queue Embarazadas;
    public static Queue Corporativos;
    public static Queue Regulares;
    public static Queue Prioridad;
    public static Queue Clientes;
   
    public static Lista Cajas;
    public static Lista DisponibilidadCajas;
    public static int contadorDiscapacitados = 0;
    public static int contadorMayores = 0;
    public static int contadorEmbarazadas = 0;
    public static int contadorCorporativos = 0;
    public static int contadorRegulares = 0;
    public CorreoClientes EnviarEmail;
    public static int sizeDiscapacitados;
    public static int sizeMayores;
    public static int sizeEmbarazadas;
    public static int sizeCorporativos;
    public static int sizeRegulares;
    public static final String PatronEmail="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+
            "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static String imagen = System.getProperty("user.dir")+"/Imagenes/LogoBAC.gif";
        
    public void setImagen(){
        
        String file = imagen;
        ImageIcon fot = new ImageIcon(file); 
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_DEFAULT)); 
        Logo.setIcon(icono); 
        this.repaint();
        
    }
    
}