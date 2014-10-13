package proyectobancos.Vistas;

import java.awt.Image;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyectobancos.Administradores.Reloj;
import proyectobancos.Constantes.Parametros;

public class VentanaConfiguracion extends javax.swing.JFrame {
    String Direccion;
    
    Parametros Pa = new Parametros();
    
    public VentanaConfiguracion() {     
        initComponents();
        
        setVentana();
        
        jspCantidad.setValue(Pa.getCajas());
        
        lblSubtitulo.setText(Pa.getNombreBanco());
        //Convierte la imagen
        ImageIcon fot = new ImageIcon(Pa.getFotoBanco()); 
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(400, 
                400, Image.SCALE_DEFAULT));

        //Asigna la imagen
        lblLogo.setIcon(icono); 
        
        Direccion = Pa.getFotoBanco();
    }
    
    /**
     * Método que controla la fecha y la hora del sistema en tiempo real.
     */
    private void setVentana(){
        //Procesos de calculo de la fecha
        Calendar Cal= Calendar.getInstance();
        lblFecha1.setText(Cal.get(Calendar.DATE) + "/" + (Cal.get(Calendar.MONTH)+1)
                + "/" + Cal.get(Calendar.YEAR));
        
        //Procesos de calculo de la hora en tiempo real
        Reloj hora = new Reloj(lblHora2);
        hora.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSubtitulo = new javax.swing.JLabel();
        lblHora2 = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        lblFecha2 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        lblHoraFechaFondo = new javax.swing.JLabel();
        btnLogo = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        jspCantidad = new javax.swing.JSpinner();
        btnNombre = new javax.swing.JButton();
        BarraNombre = new javax.swing.JScrollPane();
        txtNombre = new javax.swing.JTextPane();
        btnAceptar = new javax.swing.JButton();
        lblFondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 36, 36));
        setFocusCycleRoot(false);
        setMaximumSize(new java.awt.Dimension(700, 440));
        setMinimumSize(new java.awt.Dimension(700, 440));
        setPreferredSize(new java.awt.Dimension(700, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        lblSubtitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubtitulo.setText("...");
        getContentPane().add(lblSubtitulo);
        lblSubtitulo.setBounds(10, 10, 680, 33);

        lblHora2.setForeground(new java.awt.Color(255, 255, 255));
        lblHora2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora2.setText("hora");
        getContentPane().add(lblHora2);
        lblHora2.setBounds(70, 55, 70, 20);

        lblHora1.setForeground(new java.awt.Color(255, 255, 255));
        lblHora1.setText("HORA:");
        getContentPane().add(lblHora1);
        lblHora1.setBounds(30, 55, 40, 20);

        lblFecha2.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha2.setText("FECHA:");
        getContentPane().add(lblFecha2);
        lblFecha2.setBounds(30, 80, 40, 20);

        lblFecha1.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha1.setText("fecha");
        getContentPane().add(lblFecha1);
        lblFecha1.setBounds(70, 80, 70, 20);

        lblHoraFechaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblHoraFechaFondo);
        lblHoraFechaFondo.setBounds(20, 50, 123, 56);

        btnLogo.setBackground(new java.awt.Color(255, 255, 255));
        btnLogo.setText("Cambiar Logo del Bando");
        btnLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogo);
        btnLogo.setBounds(380, 360, 300, 23);

        lblLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblLogo);
        lblLogo.setBounds(380, 50, 300, 300);

        lblCantidad.setBackground(new java.awt.Color(255, 255, 255));
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidad.setText("Cambiar Numero de Cajas");
        lblCantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblCantidad.setOpaque(true);
        getContentPane().add(lblCantidad);
        lblCantidad.setBounds(20, 230, 200, 24);

        jspCantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        jspCantidad.setToolTipText("");
        jspCantidad.setRequestFocusEnabled(false);
        getContentPane().add(jspCantidad);
        jspCantidad.setBounds(20, 260, 200, 20);
        jspCantidad.getAccessibleContext().setAccessibleParent(jspCantidad);

        btnNombre.setBackground(new java.awt.Color(255, 255, 255));
        btnNombre.setText("Cambiar Nombre del Banco");
        btnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreActionPerformed(evt);
            }
        });
        getContentPane().add(btnNombre);
        btnNombre.setBounds(20, 140, 200, 23);

        BarraNombre.setViewportView(txtNombre);

        getContentPane().add(BarraNombre);
        BarraNombre.setBounds(20, 170, 350, 50);

        btnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Confirmar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(20, 350, 160, 40);

        lblFondoMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/bgPrincipal.png"))); // NOI18N
        lblFondoMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFondoMenu.setIconTextGap(0);
        getContentPane().add(lblFondoMenu);
        lblFondoMenu.setBounds(0, -5, 700, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que permite cambiar el nombre del Banco
     * @param evt 
     */
    private void btnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreActionPerformed
        //Valida que el nombre no este vacío
        if(!"".equals(txtNombre.getText())){
            lblSubtitulo.setText(txtNombre.getText());
            this.setTitle(txtNombre.getText());
        }
    }//GEN-LAST:event_btnNombreActionPerformed

    /**
     * Método que permite asignar un logo a la empresa.
     * @param evt 
     */
    private void btnLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoActionPerformed
        JFileChooser elemento = new JFileChooser();  //Crea un objeto de dialogo JFileChooser

        //Formatos de los iconos
        elemento.setFileFilter(new FileNameExtensionFilter("Archivo JPG","jpg"));
        elemento.setFileFilter(new FileNameExtensionFilter("Archivo PNG","png"));
        elemento.setFileFilter(new FileNameExtensionFilter("Archivo GIF","gif"));
        
        //Variable que va a buscar la foto y almacenar la direccion
        int option = elemento.showOpenDialog(this);
        
        //Valida si se seleccionó alguna imagen
        if (option == JFileChooser.APPROVE_OPTION){
            try {
                //Obtener ruta y nombre al hacer click
                String file = elemento.getSelectedFile().getPath();  
                Direccion = file;
                
                //Convierte la imagen
                ImageIcon fot = new ImageIcon(file); 
                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(400, 
                        400, Image.SCALE_DEFAULT));
                
                //Asigna la imagen
                lblLogo.setIcon(icono); 
            } catch (Exception ex) {}
        }
        this.repaint();                                  
    }//GEN-LAST:event_btnLogoActionPerformed

    /**
     * Método que va a confirmar los datos que se seleccionaron
     * @param evt 
     */
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (jspCantidad.getValue().equals(0)){
            JOptionPane.showMessageDialog(null,"Debe haber más de 1 caja");   
        } else if (lblSubtitulo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Nombre incorrecto");   
        } else if (Direccion.equals("")) {
            JOptionPane.showMessageDialog(null,"Logo incorrecto");
        } else {
            
            if (JOptionPane.showConfirmDialog(null,
                    "¿Desea Guardar los siguientes elementos?\n"
                    + "Nombre: " + lblSubtitulo.getText()
                    + "Logo: " + Direccion
                    + "Cajas: " + jspCantidad.getValue()) == JOptionPane.OK_OPTION){

                Pa.setCajas((int) jspCantidad.getValue());
                Pa.setNombreBanco(txtNombre.getText());
                Pa.setFotoBanco(Direccion);

                VentanaPrincipal VT = new VentanaPrincipal();
                VT.show();
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "Reintente su modificación "
                        + "de datos");
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConfiguracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaConfiguracion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BarraNombre;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnLogo;
    private javax.swing.JButton btnNombre;
    private javax.swing.JSpinner jspCantidad;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblFondoMenu;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblHora2;
    private javax.swing.JLabel lblHoraFechaFondo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JTextPane txtNombre;
    // End of variables declaration//GEN-END:variables
}
