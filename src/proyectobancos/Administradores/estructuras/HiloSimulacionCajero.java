/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancos.Administradores.estructuras;

import java.io.IOException;

/**
 *
 * @author Lucia
 */
public class HiloSimulacionCajero extends Thread {

    private volatile boolean blinker = true;
    final long interval = 500;
    private volatile boolean threadSuspended = false;

    public HiloSimulacionCajero() {
    }

    /**
     * 
     */
    public void run() {
        while (blinker == true) {
            try {
                Thread.sleep(interval);
                System.out.println("Descansado");

                synchronized (this) {
                    while (threadSuspended && blinker == true) {
                        System.out.println("El hilo se encuentra pausado");
                        wait();
                    }
                }
            } catch (InterruptedException e) {
            }
            //
            System.out.println("Trabajando");
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
