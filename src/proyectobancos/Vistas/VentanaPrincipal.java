package proyectobancos.Vistas;

import java.awt.Image;
import java.util.Calendar; //Importa el calendario
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
public class VentanaPrincipal extends javax.swing.JFrame {
    
    //Clase que contiene los parámetros de la clase
    Parametros pa = new Parametros();
    
    //Permite crear una tabla generica para modificar datos facilmente
    DefaultTableModel CajaEmpleados = new DefaultTableModel();
    
    /**
     * Método xonstructor de la clase
     */
    public VentanaPrincipal() { 
        initComponents();
        
        TiempoVentana(); //Asigna la hora y fecha del sistema
        InicioTablaClientes(); //Inicializa la tabla con las cajas disponibles
        
        //Asigna el titulo y el logo
        this.setTitle(pa.getNombreBanco().toUpperCase() + ", bienvenidos!!");
        try {
            ImageIcon icon = new ImageIcon(pa.getFotoBanco());
            Icon icono = new ImageIcon(icon.getImage()
                    .getScaledInstance(100, 100, Image.SCALE_DEFAULT));
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
        lblFecha = new javax.swing.JLabel();
        lblHoraTitulo = new javax.swing.JLabel();
        lblFechaTitulo = new javax.swing.JLabel();
        btnLiberar = new javax.swing.JButton();
        Caja = new javax.swing.JScrollPane();
        tblCajaEmpleados = new javax.swing.JTable();
        lblFondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setMaximumSize(new java.awt.Dimension(730, 440));
        setMinimumSize(new java.awt.Dimension(730, 440));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(lblLogo);
        lblLogo.setBounds(10, 10, 100, 100);

        lblHora.setForeground(new java.awt.Color(255, 255, 0));
        lblHora.setText("hora");
        getContentPane().add(lblHora);
        lblHora.setBounds(410, 320, 70, 30);

        lblFecha.setForeground(new java.awt.Color(255, 255, 0));
        lblFecha.setText("fecha");
        getContentPane().add(lblFecha);
        lblFecha.setBounds(380, 360, 70, 30);

        lblHoraTitulo.setForeground(new java.awt.Color(255, 255, 0));
        lblHoraTitulo.setText("HORA:");
        getContentPane().add(lblHoraTitulo);
        lblHoraTitulo.setBounds(340, 320, 40, 30);

        lblFechaTitulo.setForeground(new java.awt.Color(255, 255, 0));
        lblFechaTitulo.setText("FECHA:");
        getContentPane().add(lblFechaTitulo);
        lblFechaTitulo.setBounds(330, 360, 40, 30);

        btnLiberar.setBackground(new java.awt.Color(255, 204, 51));
        btnLiberar.setText("Liberar Cajas");
        getContentPane().add(btnLiberar);
        btnLiberar.setBounds(580, 0, 150, 30);

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
        Caja.setBounds(580, 30, 150, 410);

        lblFondoMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoPrincipal.jpg"))); // NOI18N
        lblFondoMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFondoMenu.setIconTextGap(0);
        getContentPane().add(lblFondoMenu);
        lblFondoMenu.setBounds(-55, -5, 640, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JTable tblCajaEmpleados;
    // End of variables declaration//GEN-END:variables
}
