package proyectobancos.Constantes;

/**
 * Clase que va a mostrar las constantes relacionadas con el proyecto.
 *
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public class Constantes {
    
    public static final int PRIORIDAD_DISCAPACITADO =1;
    public static final int PRIORIDAD_ADULTO_MAYOR =2;
    public static final int PRIORIDAD_MUJER_EMBARAZADA=3;
    public static final int PRIORIDAD_CLIENTE_CORPORATIVO=4;
    public static final int PRIORIDAD_CLIENTE_REGULAR=5;
    public static final int MODO_SIMULACION_DETENIDA=0;
    public static final int MODO_SIMULACION_PAUSADA = 1;
    public static final int MODO_SIMULACION_ACTIVADA=2;
    
    //Cosntantes que controlan el estado del cliente
    public static final int ESTADO_CLIENTE_EN_ESPERA = 0;
    public static final int ESTADO_CLIENTE_EN_CAJA = 1;
    public static final int ESTADO_CLIENTE_ATENDIDO = 2;
    
    //Constantes que controlan las cajas
    public static final int ESTADO_CAJERO_DISPONIBLE = 0;
    public static final int ESTADO_CAJERO_OCUPADO = 1;
    
    //Consantes que controlan el tipo de categoria
    public static final String CATEGORIA_DISCAPACITADO = "D";
    public static final String CATEGORIA_ADULTO_MAYOR = "A";
    public static final String CATEGORIA_MUJER_EMBARAZADA= "M";
    public static final String CATEGORIA_CLIENTE_CORPORATIVO= "C";
    public static final String CATEGORIA_CLIENTE_REGULAR= "R";
    public static final String CATEGORIA_CLIENTE="T";
}
