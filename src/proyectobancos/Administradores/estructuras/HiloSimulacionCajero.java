/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancos.Administradores.estructuras;

import java.io.IOException;
import proyectobancos.Administradores.AdministradorPrincipal;
import proyectobancos.Administradores.Cajero;
import proyectobancos.Administradores.estructuras.colas.ColaPrioridad;
import proyectobancos.Constantes.Constantes;
import proyectobancos.Constantes.Parametros;

/**
 *
 * @author Lucia
 */
public class HiloSimulacionCajero extends Thread {

    private volatile boolean blinker = true;
    final long interval = 500;
    private volatile boolean threadSuspended = false;
    private ColaPrioridad<ClienteComparable> colaPrioridad;
    private ListaSimplementeEnlazadaGenerica<Cajero> listaCajerosActivos;

    public HiloSimulacionCajero(ColaPrioridad<ClienteComparable> colaPrioridad,
            ListaSimplementeEnlazadaGenerica<Cajero> listaCajerosActivos) {
        this.colaPrioridad = colaPrioridad;
        this.listaCajerosActivos = listaCajerosActivos;
    }

    /**
     *
     */
    public void run() {
        while (blinker == true) {
            try {
                Thread.sleep(interval);
                //System.out.println("Descansado");

                synchronized (this) {
                    while (threadSuspended && blinker == true) {
                        System.out.println("El hilo se encuentra pausado");
                        wait();
                    }
                }
            } catch (InterruptedException e) {
            }
            //
            //System.out.println("Trabajando");

            NodoGenericoSimple<Cajero> obtenerPrimerCajero = listaCajerosActivos.obtenerPrimero();

            if (obtenerPrimerCajero != null) {

                while (obtenerPrimerCajero != null) {

                    Cajero cajero = obtenerPrimerCajero.getElement();
                    int estado = cajero.getEstado();
                    if (estado == Constantes.ESTADO_CAJERO_DISPONIBLE) {
                        
                        //System.out.println("Cajero #: " + cajero.getNumeroCajero()+ " DISPONIBLE");

                        if (colaPrioridad.size() > 0) {

                            //System.out.println("Asignando cliente al cajero #:");
                            //System.out.println(cajero.getNumeroCajero());

                            ClienteComparable clienteParaAtender = colaPrioridad.EliminaNodo();
                            cajero.setClienteActual(clienteParaAtender);
                            cajero.setEstado(Constantes.ESTADO_CAJERO_OCUPADO);
                            clienteParaAtender.setEstado(Constantes.ESTADO_CLIENTE_EN_CAJA);
                            
                            AdministradorPrincipal.getInstance().mostrarMensaje("El usuario: " + clienteParaAtender.getNombre()+"\n"+
                                    "Ficha: "+ clienteParaAtender.getCodigo()+"\n"+"Ha sido asignando al cajero #: "+cajero.getNumeroCajero());
                            
                            System.out.println("$$$Correo: "+clienteParaAtender.getCorreo());
                            System.out.println("$$$Ruta foto: "+Parametros.getRutaFotoBanco());
                            System.out.println("$$$Cajero: "+cajero.getNumeroCajero());
                            
                            AdministradorPrincipal.getInstance().enviarCorreoTurno(clienteParaAtender.getCorreo(), Parametros.getRutaFotoBanco(), cajero.getNumeroCajero());
                            AdministradorPrincipal.getInstance().mostrarMensaje("Se le ha notificado que le "
                                    + "corresponde su turno al cliente con la ficha: " + 
                                    clienteParaAtender.getCodigo());
                        }

                    }

                    obtenerPrimerCajero = obtenerPrimerCajero.next;
                }

            } else {
                System.out.println("Lista de cajeros vacia");
            }

        }

        //
        System.out.println("Se ha detenido el hilo");
    }

    /**
     * Método que detiene los procesos del reproductor
     */
    public synchronized void detener() {
        System.out.println("DETENER HILO");
        blinker = false;
        notify();
    }

    /**
     * Método que pausa los procesos del reproductor
     */
    public synchronized void pausar() {

        threadSuspended = true;

        if (!threadSuspended) {
            notify();
        }
    }

    /**
     * Método que continua los procesos del reproductor
     */
    public synchronized void continuar() {

        threadSuspended = false;

        if (!threadSuspended) {
            notify();
        }
    }

}
