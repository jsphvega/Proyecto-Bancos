package proyectobancos;

import proyectobancos.Administradores.CorreoClientes;
import proyectobancos.Vistas.VentanaPrincipal;

/**
 * Método constructor del proyecto.
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public class ProyectoBancos {

    public static void main(String[] args) {
        CorreoClientes cl = new CorreoClientes("atiregistro2014@hotmail.com",
                "Probando2014","","","Prueba");
        cl.sendMail("2", "Joseph", "j-vv01@hotmail.com");
        //Instancia al primer método
        VentanaPrincipal VT = new VentanaPrincipal();
        VT.show();
    }
    
}
