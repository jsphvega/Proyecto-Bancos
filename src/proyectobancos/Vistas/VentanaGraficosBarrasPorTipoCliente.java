/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancos.Vistas;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Marian
 */
public class VentanaGraficosBarrasPorTipoCliente extends JFrame {

    JPanel panel;

    public VentanaGraficosBarrasPorTipoCliente(int numeroDiscapacitados, int numeroAdultoMayor, int numeroEmbarazadas, int numeroClienteCorporativo, int numeroClientesRegular) {
        setTitle("Estadísticas del banco");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        inicializar(numeroDiscapacitados, numeroAdultoMayor, numeroEmbarazadas, numeroClienteCorporativo, numeroClientesRegular);
    }

    private void inicializar(int numeroDiscapacitados, int numeroAdultoMayor, int numeroEmbarazadas, int numeroClienteCorporativo, int numeroClientesRegular) {
        panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultCategoryDataset datosGraficar = new DefaultCategoryDataset();
        datosGraficar.setValue(numeroDiscapacitados, "Discapacacitados", "Discapacacitados");
        //datosGraficar.setValue(7, "Hombres", "Lunes");
        datosGraficar.setValue(numeroAdultoMayor, "Adulto Mayor", "Adulto Mayor");
        //datosGraficar.setValue(4, "Hombres", "Martes");
        datosGraficar.setValue(numeroEmbarazadas, "Embazaradas", "Embazaradas");
        //datosGraficar.setValue(5, "Hombres", "Miercoles");
        datosGraficar.setValue(numeroClienteCorporativo, "Clientes Corporativos", "Clientes Corporativoss");
        //datosGraficar.setValue(9, "Hombres", "Jueves");
        datosGraficar.setValue(numeroClientesRegular, "Clientess Regular", "Clientess Regular");
        //datosGraficar.setValue(8, "Hombres", "Viernes");
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart3D("Gráfico de clientes por categoría", "Categoría", "Cantidad de Clientes",
                datosGraficar, PlotOrientation.VERTICAL, true, true, true);
        chart.setBackgroundPaint(Color.cyan);
        chart.getTitle().setPaint(Color.black);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.red);
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }
    

    public static void main(String args[]) {
        
    }
}
