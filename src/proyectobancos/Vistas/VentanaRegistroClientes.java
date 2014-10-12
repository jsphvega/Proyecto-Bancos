package proyectobancos.Vistas;

import proyectobancos.Administradores.Lista;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import proyectobancos.Administradores.AdministradorCorreo;
import proyectobancos.Administradores.Clientes;
import proyectobancos.Administradores.Queue;
import proyectobancos.Administradores.Reloj;

/**
 * Clase que va a mostrar la ventana principal de acuerdo a las configuraciones
 * que el usuario le asigna al comienzo o durante la ejecución.
 *
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public final class VentanaRegistroClientes extends javax.swing.JFrame {

    private AdministradorCorreo administradorCorreo;

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

        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        this.setLocationRelativeTo(null);
        //setImagen();
        Reloj hora = new Reloj(jLabel1);
        hora.start();
        Calendar Cal = Calendar.getInstance();
        String fecha = Cal.get(Cal.DATE) + "/" + (Cal.get(Cal.MONTH) + 1) + "/" + Cal.get(Cal.YEAR);
        jLabel2.setText(fecha);
        
        administradorCorreo = new AdministradorCorreo();
        
    }

    /**
     * This method is called from within the connluctor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreVentana = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFecha2 = new javax.swing.JLabel();
        lblHoraFechaFondo = new javax.swing.JLabel();
        CorreoCliente = new javax.swing.JTextField();
        NombreCliente = new javax.swing.JTextField();
        jCheckClienteDiscapacitado = new javax.swing.JCheckBox();
        jCheckClienteMayor = new javax.swing.JCheckBox();
        jCheckClienteEmbarazada = new javax.swing.JCheckBox();
        jCheckClienteCorporativo = new javax.swing.JCheckBox();
        jCheckClienteRegular = new javax.swing.JCheckBox();
        lblFondoTiquete = new javax.swing.JLabel();
        lblFondoTiquete1 = new javax.swing.JLabel();
        lblFondoTiquete2 = new javax.swing.JLabel();
        BotonCancelarEnvio = new javax.swing.JLabel();
        VentanaRegistroCliente1 = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        VentanaRegistroCliente2 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        VentanaRegistroCliente3 = new javax.swing.JLabel();
        BotonEnviar = new javax.swing.JLabel();
        VentanaRegistroCliente5 = new javax.swing.JLabel();
        lblFondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setMinimumSize(new java.awt.Dimension(700, 445));
        setResizable(false);
        getContentPane().setLayout(null);

        NombreVentana.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NombreVentana.setForeground(new java.awt.Color(204, 0, 0));
        NombreVentana.setText("Atención al cliente");
        NombreVentana.setToolTipText("");
        getContentPane().add(NombreVentana);
        NombreVentana.setBounds(180, 10, 550, 40);

        lblHora1.setForeground(new java.awt.Color(255, 255, 255));
        lblHora1.setText("HORA:");
        getContentPane().add(lblHora1);
        lblHora1.setBounds(15, 10, 40, 20);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("hora");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(55, 10, 70, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("fecha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(55, 35, 70, 20);

        lblFecha2.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha2.setText("FECHA:");
        getContentPane().add(lblFecha2);
        lblFecha2.setBounds(15, 35, 40, 20);

        lblHoraFechaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblHoraFechaFondo);
        lblHoraFechaFondo.setBounds(8, 5, 123, 56);

        CorreoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(CorreoCliente);
        CorreoCliente.setBounds(160, 230, 370, 30);
        getContentPane().add(NombreCliente);
        NombreCliente.setBounds(160, 180, 370, 30);

        jCheckClienteDiscapacitado.setBackground(new java.awt.Color(0, 0, 0));
        jCheckClienteDiscapacitado.setForeground(new java.awt.Color(255, 255, 255));
        jCheckClienteDiscapacitado.setText("Discapacitado");
        jCheckClienteDiscapacitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteDiscapacitadoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckClienteDiscapacitado);
        jCheckClienteDiscapacitado.setBounds(540, 150, 150, 30);

        jCheckClienteMayor.setBackground(new java.awt.Color(0, 0, 0));
        jCheckClienteMayor.setForeground(new java.awt.Color(255, 255, 255));
        jCheckClienteMayor.setText("Adulto Mayor");
        jCheckClienteMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteMayorActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckClienteMayor);
        jCheckClienteMayor.setBounds(540, 180, 150, 30);

        jCheckClienteEmbarazada.setBackground(new java.awt.Color(0, 0, 0));
        jCheckClienteEmbarazada.setForeground(new java.awt.Color(255, 255, 255));
        jCheckClienteEmbarazada.setText("Embarazada");
        jCheckClienteEmbarazada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteEmbarazadaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckClienteEmbarazada);
        jCheckClienteEmbarazada.setBounds(540, 210, 150, 30);

        jCheckClienteCorporativo.setBackground(new java.awt.Color(0, 0, 0));
        jCheckClienteCorporativo.setForeground(new java.awt.Color(255, 255, 255));
        jCheckClienteCorporativo.setText("Corporativo");
        jCheckClienteCorporativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteCorporativoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckClienteCorporativo);
        jCheckClienteCorporativo.setBounds(540, 240, 150, 30);

        jCheckClienteRegular.setBackground(new java.awt.Color(0, 0, 0));
        jCheckClienteRegular.setForeground(new java.awt.Color(255, 255, 255));
        jCheckClienteRegular.setText("Regular");
        jCheckClienteRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteRegularActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckClienteRegular);
        jCheckClienteRegular.setBounds(540, 270, 150, 30);

        lblFondoTiquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoTransparente.png"))); // NOI18N
        getContentPane().add(lblFondoTiquete);
        lblFondoTiquete.setBounds(150, 150, 246, 140);

        lblFondoTiquete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoTransparente.png"))); // NOI18N
        getContentPane().add(lblFondoTiquete1);
        lblFondoTiquete1.setBounds(380, 150, 246, 140);

        lblFondoTiquete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoTransparente.png"))); // NOI18N
        getContentPane().add(lblFondoTiquete2);
        lblFondoTiquete2.setBounds(610, 170, 246, 120);

        BotonCancelarEnvio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonCancelarEnvio.setForeground(new java.awt.Color(255, 255, 255));
        BotonCancelarEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonCancelarEnvio.setText("Cancelar");
        BotonCancelarEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCancelarEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCancelarEnvioMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotonCancelarEnvioMouseReleased(evt);
            }
        });
        getContentPane().add(BotonCancelarEnvio);
        BotonCancelarEnvio.setBounds(400, 330, 120, 50);

        VentanaRegistroCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(VentanaRegistroCliente1);
        VentanaRegistroCliente1.setBounds(400, 330, 130, 60);

        jLabelCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorreo.setText("Correo Electronico");
        jLabelCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCorreoMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCorreo);
        jLabelCorreo.setBounds(40, 230, 120, 30);

        VentanaRegistroCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        VentanaRegistroCliente2.setText("jLabel1");
        getContentPane().add(VentanaRegistroCliente2);
        VentanaRegistroCliente2.setBounds(30, 230, 120, 30);

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        jLabelNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNombreMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelNombre);
        jLabelNombre.setBounds(50, 180, 90, 30);

        VentanaRegistroCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(VentanaRegistroCliente3);
        VentanaRegistroCliente3.setBounds(30, 180, 120, 30);

        BotonEnviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonEnviar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonEnviar.setText("Registrar");
        BotonEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseReleased(evt);
            }
        });
        getContentPane().add(BotonEnviar);
        BotonEnviar.setBounds(270, 330, 120, 50);

        VentanaRegistroCliente5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        VentanaRegistroCliente5.setText("jLabel1");
        getContentPane().add(VentanaRegistroCliente5);
        VentanaRegistroCliente5.setBounds(270, 330, 130, 60);

        lblFondoMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoPrincipal.jpg"))); // NOI18N
        lblFondoMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFondoMenu.setIconTextGap(0);
        getContentPane().add(lblFondoMenu);
        lblFondoMenu.setBounds(0, -5, 700, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEnviarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonEnviarMouseReleased

    private void jLabelNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelNombreMouseClicked

    private void jLabelCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCorreoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCorreoMouseClicked

    private void BotonCancelarEnvioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarEnvioMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCancelarEnvioMouseReleased

    private void BotonEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseClicked
        // TODO add your handling code here:
        String nl = System.getProperty("line.separator");//Ingresa Saltos entre lineas
        try {
            if (jCheckClienteDiscapacitado.isSelected() == true) {
                //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su connluctor
                File archivo = new File("Clientes/Discapacitados.txt");

                //Escribir en el archivo utilizando el metodo write
                try ( //Crear objeto FileWriter que ayude a escribir sobre el archivo
                        FileWriter escribir = new FileWriter(archivo, true)) {
                    //Escribir en el archivo con el metodo Write
                    escribir.write(contadorDiscapacitados + "   " + NombreCliente.getText() + "   " + "Discapacitados" + "   " + Hora + "   " + Fecha + nl);
                    contadorDiscapacitados++;
                    //Cerrar

                }
            } else if (jCheckClienteMayor.isSelected() == true) {
                //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su connluctor
                File archivo = new File("Clientes/Mayores.txt");

                //Escribir en el archivo utilizando el metodo write
                try ( //Crear objeto FileWriter que ayude a escribir sobre el archivo
                        FileWriter escribir = new FileWriter(archivo, true)) {
                    //Escribir en el archivo con el metodo Write
                    escribir.write(contadorMayores + "   " + NombreCliente.getText() + "   " + "Mayores" + "   " + Hora + "   " + Fecha + nl);
                    contadorMayores++;

                    //Cerrar
                }
            } else if (jCheckClienteEmbarazada.isSelected() == true) {

                //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su connluctor
                File archivo = new File("Clientes/Embarazadas.txt");

                //Escribir en el archivo utilizando el metodo write
                try ( //Crear objeto FileWriter que ayude a escribir sobre el archivo
                        FileWriter escribir = new FileWriter(archivo, true)) {
                    //Escribir en el archivo con el metodo Write
                    escribir.write(contadorEmbarazadas + "   " + NombreCliente.getText() + "   " + CorreoCliente.getText() + "   " + "Embarazadas" + "   " + Hora + "   " + Fecha + nl);
                    contadorEmbarazadas++;

                    //Cerrar
                }
            } else if (jCheckClienteCorporativo.isSelected() == true) {
                File archivo = new File("Clientes/Corporativos.txt");
                //Escribir en el archivo utilizando el metodo write
                try ( //Crear objeto FileWriter que ayude a escribir sobre el archivo
                        FileWriter escribir = new FileWriter(archivo, true)) {
                    //Escribimos en el archivo con el metodo write
                    escribir.write(contadorCorporativos + "   " + NombreCliente.getText() + "   " + CorreoCliente.getText() + "   " + "Corporativos" + "   " + Hora + "   " + Fecha + nl);
                    contadorCorporativos++;

                    //Cerrar
                }
            } else if (jCheckClienteRegular.isSelected() == true) {
                File archivo = new File("Clientes/Regulares.txt");
                //Escribir en el archivo con el metodo write
                try ( //Crear objeto FileWriter que ayude a escribir sobre el archivo
                        FileWriter escribir = new FileWriter(archivo, true)) {
                    //Escribimos en el archivo con el metodo write
                    escribir.write(contadorRegulares + "   " + NombreCliente.getText() + "   " + CorreoCliente.getText() + "   " + "Regulares" + "   " + Hora + "   " + Fecha + nl);
                    contadorRegulares++;

                    //Cerrar
                }

            }
            Nombre = NombreCliente.getText();
            if (ValidarCorreo(CorreoCliente.getText()) == true) {
                Correo = CorreoCliente.getText();
                Hora = jLabel1.getText();
                Fecha = jLabel2.getText();
                String Prioridad = null;
                if (jCheckClienteDiscapacitado.isSelected()) {
                    Prioridad = "Discapacitados";
                    Clientes cliente = new Clientes(Nombre, Correo, "Discapacitados", Fecha, Hora);
                    Discapacitados.queue(cliente);
                    sizeDiscapacitados = Discapacitados.getTotalSize();
                } else if (jCheckClienteMayor.isSelected()) {
                    Prioridad = "Mayores";
                    Clientes cliente = new Clientes(Nombre, Correo, "Mayores", Fecha, Hora);
                    Mayores.queue(cliente);
                    sizeMayores = Mayores.getTotalSize();
                } else if (jCheckClienteEmbarazada.isSelected()) {
                    Prioridad = "Embarazadas";
                    Clientes cliente = new Clientes(Nombre, Correo, "Embarazadas", Fecha, Hora);
                    Embarazadas.queue(cliente);
                    sizeEmbarazadas = Embarazadas.getTotalSize();
                } else if (jCheckClienteCorporativo.isSelected()) {
                    Prioridad = "Corporativos";
                    Clientes cliente = new Clientes(Nombre, Correo, "Corporativos", Fecha, Hora);
                    Corporativos.queue(cliente);
                    sizeCorporativos = Corporativos.getTotalSize();
                } else if (jCheckClienteRegular.isSelected()) {
                    Prioridad = "Regulares";
                    Clientes cliente = new Clientes(Nombre, Correo, "Regulares", Fecha, Hora);
                    Regulares.queue(cliente);
                    sizeRegulares = Regulares.getTotalSize();
                }
                Clientes cliente = new Clientes(Nombre, Correo, Prioridad, Fecha, Hora);
                Clientes.queue(cliente);

                administradorCorreo.enviarCorreoConfirmacion(Correo, Nombre, "A12", "C:\\Users\\RUBEN\\Dropbox\\Horarios buses MUSOC.jpg");

                //EnviarEmail.sendMail(Nombre, Correo, Fecha, Hora);
                System.out.println("se mando un correo");
                JOptionPane.showMessageDialog(null, "Datos Guardados");

                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "El correo no es valido valido");
            }
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al ingresar los datos");
        }

    }//GEN-LAST:event_BotonEnviarMouseClicked

    private void BotonCancelarEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarEnvioMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_BotonCancelarEnvioMouseClicked

    private void jCheckClienteDiscapacitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteDiscapacitadoActionPerformed
        // TODO add your handling code here:
        jCheckClienteMayor.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteDiscapacitadoActionPerformed

    private void jCheckClienteMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteMayorActionPerformed
        // TODO add your handling code here:
        jCheckClienteDiscapacitado.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteMayorActionPerformed

    private void jCheckClienteEmbarazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteEmbarazadaActionPerformed
        // TODO add your handling code here:
        jCheckClienteMayor.setSelected(false);
        jCheckClienteDiscapacitado.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteEmbarazadaActionPerformed

    private void jCheckClienteCorporativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteCorporativoActionPerformed
        // TODO add your handling code here:
        jCheckClienteMayor.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteDiscapacitado.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteCorporativoActionPerformed

    private void jCheckClienteRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteRegularActionPerformed
        // TODO add your handling code here:
        jCheckClienteMayor.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteDiscapacitado.setSelected(false);
    }//GEN-LAST:event_jCheckClienteRegularActionPerformed

    private void CorreoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoClienteActionPerformed

    public static boolean ValidarCorreo(String email) {
        Pattern pattern = Pattern.compile(PatronEmail);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonCancelarEnvio;
    private javax.swing.JLabel BotonEnviar;
    private javax.swing.JTextField CorreoCliente;
    private javax.swing.JTextField NombreCliente;
    private javax.swing.JLabel NombreVentana;
    private javax.swing.JLabel VentanaRegistroCliente1;
    private javax.swing.JLabel VentanaRegistroCliente2;
    private javax.swing.JLabel VentanaRegistroCliente3;
    private javax.swing.JLabel VentanaRegistroCliente5;
    private javax.swing.JCheckBox jCheckClienteCorporativo;
    private javax.swing.JCheckBox jCheckClienteDiscapacitado;
    private javax.swing.JCheckBox jCheckClienteEmbarazada;
    private javax.swing.JCheckBox jCheckClienteMayor;
    private javax.swing.JCheckBox jCheckClienteRegular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblFondoMenu;
    private javax.swing.JLabel lblFondoTiquete;
    private javax.swing.JLabel lblFondoTiquete1;
    private javax.swing.JLabel lblFondoTiquete2;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblHoraFechaFondo;
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
    //public CorreoClientes EnviarEmail;

    public static int sizeDiscapacitados;
    public static int sizeMayores;
    public static int sizeEmbarazadas;
    public static int sizeCorporativos;
    public static int sizeRegulares;
    public static final String PatronEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static String imagen = System.getProperty("user.dir") + "/Imagenes/LogoBAC.jpg";

    /*public void setImagen(){
        
     String file = imagen;
     ImageIcon fot = new ImageIcon(file); 
     Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_DEFAULT)); 
     Logo.setIcon(icono); 
     this.repaint();
        
     }*/
}
