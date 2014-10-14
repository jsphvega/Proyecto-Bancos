package proyectobancos.Vistas;

import java.awt.Color;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import proyectobancos.Administradores.*;
import proyectobancos.Administradores.estructuras.*;
import proyectobancos.Constantes.Parametros;

/**
 * Clase que va a mostrar la ventana de tablas y permite ordenarlo según lo
 * desee el usuario.
 *
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public final class VentanaTabla extends javax.swing.JFrame {

    //Permite crear una tabla generica para modificar datos facilmente
    DefaultTableModel Ordenamientos = new DefaultTableModel();

    //Clase que contiene los parámetros de la clase
    Parametros Pa = new Parametros();

    //AdministradorPrincipal LSE = new AdministradorPrincipal();
    /**
     * Método constructor de la clase.
     */
    public VentanaTabla() {
        initComponents();
        setInfoBancos();
        setVentana();
        Asignar();
    }

    /**
     * Método que asigna el titulo y el logo.
     */
    private void setInfoBancos() {
        this.setTitle(Pa.getTitle());
        this.setIconImage(Pa.getIcon());
    }

    /**
     * Método que permite asignar los datos de la lista en la tabla para su
     * visualización.
     */
    public void Asignar() {

        Object[] Ob = new Object[5];
        NodoGenericoSimple<ClienteComparable> NGS
                = AdministradorPrincipal.getInstance().getListaClientes().obtenerPrimero();

        System.out.println("Actualizando tabla");
        
        while (NGS != null) {
            
            System.out.println(NGS.getElement().toString());
            
            Ob[0] = NGS.getElement().getNombre();
            
            System.out.println("NOMBRE: " + NGS.getElement().getNombre());
            Ob[1] = NGS.getElement().getCorreo();
            Ob[2] = NGS.getElement().getPrioridad();
            Ob[3] = NGS.getElement().getFecha();
            Ob[4] = NGS.getElement().getHora();
            Ordenamientos.addRow(Ob);
            NGS = NGS.getNext();
        }
    }

    /**
     * Método que controla la fecha y la hora del sistema en tiempo real.
     */
    private void setVentana() {
        //Procesos de calculo de la fecha
        Calendar Cal = Calendar.getInstance();
        lblFecha1.setText(Cal.get(Calendar.DATE) + "/" + (Cal.get(Calendar.MONTH) + 1)
                + "/" + Cal.get(Calendar.YEAR));

        //Procesos de calculo de la hora en tiempo real
        Reloj hora = new Reloj(lblHora2);
        hora.start();

        //Se modifica la Tabla
        BarraTablaEstadistica.setOpaque(false);
        BarraTablaEstadistica.getViewport().setOpaque(false);
        tblTablaEstadistica.setBackground(new Color(0, 0, 0, 100));
    }

    /**
     * Método que va a extraer los datos de la tabla, los ordena y los vuelve a
     * asignar en la misma tabla.
     *
     * @param Titulo = lleva el tipo de busqueda que se va a realizar
     * @param Columna = lleva el numero de la columna de la tabla por ordenar
     */
    public void Ordenamiento(String Titulo, int Columna) {
        //Asigna en la tabla generica para modificar datos facilmente
        Ordenamientos = (DefaultTableModel) tblTablaEstadistica.getModel();

        //Asigna la columna de ordenamineto
        Parametros.setTipoBusqueda(Titulo);
        lblBusqueda.setText(Titulo);

        //Arreglo que va a contener todos los datos de la tabla
        Object[][] Tabla = new String[tblTablaEstadistica.getRowCount()][5];

        //Ciclo que almacena los datos de la tabla en la lista
        for (int i = 0; i < Tabla.length; i++) {
            for (int j = 0; j < 5; j++) {
                Tabla[i][j] = tblTablaEstadistica.getValueAt(i, j);
            }
        }

        //llama al metodo de ordenamiento
        MergeSort mg = new MergeSort(Tabla, Columna);
        Tabla = mg.getArreglo();

        //Ciclo qur asigna cada campo a la tabla
        for (Object[] Order : Tabla) {
            Ordenamientos.removeRow(0);
            Ordenamientos.addRow(Order);
        }

        //asigna la tabla generica a la tabla original
        tblTablaEstadistica.setModel(Ordenamientos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHora2 = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        lblFecha2 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        lblHoraFechaFondo = new javax.swing.JLabel();
        lblSubTitulo = new javax.swing.JLabel();
        lblCambio = new javax.swing.JLabel();
        lblBusqueda = new javax.swing.JLabel();
        lblFondoBusqueda = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        BarraTablaEstadistica = new javax.swing.JScrollPane();
        tblTablaEstadistica = new javax.swing.JTable();
        lblFondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 470));
        setMinimumSize(new java.awt.Dimension(700, 470));
        setPreferredSize(new java.awt.Dimension(700, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        lblHora2.setForeground(new java.awt.Color(255, 255, 255));
        lblHora2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora2.setText("hora");
        getContentPane().add(lblHora2);
        lblHora2.setBounds(55, 15, 70, 20);

        lblHora1.setForeground(new java.awt.Color(255, 255, 255));
        lblHora1.setText("HORA:");
        getContentPane().add(lblHora1);
        lblHora1.setBounds(15, 15, 40, 20);

        lblFecha2.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha2.setText("FECHA:");
        getContentPane().add(lblFecha2);
        lblFecha2.setBounds(15, 40, 40, 20);

        lblFecha1.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha1.setText("fecha");
        getContentPane().add(lblFecha1);
        lblFecha1.setBounds(55, 40, 70, 20);

        lblHoraFechaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblHoraFechaFondo);
        lblHoraFechaFondo.setBounds(8, 10, 123, 56);

        lblSubTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblSubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTitulo.setText("Tabla de Estadisticas");
        getContentPane().add(lblSubTitulo);
        lblSubTitulo.setBounds(160, 15, 331, 44);

        lblCambio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/cambiarTipoBusqueda.fw.png"))); // NOI18N
        lblCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCambioMouseReleased(evt);
            }
        });
        getContentPane().add(lblCambio);
        lblCambio.setBounds(630, 10, 61, 56);

        lblBusqueda.setBackground(new java.awt.Color(0, 0, 0));
        lblBusqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        lblBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBusqueda.setText("Nombre");
        getContentPane().add(lblBusqueda);
        lblBusqueda.setBounds(515, 13, 115, 50);

        lblFondoBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        lblFondoBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblFondoBusqueda);
        lblFondoBusqueda.setBounds(510, 10, 123, 56);

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Volver al menú");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(570, 410, 120, 23);

        tblTablaEstadistica.setForeground(new java.awt.Color(255, 255, 255));
        tblTablaEstadistica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Correo", "Prioridad", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTablaEstadistica.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tblTablaEstadistica.setGridColor(new java.awt.Color(0, 0, 0));
        tblTablaEstadistica.setOpaque(false);
        tblTablaEstadistica.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblTablaEstadistica.getTableHeader().setReorderingAllowed(false);
        BarraTablaEstadistica.setViewportView(tblTablaEstadistica);

        getContentPane().add(BarraTablaEstadistica);
        BarraTablaEstadistica.setBounds(10, 80, 680, 320);

        lblFondoMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/bgPrincipal.png"))); // NOI18N
        lblFondoMenu.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFondoMenu.setIconTextGap(0);
        getContentPane().add(lblFondoMenu);
        lblFondoMenu.setBounds(0, -5, 700, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que permite volver al menú principal.
     *
     * @param evt
     */
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * Método que permite revisar cual columna se necesita ordenar
     *
     * @param evt
     */
    private void lblCambioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambioMouseReleased
        //Condicion que valida se se ordena por Nombre
        if (Pa.getTipoBusqueda().equals("Hora")) {
            Ordenamiento("Nombre", 0);

            //Condicion que valida se se ordena por Correo
        } else if (Pa.getTipoBusqueda().equals("Nombre")) {
            Ordenamiento("Correo", 1);

            //Condicion que valida se se ordena por Prioridad   
        } else if (Pa.getTipoBusqueda().equals("Correo")) {
            Ordenamiento("Prioridad", 2);

            //Condicion que valida se se ordena por Fecha   
        } else if (Pa.getTipoBusqueda().equals("Prioridad")) {
            Ordenamiento("Fecha", 3);

            //Condicion que valida se se ordena por Hora
        } else if (Pa.getTipoBusqueda().equals("Fecha")) {
            Ordenamiento("Hora", 4);
        }
    }//GEN-LAST:event_lblCambioMouseReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaTabla().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BarraTablaEstadistica;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblFondoBusqueda;
    private javax.swing.JLabel lblFondoMenu;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblHora2;
    private javax.swing.JLabel lblHoraFechaFondo;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JTable tblTablaEstadistica;
    // End of variables declaration//GEN-END:variables
}
