package proyectobancos.Vistas;

import java.util.Calendar; //Importa el calendario
import javax.swing.JOptionPane;
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
    Parametros Pa = new Parametros();
    
    //Permite crear una tabla generica para modificar datos facilmente
    DefaultTableModel CajaEmpleados = new DefaultTableModel();
    
    /**
     * Método constructor de la clase.
     */
    public VentanaPrincipal() { 
        initComponents();
        
        setTiempoVentana(); //Asigna la hora y fecha del sistema
        InicioTablaClientes(); //Inicializa la tabla con las cajas disponibles
        setInfoBancos(); //Asigna el titulo y el logo 
    }
    
    /**
     * Método que se encarga de asignar en la lista un nuevo valor.
     */
    private String AsignarUsuarios(){
        /**
         * LUUUUUUUUUUUUUCCCCCCCCCCIIIIIIIIIIIIIIIIIIIIIAAAAAAAAAAAAAA
         * necesito que aqui ud vaya a consultar las 5 listas y si existe alguen 
         * en espera que me lo retorne. si no existe nadie solo envia null 
         * porque la tabla misma deja ese campo en vacío.
         */
        return null;
    }
    
    /**
     * Método que asigna el titulo y el logo.
     */
    private void setInfoBancos(){
        this.setTitle(Pa.getNombreBanco().toUpperCase() + ", bienvenidos!!");
    }
    
    /**
     * Método que controla la fecha y la hora del sistema en tiempo real.
     */
    private void setTiempoVentana(){
        //Procesos de calculo de la fecha
        Calendar Cal= Calendar.getInstance();
        lblFecha1.setText(Cal.get(Calendar.DATE) + "/" + (Cal.get(Calendar.MONTH)+1)
                + "/" + Cal.get(Calendar.YEAR));
        
        //Procesos de calculo de la hora en tiempo real
        Reloj hora = new Reloj(lblHora2);
        hora.start();
    }
    
    /**
     * Método que inicializa la tabla con las cajas correspondientes.
     */
    private void InicioTablaClientes(){
        CajaEmpleados = (DefaultTableModel) tblCajaEmpleados.getModel();
        
        //Crea un arreglo de tipo objeto para asignar a la tabla
        Object[] Dato = new Object[3];        
        Dato[2] = false;
        
        //Ciclo qur asigna cada campo a la tabla
        for (int i = 1; i <= Pa.getCajas(); i++){
            Dato[0] = i;
            CajaEmpleados.addRow(Dato);        
        }
        
        tblCajaEmpleados.setModel(CajaEmpleados);
    }
    
    /**
     * Método que libera los datos de la tabla para dejar ingresar mas usuarios.
     */
    private void LiberarTabla(){
        
        //Ciclo que revisa cada campo de la tabla para comprobar si lo libera.
        for (int i=0; i<Pa.getCajas(); i++){
            
            //Almacena el dato de la columna "Libre"
            String Check = String.valueOf(tblCajaEmpleados.getValueAt(i, 2));
            
            //Condicion que revisa si la fila se debe liberar
            if (Boolean.parseBoolean(Check)){
                String Dato = AsignarUsuarios();
                
                //llama al proceso de nuevos clientes
                tblCajaEmpleados.setValueAt(Dato, i, 1);
                
                if (Dato != null){
                    //Asigna en False de nuevo la fila
                    tblCajaEmpleados.setValueAt(false, i, 2);
                }
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListaClientes = new javax.swing.JLabel();
        lblLista1 = new javax.swing.JLabel();
        lblLista2 = new javax.swing.JLabel();
        lblLista3 = new javax.swing.JLabel();
        lblHora1 = new javax.swing.JLabel();
        lblHora2 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        lblFecha2 = new javax.swing.JLabel();
        lblHoraFechaFondo = new javax.swing.JLabel();
        lblConfiguracion = new javax.swing.JLabel();
        lblFondoConfiguracion = new javax.swing.JLabel();
        lblGraficos = new javax.swing.JLabel();
        lblFondoGraficos = new javax.swing.JLabel();
        lblTabla = new javax.swing.JLabel();
        lblFondoTabla = new javax.swing.JLabel();
        lblTiquete = new javax.swing.JLabel();
        lblFondoTiquete = new javax.swing.JLabel();
        btnLiberar = new javax.swing.JButton();
        Caja = new javax.swing.JScrollPane();
        tblCajaEmpleados = new javax.swing.JTable();
        lblFondoMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setMaximumSize(new java.awt.Dimension(700, 445));
        setMinimumSize(new java.awt.Dimension(700, 445));
        setResizable(false);
        getContentPane().setLayout(null);

        lblListaClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblListaClientes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblListaClientes);
        lblListaClientes.setBounds(295, 30, 210, 360);
        lblListaClientes.getAccessibleContext().setAccessibleName("");

        lblLista1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoTransparente.png"))); // NOI18N
        getContentPane().add(lblLista1);
        lblLista1.setBounds(280, 10, 246, 140);

        lblLista2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoTransparente.png"))); // NOI18N
        getContentPane().add(lblLista2);
        lblLista2.setBounds(280, 139, 246, 140);

        lblLista3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoTransparente.png"))); // NOI18N
        getContentPane().add(lblLista3);
        lblLista3.setBounds(280, 268, 246, 140);

        lblHora1.setForeground(new java.awt.Color(255, 255, 255));
        lblHora1.setText("HORA:");
        getContentPane().add(lblHora1);
        lblHora1.setBounds(15, 10, 40, 20);

        lblHora2.setForeground(new java.awt.Color(255, 255, 255));
        lblHora2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHora2.setText("hora");
        getContentPane().add(lblHora2);
        lblHora2.setBounds(55, 10, 70, 20);

        lblFecha1.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFecha1.setText("fecha");
        getContentPane().add(lblFecha1);
        lblFecha1.setBounds(55, 35, 70, 20);

        lblFecha2.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha2.setText("FECHA:");
        getContentPane().add(lblFecha2);
        lblFecha2.setBounds(15, 35, 40, 20);

        lblHoraFechaFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblHoraFechaFondo);
        lblHoraFechaFondo.setBounds(8, 5, 123, 56);

        lblConfiguracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        lblConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfiguracion.setText("Configuración");
        lblConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblConfiguracionMouseReleased(evt);
            }
        });
        getContentPane().add(lblConfiguracion);
        lblConfiguracion.setBounds(137, 10, 110, 42);

        lblFondoConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblFondoConfiguracion);
        lblFondoConfiguracion.setBounds(130, 5, 123, 56);

        lblGraficos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGraficos.setForeground(new java.awt.Color(255, 255, 255));
        lblGraficos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGraficos.setText("Gráficos");
        lblGraficos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGraficos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblGraficosMouseReleased(evt);
            }
        });
        getContentPane().add(lblGraficos);
        lblGraficos.setBounds(137, 65, 110, 42);

        lblFondoGraficos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblFondoGraficos);
        lblFondoGraficos.setBounds(130, 60, 123, 56);

        lblTabla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTabla.setForeground(new java.awt.Color(255, 255, 255));
        lblTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTabla.setText("Tabla Dinámica");
        lblTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTablaMouseReleased(evt);
            }
        });
        getContentPane().add(lblTabla);
        lblTabla.setBounds(13, 65, 110, 42);

        lblFondoTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/tipoBusqueda.fw.png"))); // NOI18N
        getContentPane().add(lblFondoTabla);
        lblFondoTabla.setBounds(8, 60, 123, 56);

        lblTiquete.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTiquete.setForeground(new java.awt.Color(255, 255, 255));
        lblTiquete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiquete.setLabelFor(Caja);
        lblTiquete.setText("Tiquete");
        lblTiquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTiquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTiqueteMouseReleased(evt);
            }
        });
        getContentPane().add(lblTiquete);
        lblTiquete.setBounds(20, 280, 220, 120);

        lblFondoTiquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoTransparente.png"))); // NOI18N
        getContentPane().add(lblFondoTiquete);
        lblFondoTiquete.setBounds(10, 268, 246, 140);

        btnLiberar.setBackground(new java.awt.Color(255, 204, 51));
        btnLiberar.setText("Liberar Cajas");
        btnLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLiberar);
        btnLiberar.setBounds(540, 10, 150, 30);

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
        Caja.setBounds(540, 45, 150, 360);

        lblFondoMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobancos/Imagenes/FondoPrincipal.jpg"))); // NOI18N
        lblFondoMenu.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFondoMenu.setIconTextGap(0);
        getContentPane().add(lblFondoMenu);
        lblFondoMenu.setBounds(0, -5, 700, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblConfiguracionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfiguracionMouseReleased
        JOptionPane.showMessageDialog(null, "Abre la ventana de Configuracion");
    }//GEN-LAST:event_lblConfiguracionMouseReleased

    private void lblGraficosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGraficosMouseReleased
        JOptionPane.showMessageDialog(null, "Abre la ventana de Graficos");
    }//GEN-LAST:event_lblGraficosMouseReleased

    private void lblTablaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTablaMouseReleased
        JOptionPane.showMessageDialog(null, "Abre la ventana de Tabla");
    }//GEN-LAST:event_lblTablaMouseReleased

    /**
     * Método que permite liberar la tabla para permitir ingresar nuevos 
     * usuarios a las cajas
     * @param evt 
     */
    private void btnLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberarActionPerformed
        LiberarTabla();
    }//GEN-LAST:event_btnLiberarActionPerformed

    /**
     * Método que llama a la ventana de nuevo tiquete para poder ingresar a un
     * nuevo usuario.
     * @param evt 
     */
    private void lblTiqueteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTiqueteMouseReleased
        VentanaRegistroClientes VRC = new VentanaRegistroClientes();
        VRC.show();
    }//GEN-LAST:event_lblTiqueteMouseReleased

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
    private javax.swing.JLabel lblConfiguracion;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblFecha2;
    private javax.swing.JLabel lblFondoConfiguracion;
    private javax.swing.JLabel lblFondoGraficos;
    private javax.swing.JLabel lblFondoMenu;
    private javax.swing.JLabel lblFondoTabla;
    private javax.swing.JLabel lblFondoTiquete;
    private javax.swing.JLabel lblGraficos;
    private javax.swing.JLabel lblHora1;
    private javax.swing.JLabel lblHora2;
    private javax.swing.JLabel lblHoraFechaFondo;
    private javax.swing.JLabel lblLista1;
    private javax.swing.JLabel lblLista2;
    private javax.swing.JLabel lblLista3;
    private javax.swing.JLabel lblListaClientes;
    private javax.swing.JLabel lblTabla;
    private javax.swing.JLabel lblTiquete;
    private javax.swing.JTable tblCajaEmpleados;
    // End of variables declaration//GEN-END:variables
}
