package proyectobancos.Vistas;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import proyectobancos.Administradores.AdministradorPrincipal;
import proyectobancos.Administradores.Reloj;
import proyectobancos.Constantes.Parametros;

/**
 * Clase que va a mostrar la ventana principal de acuerdo a las configuraciones
 * que el usuario le asigna al comienzo o durante la ejecución.
 *
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public final class VentanaRegistroClientesFinal extends javax.swing.JFrame {

    private String Nombre;
    private String Correo;
    private String Hora;
    private String Fecha;

    public static final String PatronEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9"
            + "-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    private VentanaPrincipal ventanaPrincipal;

    /**
     * Metodo Constructor de la clase.
     * @param pVentanaPrincipal 
     */
    public VentanaRegistroClientesFinal(VentanaPrincipal pVentanaPrincipal) {
        initComponents();
        
        setVentana();
        limpiarDatos();
        ventanaPrincipal = pVentanaPrincipal;
    }

    /**
     * Metodo constructor de la clase
     */
    public VentanaRegistroClientesFinal() {
        initComponents();
        
        setVentana();
        limpiarDatos();
    }
    
    /**
     * Método que controla la fecha y la hora del sistema en tiempo real.
     */
    private void setVentana() {
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        this.setLocationRelativeTo(null);
        
        //Procesos de calculo de la fecha
        Calendar Cal = Calendar.getInstance();
        jLabelFecha.setText(Cal.get(Calendar.DATE) + "/" + (Cal.get(Calendar.MONTH) + 1)
                + "/" + Cal.get(Calendar.YEAR));

        //Procesos de calculo de la hora en tiempo real
        Reloj hora = new Reloj(jLabelHora);
        hora.start();
    }

    /**
     * Método que inicializa todas las opciones del sistema.
     */
    public void limpiarDatos() {
        NombreCliente.setText("");
        CorreoCliente.setText("");

        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteMayor.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteDiscapacitado.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }

    /**
     * Método que valida el correo
     * @param email = correo del cliente
     * @return boolean
     */
    public static boolean ValidarCorreo(String email) {
        Pattern pattern = Pattern.compile(PatronEmail);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreVentana = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreVentana.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NombreVentana.setForeground(new java.awt.Color(255, 255, 255));
        NombreVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreVentana.setText("Atención al cliente");
        NombreVentana.setToolTipText("");
        getContentPane().add(NombreVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 330, 40));

        lblHora1.setForeground(new java.awt.Color(255, 255, 255));
        lblHora1.setText("HORA:");
        getContentPane().add(lblHora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 20, 60, 20));

        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelHora.setText("hora");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, 70, 20));

        jLabelFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFecha.setText("fecha");
        getContentPane().add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 45, 70, 20));

        lblFecha2.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha2.setText("FECHA:");
        getContentPane().add(lblFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 45, 70, 20));

        lblHoraFechaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblHoraFechaFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 15, -1, -1));
        getContentPane().add(CorreoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 300, 30));
        getContentPane().add(NombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 300, 30));

        jCheckClienteDiscapacitado.setBackground(new java.awt.Color(0, 0, 0));
        jCheckClienteDiscapacitado.setForeground(new java.awt.Color(255, 255, 255));
        jCheckClienteDiscapacitado.setText("Discapacitado");
        jCheckClienteDiscapacitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteDiscapacitadoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckClienteDiscapacitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 125, 150, 30));

        jCheckClienteMayor.setBackground(new java.awt.Color(0, 0, 0));
        jCheckClienteMayor.setForeground(new java.awt.Color(255, 255, 255));
        jCheckClienteMayor.setText("Adulto Mayor");
        jCheckClienteMayor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteMayorActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckClienteMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 155, 150, 30));

        jCheckClienteEmbarazada.setBackground(new java.awt.Color(0, 0, 0));
        jCheckClienteEmbarazada.setForeground(new java.awt.Color(255, 255, 255));
        jCheckClienteEmbarazada.setText("Embarazada");
        jCheckClienteEmbarazada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteEmbarazadaActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckClienteEmbarazada, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 185, 150, 30));

        jCheckClienteCorporativo.setBackground(new java.awt.Color(0, 0, 0));
        jCheckClienteCorporativo.setForeground(new java.awt.Color(255, 255, 255));
        jCheckClienteCorporativo.setText("Corporativo");
        jCheckClienteCorporativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteCorporativoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckClienteCorporativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 215, 150, 30));

        jCheckClienteRegular.setBackground(new java.awt.Color(0, 0, 0));
        jCheckClienteRegular.setForeground(new java.awt.Color(255, 255, 255));
        jCheckClienteRegular.setText("Regular");
        jCheckClienteRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckClienteRegularActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckClienteRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 245, 150, 30));

        lblFondoTiquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoTransparente.png"))); // NOI18N
        getContentPane().add(lblFondoTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, 140));

        lblFondoTiquete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoTransparente.png"))); // NOI18N
        getContentPane().add(lblFondoTiquete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 110, 140));

        BotonCancelarEnvio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonCancelarEnvio.setForeground(new java.awt.Color(255, 255, 255));
        BotonCancelarEnvio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonCancelarEnvio.setText("Cancelar");
        BotonCancelarEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCancelarEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCancelarEnvioMouseClicked(evt);
            }
        });
        getContentPane().add(BotonCancelarEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 305, 113, 48));

        VentanaRegistroCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(VentanaRegistroCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 130, 60));

        jLabelCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorreo.setText("Correo electrónico");
        getContentPane().add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 210, -1, 30));

        VentanaRegistroCliente2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(VentanaRegistroCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 30));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 160, 110, 30));

        VentanaRegistroCliente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(VentanaRegistroCliente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        BotonEnviar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonEnviar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonEnviar.setText("Registrar");
        BotonEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEnviarMouseClicked(evt);
            }
        });
        getContentPane().add(BotonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 305, 113, 48));

        VentanaRegistroCliente5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(VentanaRegistroCliente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, 60));

        lblFondoMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/bgPrincipal.jpg"))); // NOI18N
        lblFondoMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFondoMenu.setIconTextGap(0);
        getContentPane().add(lblFondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 710, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEnviarMouseClicked
        //Asignacion de datos relevantes
        Correo = CorreoCliente.getText();
        Hora = jLabelHora.getText();
        Fecha = jLabelFecha.getText();
        Nombre = NombreCliente.getText();

        //Contiene el codigo segun el usuario
        String Codigo;

        //Validaciones del programa
        if (ValidarCorreo(CorreoCliente.getText()) == false) {
            JOptionPane.showMessageDialog(null, "El correo no es válido,"
                    + "intentelo nuevamente","Error", JOptionPane.ERROR_MESSAGE);
            return;
            
        } else if (Nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre no es válido,"
                    + "intentelo nuevamente","Error", JOptionPane.ERROR_MESSAGE);
            return;
            
        } else if (!jCheckClienteCorporativo.isSelected() & 
                !jCheckClienteDiscapacitado.isSelected() & 
                !jCheckClienteEmbarazada.isSelected() & 
                !jCheckClienteMayor.isSelected() & 
                !jCheckClienteRegular.isSelected()) {
            JOptionPane.showMessageDialog(null, "La categoria no es válida,"
                    + "intentelo nuevamente","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        //Validan cual opcion eligio el cliente 
        if (jCheckClienteDiscapacitado.isSelected()) {
            Codigo = AdministradorPrincipal.getInstance()
                    .getNextCodigoDiscapacitados();
            AdministradorPrincipal.getInstance()
                    .agregarClienteCategoriaDiscapacitado(Nombre, Correo, 
                            Codigo, Fecha, Hora);
            
        } else if (jCheckClienteMayor.isSelected()) {
            Codigo = AdministradorPrincipal.getInstance()
                    .getNextCodigoAdultoMayor();
            AdministradorPrincipal.getInstance()
                    .agregarClienteCategoriaAdultoMayor(Nombre, Correo, Codigo, 
                            Fecha, Hora);
            
        } else if (jCheckClienteEmbarazada.isSelected()) {
            Codigo = AdministradorPrincipal.getInstance()
                    .getNextCodigoEmbarazada();
            AdministradorPrincipal.getInstance()
                    .agregarClienteCategoriaMujerEmbarazada(Nombre, Correo, 
                            Codigo, Fecha, Hora);
            
        } else if (jCheckClienteCorporativo.isSelected()) {
            Codigo = AdministradorPrincipal.getInstance()
                    .getNextCodigoCorporativo();
            AdministradorPrincipal.getInstance()
                    .agregarClienteCategoriaCorporativos(Nombre, Correo, Codigo, 
                            Fecha, Hora);
            
        } else {
            Codigo = AdministradorPrincipal.getInstance()
                    .getNextCodigoClienteRegular();
            AdministradorPrincipal.getInstance()
                    .agregarClienteCategoriaRegulares(Nombre, Correo, Codigo, 
                            Fecha, Hora);
        }

        //Envio del correo a los usuarios
        AdministradorPrincipal.getInstance().enviarCorreoConfirmacion(Correo, 
                Nombre, Codigo, Parametros.getRutaFotoBanco());
        AdministradorPrincipal.getInstance().mostrarMensaje("Nuevo cliente "
                + "ingresado, correo de confirmación enviado a: " + Correo+
                "\n"+"Usuario: " + Nombre+ "\n"+"Ficha: " + Codigo);
        
        
        JOptionPane.showMessageDialog(null, "Cliente registrado correctamente",
                "Correcto",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_BotonEnviarMouseClicked

    /**
     * Método que devuelve al menu principal.
     * @param evt 
     */
    private void BotonCancelarEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarEnvioMouseClicked
        this.dispose();
    }//GEN-LAST:event_BotonCancelarEnvioMouseClicked

    /**
     * Método que controla el campo si es Discapacitado
     * @param evt 
     */
    private void jCheckClienteDiscapacitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteDiscapacitadoActionPerformed
        jCheckClienteMayor.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteDiscapacitadoActionPerformed

    /**
     * Método que controla el campo si es Adulto mayor
     * @param evt 
     */
    private void jCheckClienteMayorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteMayorActionPerformed
        jCheckClienteDiscapacitado.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteMayorActionPerformed

    /**
     * Método que controla el campo si es Mujer Embarazada
     * @param evt 
     */
    private void jCheckClienteEmbarazadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteEmbarazadaActionPerformed
        jCheckClienteMayor.setSelected(false);
        jCheckClienteDiscapacitado.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteEmbarazadaActionPerformed

    /**
     * Método que controla el campo si es Cliente Corpoativo
     * @param evt 
     */
    private void jCheckClienteCorporativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteCorporativoActionPerformed
        jCheckClienteMayor.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteDiscapacitado.setSelected(false);
        jCheckClienteRegular.setSelected(false);
    }//GEN-LAST:event_jCheckClienteCorporativoActionPerformed

    /**
     * Método que controla el campo si es Cliente Regular
     * @param evt 
     */
    private void jCheckClienteRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckClienteRegularActionPerformed
        jCheckClienteMayor.setSelected(false);
        jCheckClienteEmbarazada.setSelected(false);
        jCheckClienteCorporativo.setSelected(false);
        jCheckClienteDiscapacitado.setSelected(false);
    }//GEN-LAST:event_jCheckClienteRegularActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistroClientesFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new VentanaRegistroClientesFinal().setVisible(true);
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
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblFondoMenu;
    private javax.swing.JLabel lblFondoTiquete;
    private javax.swing.JLabel lblFondoTiquete1;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblHoraFechaFondo;
    // End of variables declaration//GEN-END:variables
}
