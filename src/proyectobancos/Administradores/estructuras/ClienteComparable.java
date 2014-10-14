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

    private String fechaAtencion = "";
    private String horaAtencion = "";

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
        if (estado == Constantes.ESTADO_CLIENTE_EN_ESPERA) {
            resultado += "Estado: \n";
            resultado += "EN ESPERA" + "\n";
        } else if (estado == Constantes.ESTADO_CLIENTE_EN_CAJA) {
            resultado += "Estado: \n";
            resultado += "EN CAJA" + "\n";
            
        }else if (estado == Constantes.ESTADO_CLIENTE_ATENDIDO) {
            resultado += "Estado: \n";
            resultado += "ATENDIDO" + "\n";
        }
        resultado += "Prioridad: \n";
        resultado += prioridad + "\n";
        resultado += "Codigo asignado: \n";
        resultado += codigo + "\n";
        resultado += "Correo: \n";
        resultado += correo + "\n";
        resultado += "Posión en la cola principal: \n";
        resultado += posicion + "\n";
        resultado += "Fecha ingreso: \n";
        resultado += fecha + "\n";
        resultado += "Hora ingreso: \n";
        resultado += hora + "\n";

        resultado += "Fecha de atención: \n";
        resultado += fechaAtencion + "\n";
        resultado += "Hora de atención: \n";
        resultado += horaAtencion + "\n";

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

    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public void setFechaAtencion(String fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
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
