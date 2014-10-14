/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancos.Administradores;

import proyectobancos.Administradores.estructuras.ClienteComparable;
import proyectobancos.Constantes.Constantes;

/**
 *
 * @author Lucia
 */
public class Cajero {

    private ClienteComparable clienteActual;
    private int estado;
    private int numeroCajero;

    public Cajero(int numeroCajero) {
        this.numeroCajero = numeroCajero;
        this.estado = Constantes.ESTADO_CAJERO_DISPONIBLE;
    }

    public void setClienteActual(ClienteComparable clienteActual) {
        this.clienteActual = clienteActual;
    }

    public ClienteComparable getClienteActual() {
        return clienteActual;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getNumeroCajero() {
        return numeroCajero;
    }

    public void setNumeroCajero(int numeroCajero) {
        this.numeroCajero = numeroCajero;
    }

    @Override
    public String toString() {
        String resultado = "";
        if (clienteActual != null) {
            resultado += "Cajero #: " + getNumeroCajero();
            resultado += "Se encuentra atendiendo al cliente llamado: " + getClienteActual().getNombre();
            resultado += "El cual posee la ficha: " + getClienteActual().getCodigo();
            
        } else {
            resultado += "Cajero #: " + getNumeroCajero() + " se encuntra disponible";
        }
        
        return resultado;
    }
}
