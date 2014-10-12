package proyectobancos.Vistas;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar; //Importa el calendario
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel; //Importa modelo genérico de tablas.

import proyectobancos.Constantes.Parametros; 
import proyectobancos.Administradores.Reloj;

/**
 * Clase que va a mostrar la ventana principal de acuerdo a las configuraciones 
 * que el usuario le asigna al comienzo o durante la ejecución.
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public final class VentanaPrincipal extends javax.swing.JFrame {
    
    //Clase que contiene los parámetros de la clase
    Parametros pa = new Parametros();
    
    //Permite crear una tabla generica para modificar datos facilmente
    DefaultTableModel CajaEmpleados = new DefaultTableModel();
    
//    Date hoy = new Date();
//            SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
//            hoy.setMinutes(hoy.getMinutes() + 1);
//            lblVentana3.setText(s.format(hoy));
    
    /**
     * Método constructor de la clase
     */
    public VentanaPrincipal() { 
        initComponents();
        
        TiempoVentana(); //Asigna la hora y fecha del sistema
        InicioTablaClientes(); //Inicializa la tabla con las cajas disponibles
        FotoTituloVentana(); //Asigna el titulo y el logo    
    }
    
    /**
     * Método que asigna el titulo y el logo
     */
    public void FotoTituloVentana(){
        this.setTitle(pa.getNombreBanco().toUpperCase() + ", bienvenidos!!");
        try {
            ImageIcon icon = new ImageIcon(pa.getFotoBanco());
            Icon icono = new ImageIcon(icon.getImage()
                    .getScaledInstance(150, 150, Image.SCALE_DEFAULT));
            lblLogo.setIcon(icono);
        } catch (Exception ex) { }
    }
    
    /**
     * Método que controla la fecha y la hora del sistema en tiempo real
     */
    public final void TiempoVentana(){
        //Procesos de calculo de la fecha
        Calendar Cal= Calendar.getInstance();
        lblFecha.setText(Cal.get(Calendar.DATE) + "/" + (Cal.get(Calendar.MONTH)+1)
                + "/" + Cal.get(Calendar.YEAR));
        
        //Procesos de calculo de la hora en tiempo real
        Reloj hora = new Reloj(lblHora);
        hora.start();
    }
    
    /**
     * Método que inicializa la tabla con las cajas correspondientes
     */
    private void InicioTablaClientes(){
        CajaEmpleados = (DefaultTableModel) tblCajaEmpleados.getModel();
        
        //Crea un arreglo de tipo objeto para asignar a la tabla
        Object[] Dato = new Object[3];        
        Dato[2] = false;
        
        //Ciclo qur asigna cada campo a la tabla
        for (int i = 1; i <= pa.getCajas(); i++){
            Dato[0] = i;
            CajaEmpleados.addRow(Dato);        
        }
        
        tblCajaEmpleados.setModel(CajaEmpleados);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblHoraTitulo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblFechaTitulo = new javax.swing.JLabel();
        btnLiberar = new javax.swing.JButton();
        lblTiquete = new javax.swing.JLabel();
        lblVentana1 = new javax.swing.JLabel();
        lblVentana2 = new javax.swing.JLabel();
        lblVentana3 = new javax.swing.JLabel();
        lblVentana4 = new javax.swing.JLabel();
        lblVentana5 = new javax.swing.JLabel();
        lblVentana6 = new javax.swing.JLabel();
        lblVentana7 = new javax.swing.JLabel();
        lblVentana8 = new javax.swing.JLabel();
        Caja = new javax.swing.JScrollPane();
        tblCajaEmpleados = new javax.swing.JTable();
        lblFondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setMaximumSize(new java.awt.Dimension(700, 465));
        setMinimumSize(new java.awt.Dimension(700, 465));
        setResizable(false);
        getContentPane().setLayout(null);

        lblLogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblLogo);
        lblLogo.setBounds(540, 10, 150, 150);

        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora.setText("hora");
        getContentPane().add(lblHora);
        lblHora.setBounds(55, 10, 70, 20);

        lblHoraTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblHoraTitulo.setText("HORA:");
        getContentPane().add(lblHoraTitulo);
        lblHoraTitulo.setBounds(15, 10, 40, 20);

        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha.setText("fecha");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(55, 35, 70, 20);

        lblFechaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaTitulo.setText("FECHA:");
        getContentPane().add(lblFechaTitulo);
        lblFechaTitulo.setBounds(15, 35, 40, 20);

        btnLiberar.setBackground(new java.awt.Color(255, 204, 51));
        btnLiberar.setText("Liberar Cajas");
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLiberar);
        btnLiberar.setBounds(540, 170, 150, 30);

        lblTiquete.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTiquete.setForeground(new java.awt.Color(255, 255, 255));
        lblTiquete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiquete.setText("Tiquete");
        lblTiquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTiquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTiqueteMouseReleased(evt);
            }
        });
        getContentPane().add(lblTiquete);
        lblTiquete.setBounds(20, 300, 220, 120);

        lblVentana1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblVentana1);
        lblVentana1.setBounds(8, 5, 123, 56);

        lblVentana2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoTransparente.png"))); // NOI18N
        getContentPane().add(lblVentana2);
        lblVentana2.setBounds(10, 290, 246, 140);

        lblVentana3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVentana3.setForeground(new java.awt.Color(255, 255, 255));
        lblVentana3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentana3.setText("Configuración");
        lblVentana3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVentana3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblVentana3MouseReleased(evt);
            }
        });
        getContentPane().add(lblVentana3);
        lblVentana3.setBounds(137, 10, 110, 42);

        lblVentana4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblVentana4);
        lblVentana4.setBounds(130, 5, 123, 56);

        lblVentana5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVentana5.setForeground(new java.awt.Color(255, 255, 255));
        lblVentana5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentana5.setText("Gráficos");
        lblVentana5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVentana5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblVentana5MouseReleased(evt);
            }
        });
        getContentPane().add(lblVentana5);
        lblVentana5.setBounds(137, 65, 110, 42);

        lblVentana6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblVentana6);
        lblVentana6.setBounds(130, 60, 123, 56);

        lblVentana7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblVentana7.setForeground(new java.awt.Color(255, 255, 255));
        lblVentana7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentana7.setText("Tabla Dinámica");
        lblVentana7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVentana7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblVentana7MouseReleased(evt);
            }
        });
        getContentPane().add(lblVentana7);
        lblVentana7.setBounds(13, 65, 110, 42);

        lblVentana8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblVentana8);
        lblVentana8.setBounds(8, 60, 123, 56);

        Caja.setEnabled(false);

        tblCajaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Caja #", "Ficha", "Libre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCajaEmpleados.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tblCajaEmpleados.setGridColor(new java.awt.Color(255, 204, 51));
        tblCajaEmpleados.setSelectionBackground(new java.awt.Color(255, 204, 51));
        tblCajaEmpleados.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Caja.setViewportView(tblCajaEmpleados);
        if (tblCajaEmpleados.getColumnModel().getColumnCount() > 0) {
            tblCajaEmpleados.getColumnModel().getColumn(0).setResizable(false);
            tblCajaEmpleados.getColumnModel().getColumn(1).setResizable(false);
            tblCajaEmpleados.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(Caja);
        Caja.setBounds(540, 200, 150, 235);

        lblFondoMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoPrincipal.jpg"))); // NOI18N
        lblFondoMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFondoMenu.setIconTextGap(0);
        getContentPane().add(lblFondoMenu);
        lblFondoMenu.setBounds(0, -5, 700, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblTiqueteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTiqueteMouseReleased
        //Aqui llama lo de miller
    }//GEN-LAST:event_lblTiqueteMouseReleased

    private void lblVentana3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVentana3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVentana3MouseReleased

    private void lblVentana5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVentana5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVentana5MouseReleased

    private void lblVentana7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVentana7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVentana7MouseReleased

    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        
    }//GEN-LAST:event_btnLiberarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Caja;
    private javax.swing.JButton btnLiberar;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFechaTitulo;
    private javax.swing.JLabel lblFondoMenu;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblHoraTitulo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTiquete;
    private javax.swing.JLabel lblVentana1;
    private javax.swing.JLabel lblVentana2;
    private javax.swing.JLabel lblVentana3;
    private javax.swing.JLabel lblVentana4;
    private javax.swing.JLabel lblVentana5;
    private javax.swing.JLabel lblVentana6;
    private javax.swing.JLabel lblVentana7;
    private javax.swing.JLabel lblVentana8;
    private javax.swing.JTable tblCajaEmpleados;
    // End of variables declaration//GEN-END:variables
}
