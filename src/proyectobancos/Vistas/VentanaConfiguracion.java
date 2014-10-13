
import java.awt.Color;
import java.awt.Image;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyectobancos.Administradores.Reloj;
import proyectobancos.Vistas.VentanaPrincipal;
import static proyectobancos.Vistas.VentanaRegistroClientes.Cajas;
import static proyectobancos.Vistas.VentanaRegistroClientes.DisponibilidadCajas;
//import java.awt.BuferredImage;

public class VentanaConfiguracion extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public VentanaConfiguracion() {
        
                     
        initComponents();
        this.setLocationRelativeTo(null);
        //getContentPane().setBackground(new java.awt.Color(229,55,55));
        NombreVentana.setBackground(Color.white);
        NombreVentana.setOpaque(true);
        setResizable(false);
        
        Reloj hora = new Reloj(jLabel1);
        hora.start();
        Calendar Cal= Calendar.getInstance();
        String fec= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        jLabel2.setText(fec);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreVentana = new javax.swing.JLabel();
        BtncambiarLogo = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        EtiquetaCantidadDeCajas = new javax.swing.JLabel();
        CantidadCajas = new javax.swing.JSpinner();
        BtnCambiarNombre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtNombre = new javax.swing.JTextPane();
        BtnAceptar = new javax.swing.JButton();
        BtnPredeterminado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BAC San Jose");
        setBackground(new java.awt.Color(242, 36, 36));
        setFocusCycleRoot(false);

        NombreVentana.setBackground(new java.awt.Color(255, 255, 255));
        NombreVentana.setFont(new java.awt.Font("Candara", 1, 28)); // NOI18N
        NombreVentana.setForeground(new java.awt.Color(229, 55, 55));
        NombreVentana.setText("Atención a Clientes BAC");

        BtncambiarLogo.setText("Cambiar Logo");
        BtncambiarLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncambiarLogoActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/unnamed.gif"))); // NOI18N

        EtiquetaCantidadDeCajas.setForeground(new java.awt.Color(254, 254, 254));
        EtiquetaCantidadDeCajas.setText("Numero de Cajas:");

        CantidadCajas.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        CantidadCajas.setToolTipText("");

        BtnCambiarNombre.setText("Cambiar Nombre");
        BtnCambiarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCambiarNombreActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(TxtNombre);

        BtnAceptar.setText("Ingresar");
        BtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAceptarActionPerformed(evt);
            }
        });

        BtnPredeterminado.setText("Predeterminado");
        BtnPredeterminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPredeterminadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Hora:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Hora:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("fecha");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtncambiarLogo)
                        .addGap(85, 546, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnCambiarNombre)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnPredeterminado)
                                    .addComponent(CantidadCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EtiquetaCantidadDeCajas)
                        .addGap(85, 85, 85))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo))
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(BtnAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NombreVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtncambiarLogo)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EtiquetaCantidadDeCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CantidadCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BtnPredeterminado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnCambiarNombre)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(BtnAceptar)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        CantidadCajas.getAccessibleContext().setAccessibleParent(CantidadCajas);

        setBounds(0, 0, 718, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPredeterminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPredeterminadoActionPerformed
        // TODO add your handling code here:
        NombreVentana.setText("Atención al Cliente, BAC");
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/unnamed.gif")));
        imagen = System.getProperty("user.dir")+"/proyectobancos/Imagenes/unnamed.gif";
        this.setTitle("Mi Banco");
        imagen = "/proyectobancos/Imagenes/unnamed.gif";
        texto = "Atención a Clientes, BAC";
    }//GEN-LAST:event_BtnPredeterminadoActionPerformed

    private void BtnCambiarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCambiarNombreActionPerformed
        // TODO add your handling code here:  
        if("".equals(TxtNombre.getText())){}
        else{
            NombreVentana.setText(TxtNombre.getText());
            this.setTitle(TxtNombre.getText());
            texto = TxtNombre.getText();
            TxtNombre.setText("");
            
        }
            
        
    }//GEN-LAST:event_BtnCambiarNombreActionPerformed

    private void BtncambiarLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncambiarLogoActionPerformed
        // TODO add your handling code here:
        //Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("\\Imagenes\\wallpaper-1133041.jpg")));
        JFileChooser elemento = new JFileChooser();  //Crea un objeto de dialogo JFileChooser
        elemento.setFileFilter(png);
        elemento.setFileFilter(gif);
        elemento.setFileFilter(jpg);
        int option = elemento.showOpenDialog(this);  // Abre la ventana en dialogo
        if (option == JFileChooser.APPROVE_OPTION){
            try {
                String file = elemento.getSelectedFile().getPath();  //Obtener ruta y nombre al hacer click
                ImageIcon fot = new ImageIcon(file); 
                Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Logo.getWidth(), Logo.getHeight(), Image.SCALE_DEFAULT)); 
                Logo.setIcon(icono); 
                this.repaint();
                imagen = file;
                
            } catch (Exception ex) {
                Logger.getLogger(VentanaConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
                                            
    }//GEN-LAST:event_BtncambiarLogoActionPerformed

    private void BtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAceptarActionPerformed
        // TODO add your handling code here:
        if (CantidadCajas.getValue().equals(0)){
            JOptionPane.showMessageDialog(null,"Seleccione una cantidad de cajas permitida");   
        }
        
        else{
            //System.out.print(CantidadCajas.getValue());
            cantidadCajas = (int) CantidadCajas.getValue();
            for(int i=1;i<=cantidadCajas;i++){
                Cajas.add(""+i);
                DisponibilidadCajas.add(""+0);
            }
            //VentanaConfiguracion Menu = new VentanaConfiguracion ();
            //Menu.setVisible(true);
            hide(); 
        }
    }//GEN-LAST:event_BtnAceptarActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptar;
    private javax.swing.JButton BtnCambiarNombre;
    private javax.swing.JButton BtnPredeterminado;
    private javax.swing.JButton BtncambiarLogo;
    private javax.swing.JSpinner CantidadCajas;
    private javax.swing.JLabel EtiquetaCantidadDeCajas;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreVentana;
    private javax.swing.JTextPane TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private static final FileNameExtensionFilter jpg = new FileNameExtensionFilter("Archivo JPG","jpg");
    private static final FileNameExtensionFilter png = new FileNameExtensionFilter("Archivo PNG","png");
    private static final FileNameExtensionFilter gif = new FileNameExtensionFilter("Archivo GIF","gif");
    public static String imagen = System.getProperty("user.dir")+"/proyectobancos/Imagenes/unnamed.gif";
    public static String texto = "Atención al Cliente, BAC";
    public static int cantidadCajas;
    public static String Dato;

    
}
