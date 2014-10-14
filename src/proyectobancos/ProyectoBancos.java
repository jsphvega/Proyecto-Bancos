package proyectobancos;

import proyectobancos.Administradores.AdministradorPrincipal;
import proyectobancos.Vistas.VentanaConfiguracion;
import proyectobancos.Vistas.VentanaPrincipal;
import proyectobancos.Vistas.VentanaRegistroClientesFinal;

/**
 * Método constructor del proyecto.
 *
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public class ProyectoBancos {
    
    public static void main(String[] args) {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(false);
        
        AdministradorPrincipal.getInstance()
                .setVentanaPrincipal(ventanaPrincipal);
        
        VentanaConfiguracion ventanaConfiguracion = 
                new VentanaConfiguracion(ventanaPrincipal);
        ventanaConfiguracion.setVisible(true);
        
        VentanaRegistroClientesFinal ventanaRegistroClientesFinal = 
                new VentanaRegistroClientesFinal(ventanaPrincipal);
        ventanaRegistroClientesFinal.setVisible(false);
        
        ventanaPrincipal.setVentanaConfiguracion(ventanaConfiguracion);
        ventanaPrincipal.setVentanaRegistroCliente(ventanaRegistroClientesFinal);
    }
}
