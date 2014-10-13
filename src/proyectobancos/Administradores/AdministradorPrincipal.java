/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancos.Administradores;

import java.util.PriorityQueue;
import static proyectobancos.Administradores.AdministradorCorreo.generateAndSendEmail;
import proyectobancos.Administradores.estructuras.ClienteComparable;
import proyectobancos.Administradores.estructuras.ListaSimplementeEnlazadaGenerica;
import proyectobancos.Administradores.estructuras.NodoGenericoSimple;
import proyectobancos.Constantes.Constantes;

/**
 *
 * @author Lucia
 */
public class AdministradorPrincipal {

    private ListaSimplementeEnlazadaGenerica<ClienteComparable> listaClientes;
    private AdministradorCorreo administradorCorreo;
    private PriorityQueue<ClienteComparable> colaPrioridad;

    private int totalClientesDiscapacitados;
    private int totalClientesAdultoMayor;
    private int totalClientesMujeresEmbarazadas;
    private int totalClientesCorporativos;
    private int totalClientesRegulares;
    private int totalClientes;

    private static AdministradorPrincipal INSTANCE = null;

    public AdministradorPrincipal() {
        crearEstructuras();
        iniciarContadores();

    }

    private void iniciarContadores() {
        totalClientesDiscapacitados = 0;
        totalClientesAdultoMayor = 0;
        totalClientesMujeresEmbarazadas = 0;
        totalClientesCorporativos = 0;
        totalClientesRegulares = 0;
        totalClientes = 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    private void crearEstructuras() {
        listaClientes = new ListaSimplementeEnlazadaGenerica<ClienteComparable>();
        administradorCorreo = new AdministradorCorreo();
        colaPrioridad = new PriorityQueue();
    }

    public static AdministradorPrincipal getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }

    private static void createInstance() {
        if (INSTANCE == null) {
            // Sólo se accede a la zona sincronizada
            // cuando la instancia no está creada
            synchronized (AdministradorPrincipal.class) {
                // En la zona sincronizada sería necesario volver
                // a comprobar que no se ha creado la instancia
                if (INSTANCE == null) {
                    INSTANCE = new AdministradorPrincipal();
                }
            }
        }
    }

    public boolean enviarCorreoConfirmacion(String correoDestino, String nombre, String tiquete, String rutaImagen) {
        return administradorCorreo.enviarCorreoConfirmacion(correoDestino, nombre, tiquete, rutaImagen);
    }

    public boolean enviarCorreoTurno(String correoDestino, String rutaImagen) {
        return administradorCorreo.enviarCorreoTurno(correoDestino, rutaImagen);
    }

    public void agregarClienteCategoriaDiscapacitado() {

    }

    public String getNextCodigoDiscapacitados() {
        return Constantes.CATEGORIA_DISCAPACITADO + totalClientesDiscapacitados;
    }

    public String getNextCodigoAdultoMayor() {
        return Constantes.CATEGORIA_ADULTO_MAYOR + totalClientesAdultoMayor;
    }

    public String getNextCodigoEmbarazada() {
        return Constantes.CATEGORIA_MUJER_EMBARAZADA + totalClientesMujeresEmbarazadas;
    }

    public String getNextCodigoCorporativo() {
        return Constantes.CATEGORIA_CLIENTE_CORPORATIVO + totalClientesCorporativos;
    }

    public String getNextCodigoClienteRegular() {
        return Constantes.CATEGORIA_CLIENTE_REGULAR + totalClientesRegulares;
    }

    public void agregarClienteCategoriaDiscapacitado(String Nombre, String Correo, String codigo, String Fecha, String Hora) {

        ClienteComparable nuevoCliente = new ClienteComparable(
                Constantes.PRIORIDAD_DISCAPACITADO, totalClientes,
                Nombre,
                Correo,
                codigo,
                Fecha,
                Hora);

        colaPrioridad.add(nuevoCliente);
        listaClientes.agregarAlInicio(new NodoGenericoSimple<ClienteComparable>(nuevoCliente,null));
        totalClientesDiscapacitados++;
        totalClientes++;
    }

    public void agregarClienteCategoriaAdultoMayor(String Nombre, String Correo, String codigo, String Fecha, String Hora) {

        ClienteComparable nuevoCliente = new ClienteComparable(
                Constantes.PRIORIDAD_ADULTO_MAYOR, totalClientes,
                Nombre,
                Correo,
                codigo,
                Fecha,
                Hora);

        colaPrioridad.add(nuevoCliente);
        totalClientes++;
    }

    public ListaSimplementeEnlazadaGenerica<ClienteComparable> getListaClientes() {
        return listaClientes;
    }
    
    //Para recorer la lista
    
    
    

}
