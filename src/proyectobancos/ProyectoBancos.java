package proyectobancos;

import proyectobancos.Administradores.AdministradorPrincipal;
import proyectobancos.Administradores.estructuras.ClienteComparable;
import proyectobancos.Administradores.estructuras.ListaSimplementeEnlazadaGenerica;
import proyectobancos.Administradores.estructuras.NodoGenericoSimple;
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
        //Instancia al primer método
        
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(false);
        
        AdministradorPrincipal.getInstance().setVentanaPrincipal(ventanaPrincipal);
        
        VentanaConfiguracion ventanaConfiguracion = new VentanaConfiguracion(ventanaPrincipal);
        ventanaConfiguracion.setVisible(true);
        
        VentanaRegistroClientesFinal ventanaRegistroClientesFinal = new VentanaRegistroClientesFinal(ventanaPrincipal);
        ventanaRegistroClientesFinal.setVisible(false);
        
        ventanaPrincipal.setVentanaConfiguracion(ventanaConfiguracion);
        ventanaPrincipal.setVentanaRegistroCliente(ventanaRegistroClientesFinal);
        
//        ListaSimplementeEnlazadaGenerica<ClienteComparable> listaClientes = AdministradorPrincipal.getInstance().getListaClientes();
//        
//        String nextCodigoDiscapacitados = AdministradorPrincipal.getInstance().getNextCodigoDiscapacitados();
//        AdministradorPrincipal.getInstance().agregarClienteCategoriaDiscapacitado(
//                "Juan",
//                "juan@gmail.com",
//                nextCodigoDiscapacitados,
//                "02/10/10", "10/10/10");
//        
//        nextCodigoDiscapacitados = AdministradorPrincipal.getInstance().getNextCodigoDiscapacitados();
//        AdministradorPrincipal.getInstance().agregarClienteCategoriaDiscapacitado(
//                "Lucia",
//                "malu@gmail.com",
//                nextCodigoDiscapacitados,
//                "01/10/10", "10/10/10");
//        
//        nextCodigoDiscapacitados = AdministradorPrincipal.getInstance().getNextCodigoDiscapacitados();
//        AdministradorPrincipal.getInstance().agregarClienteCategoriaDiscapacitado(
//                "Pedro",
//                "pedro@gmail.com",
//                nextCodigoDiscapacitados,
//                "12/10/10", "10/10/10");
//        
//        NodoGenericoSimple<ClienteComparable> obtenerPrimero = listaClientes.obtenerPrimero();
//        
//        if (obtenerPrimero != null) {
//            
//            while (obtenerPrimero != null) {
//                ClienteComparable element = obtenerPrimero.getElement();
//                String nombre = element.getNombre();
//                System.out.println("Nombre: ");
//                System.out.println(nombre);
//                System.out.print(obtenerPrimero.getElement().toString() + " ");
//                obtenerPrimero = obtenerPrimero.next;
//            }
//            System.out.println();
//        }
        
    }
}
