package proyectobancos.Administradores;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 * Clase que va a controlar la fecha y la hora en tiempo real.
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public class Reloj extends Thread {
    
    public JLabel hora; //Etiqueta que lleva la hora del sistema
    
    /**
     * Metodo constructor de la clase
     * @param hora = contiene la hora en el momento de la llamada.
     */
    public Reloj (JLabel hora){
        this.hora = hora;
    }
    /**
     * Método que va a ir llevando el tiempo en el programa
     */
    @Override
    public void run (){
        //Ciclo que controla la velocidad del tiempo
        while (true){
            
            Date hoy = new Date();
            SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
            hora.setText(s.format(hoy));
            
            try {
                sleep(1000);
            }catch (Exception ex){}
        }
    }
}
