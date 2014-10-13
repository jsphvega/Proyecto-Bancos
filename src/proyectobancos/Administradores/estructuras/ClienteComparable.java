/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectobancos.Administradores.estructuras;

/**
 *
 * @author Lucia
 * Con base en el ejemplo de: http://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/ 
 */
public class ClienteComparable implements Comparable<ClienteComparable>{
    
    private int prioridad;
    private int posicion;
    private String nombre, correo, codigo, fecha, hora;


    public ClienteComparable(int prioridad, int posicion, String nombre, String correo, String codigo, String fecha, String hora) {
        this.prioridad = prioridad;
        this.posicion = posicion;
        this.nombre = nombre;
        this.correo = correo;
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
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
    
    
    

    @Override
    public int compareTo(ClienteComparable pCliente) {
        int resultadoComparacion = 0;
        int valorAComparar = pCliente.getPrioridad();
        int comparacionPrioridad = this.prioridad - valorAComparar;
        if (comparacionPrioridad == 0){
            resultadoComparacion = posicion - pCliente.getPosicion();
        }else{
            resultadoComparacion = comparacionPrioridad;
        }
        return resultadoComparacion;
    }
    
}
