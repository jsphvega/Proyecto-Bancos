/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancos.Administradores;

import java.util.PriorityQueue;
import proyectobancos.Administradores.estructuras.ClienteComparable;
import proyectobancos.Administradores.estructuras.HiloSimulacionCajero;
import proyectobancos.Administradores.estructuras.ListaSimplementeEnlazadaGenerica;
import proyectobancos.Administradores.estructuras.NodoGenericoSimple;
import proyectobancos.Constantes.Constantes;
import proyectobancos.Constantes.Parametros;
import proyectobancos.Vistas.VentanaPrincipal;

/**
 *
 * @author Lucia
 */
public class AdministradorPrincipal {

    private ListaSimplementeEnlazadaGenerica<ClienteComparable> listaClientes;
    private ListaSimplementeEnlazadaGenerica<Cajero> listaCajerosActivos;
    private AdministradorCorreo administradorCorreo;
    private PriorityQueue<ClienteComparable> colaPrioridad;

    private VentanaPrincipal ventanaPrincipal;

    private HiloSimulacionCajero hiloSimulacionCajero;

    private int totalClientesDiscapacitados;
    private int totalClientesAdultoMayor;
    private int totalClientesMujeresEmbarazadas;
    private int totalClientesCorporativos;
    private int totalClientesRegulares;
    private int totalClientes;

    private int modoSimulacion;

    private Parametros parametros;

    private static AdministradorPrincipal INSTANCE = null;

    private AdministradorPrincipal() {
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
        modoSimulacion = Constantes.MODO_SIMULACION_PAUSADA;
        hiloSimulacionCajero.pausar();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    private void crearEstructuras() {

        parametros = new Parametros();
        listaClientes = new ListaSimplementeEnlazadaGenerica<ClienteComparable>();
        listaCajerosActivos = new ListaSimplementeEnlazadaGenerica<Cajero>();
        administradorCorreo = new AdministradorCorreo();
        colaPrioridad = new PriorityQueue();
        hiloSimulacionCajero = new HiloSimulacionCajero(colaPrioridad, listaCajerosActivos);
        hiloSimulacionCajero.start();

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

    public void activarSimulacion() {
        modoSimulacion = Constantes.MODO_SIMULACION_ACTIVADA;
        System.out.println("---");
        System.out.println("ACTIVANDO SIMULACION");
        System.out.println("---");
        hiloSimulacionCajero.continuar();
    }

    public void pausarSimulacion() {
        modoSimulacion = Constantes.MODO_SIMULACION_PAUSADA;
        System.out.println("---");
        System.out.println("Pausando SIMULACION");
        System.out.println("---");
        hiloSimulacionCajero.pausar();
    }

    public void detenerSimulacion() {
        modoSimulacion = Constantes.MODO_SIMULACION_DETENIDA;
        System.out.println("---");
        System.out.println("DETENIENDO SIMULACION");
        System.out.println("---");
        hiloSimulacionCajero.detener();

    }

    public boolean enviarCorreoConfirmacion(String correoDestino, String nombre, String tiquete, String rutaImagen) {
        return administradorCorreo.enviarCorreoConfirmacion(correoDestino, nombre, tiquete, rutaImagen);
    }

    public boolean enviarCorreoTurno(String correoDestino, String rutaImagen) {
        return administradorCorreo.enviarCorreoTurno(correoDestino, rutaImagen);
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
        listaClientes.agregarAlFinal(new NodoGenericoSimple<ClienteComparable>(nuevoCliente, null));
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
        listaClientes.agregarAlFinal(new NodoGenericoSimple<ClienteComparable>(nuevoCliente, null));
        totalClientesAdultoMayor++;
        totalClientes++;
    }

    public void agregarClienteCategoriaMujerEmbarazada(String Nombre, String Correo, String codigo, String Fecha, String Hora) {

        ClienteComparable nuevoCliente = new ClienteComparable(
                Constantes.PRIORIDAD_MUJER_EMBARAZADA, totalClientes,
                Nombre,
                Correo,
                codigo,
                Fecha,
                Hora);

        colaPrioridad.add(nuevoCliente);
        listaClientes.agregarAlFinal(new NodoGenericoSimple<ClienteComparable>(nuevoCliente, null));
        totalClientesMujeresEmbarazadas++;
        totalClientes++;
    }

    public void agregarClienteCategoriaCorporativos(String Nombre, String Correo, String codigo, String Fecha, String Hora) {

        ClienteComparable nuevoCliente = new ClienteComparable(
                Constantes.PRIORIDAD_CLIENTE_CORPORATIVO, totalClientes,
                Nombre,
                Correo,
                codigo,
                Fecha,
                Hora);

        colaPrioridad.add(nuevoCliente);
        listaClientes.agregarAlFinal(new NodoGenericoSimple<ClienteComparable>(nuevoCliente, null));
        totalClientesCorporativos++;
        totalClientes++;
    }

    public void agregarClienteCategoriaRegulares(String Nombre, String Correo, String codigo, String Fecha, String Hora) {

        ClienteComparable nuevoCliente = new ClienteComparable(
                Constantes.PRIORIDAD_CLIENTE_REGULAR, totalClientes,
                Nombre,
                Correo,
                codigo,
                Fecha,
                Hora);

        colaPrioridad.add(nuevoCliente);
        listaClientes.agregarAlFinal(new NodoGenericoSimple<ClienteComparable>(nuevoCliente, null));
        totalClientesRegulares++;
        totalClientes++;
    }

    public ListaSimplementeEnlazadaGenerica<ClienteComparable> getListaClientes() {
        return listaClientes;
    }

    //Para recorer la lista
    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
    }

    public void actualizarCajeros() {
        if (ventanaPrincipal != null) {
            int totalCajas = parametros.getCajas();
//            if (listaCajerosActivos.getSize()){
//                
//            }
            //listaCajerosActivos.
        }
    }
    
    public void liberarTodosCajeros(){
        
    }

}
