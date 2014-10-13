/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancos.Administradores.estructuras;

import proyectobancos.Constantes.Constantes;

/**
 *
 * @author Lucia Con base en el ejemplo de:
 * http://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
 */
public class ClienteComparable implements Comparable<ClienteComparable> {

    private int prioridad;
    private int posicion;
    private String nombre, correo, codigo, fecha, hora;
    private int estado;

    public ClienteComparable(int prioridad, int posicion, String nombre, String correo, String codigo, String fecha, String hora) {
        this.prioridad = prioridad;
        this.posicion = posicion;
        this.nombre = nombre;
        this.correo = correo;
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = Constantes.ESTADO_CLIENTE_EN_ESPERA;
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += "Nombre: \n";
        resultado += nombre + "\n";
        resultado += "Prioridad: \n";
        resultado += prioridad + "\n";
        resultado += "Codigo asignado: \n";
        resultado += codigo + "\n";
        resultado += "Correo: \n";
        resultado += correo + "\n";
        resultado += "Posicion en la cola original: \n";
        resultado += posicion + "\n";
        resultado += "Fecha: \n";
        resultado += fecha + "\n";
        resultado += "Hora: \n";
        resultado += hora + "\n";

        return resultado;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    

    @Override
    public int compareTo(ClienteComparable pCliente) {
        int resultadoComparacion = 0;
        int valorAComparar = pCliente.getPrioridad();
        int comparacionPrioridad = this.prioridad - valorAComparar;
        if (comparacionPrioridad == 0) {
            resultadoComparacion = posicion - pCliente.getPosicion();
        } else {
            resultadoComparacion = comparacionPrioridad;
        }
        return resultadoComparacion;
    }

}
