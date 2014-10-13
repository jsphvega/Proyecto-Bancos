package proyectobancos.Administradores;

/**
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public class Clientes {
    
    public String nombre;
    public String correo;
    public String tipoPrioridad;
    public String fecha;
    public String hora;
    
    public Clientes(String nombre, String tipoPrioridad, String correo, String fecha, String hora){
        this.nombre = nombre;
        this.tipoPrioridad = tipoPrioridad;
        this.correo = correo;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipoPrioridad(){
        return tipoPrioridad;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setTipoPrioridad(String prioridad){
        this.tipoPrioridad = prioridad;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public String getHora(){
        return hora;
    }


    
}

