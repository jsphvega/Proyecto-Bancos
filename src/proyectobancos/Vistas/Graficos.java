/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancos.Vistas;

import java.text.DecimalFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Marian
 */
public class Graficos {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //generarGraficoCantindadClientesPorTipo(10, 3, 2, 5, 9);
        generarGraficoPastelCantindadClientesPorTipo(10, 3, 2, 5, 9);
        
        new VentanaGraficosBarrasPorTipoCliente(2,3,6,4,7).setVisible(true);
    }

    public static void generarGraficoPastelCantindadClientesPorTipo(int numeroDiscapacitados, int numeroAdultoMayor, int numeroEmbarazadas, int numeroClienteCorporativo, int numeroClientesRegular) {
        // fuente de datos
        DefaultPieDataset datosDeGrafico = new DefaultPieDataset();
        datosDeGrafico.setValue("Personas Discapacitadas", numeroDiscapacitados);
        datosDeGrafico.setValue("Personas adulto mayor", numeroAdultoMayor);
        datosDeGrafico.setValue("Personas embarazadas", numeroEmbarazadas);
        datosDeGrafico.setValue("Corporativo", numeroClienteCorporativo);
        datosDeGrafico.setValue("Cliente Regular", numeroClientesRegular);
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
                "Gráfico de la cantidad de clientes por tipo",
                datosDeGrafico,
                true,
                true,
                false);

        PiePlot graficador = (PiePlot) chart.getPlot();

        //graficador.setSimpleLabels(true);
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
                "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        graficador.setLabelGenerator(gen);

        // Mostrar Grafico
        ChartFrame frame = new ChartFrame("Estadisticas del banco", chart);
        frame.pack();
        frame.setVisible(true);

    }
}

// TODO code application logic here

