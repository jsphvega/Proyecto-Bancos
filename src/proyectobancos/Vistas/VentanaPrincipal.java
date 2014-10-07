package proyectobancos.Vistas;

import java.util.Calendar;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import proyectobancos.Constantes.Parametros;
import proyectobancos.Administradores.Reloj;


/**
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    Parametros pa = new Parametros();
    DefaultTableModel CajaEmpleados = new DefaultTableModel();
    
    public VentanaPrincipal() { 
        initComponents();
        
        lblTitulo.setText((String) pa.getNombreBanco());
        InicioTablaClientes();
        
        Reloj hora = new Reloj(jLabel1);
        hora.start();
        Calendar Cal= Calendar.getInstance();
        String fecha= Cal.get(Cal.DATE)+"/"+(Cal.get(Cal.MONTH)+1)+"/"+Cal.get(Cal.YEAR);
        jLabel2.setText(fecha);
       
    }

    private void InicioTablaClientes(){
        CajaEmpleados = (DefaultTableModel) tblCajaEmpleados.getModel();
        
        Object[] Dato = new Object[2];        
        Dato[1] = true;
        
        for (int i = 1; i <= pa.getCajas(); i++){
            Dato[0] = i;
            CajaEmpleados.addRow(Dato);        
        }
        
        tblCajaEmpleados.setModel(CajaEmpleados);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Caja = new javax.swing.JScrollPane();
        tblCajaEmpleados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setMinimumSize(new java.awt.Dimension(690, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("hora");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(620, 50, 70, 30);

        Caja.setEnabled(false);

        tblCajaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Caja #", "Libre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCajaEmpleados.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tblCajaEmpleados.setGridColor(new java.awt.Color(0, 102, 255));
        tblCajaEmpleados.setSelectionBackground(new java.awt.Color(0, 102, 255));
        Caja.setViewportView(tblCajaEmpleados);
        if (tblCajaEmpleados.getColumnModel().getColumnCount() > 0) {
            tblCajaEmpleados.getColumnModel().getColumn(0).setResizable(false);
            tblCajaEmpleados.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(Caja);
        Caja.setBounds(0, 0, 100, 440);

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("fecha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(620, 80, 70, 30);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(100, 0, 590, 50);

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("HORA:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(570, 50, 40, 30);

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("FECHA:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(570, 80, 40, 30);

        lblFondoMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoPrincipal.jpg"))); // NOI18N
        lblFondoMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFondoMenu.setIconTextGap(0);
        getContentPane().add(lblFondoMenu);
        lblFondoMenu.setBounds(45, -5, 700, 450);

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFondoMenu;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblCajaEmpleados;
    // End of variables declaration//GEN-END:variables
}
