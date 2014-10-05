/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectobancos;

/**
 *
 * @author Miller
 */
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class Reloj extends Thread {
    public JLabel hora;
    
    public Reloj (JLabel hora){
        this.hora = hora;
    }
    
    public void run (){
        while (true){
            Date hoy = new Date();
            SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
            hora.setText(s.format(hoy));
        try {
            sleep(1000);
        }catch (Exception ex){
        
        }
        }
        
    }
}
