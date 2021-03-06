package proyectobancos.Constantes;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * Clase que va a mostrar los parametros relacionados con el proyecto.
 *
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public class Parametros {
    //Constantes
    private static String tipoBusqueda = "Nombre";
    
    //Variables
    private static int Cajas = 1;
    private static String NombreBanco = "";
    private static String FotoBanco = "";

    /**
     * Return la variable TipoBusqueda. 
     * @return String.
     */
    public String getTipoBusqueda() {
        return tipoBusqueda;
    }

    /**
     * Modifica la variable TipoBusqueda. 
     * @param tipoBusqueda
     */
    public static void setTipoBusqueda(String tipoBusqueda) {
        Parametros.tipoBusqueda = tipoBusqueda;
    }
    
    /**
     * Returna la variable NombreBanco. 
     * @return String
     */
    public String getNombreBanco() {
        return NombreBanco;
    }
    
    /**
     * Modifica la variable NombreBanco. 
     * @param NombreBanco
     */
    public void setNombreBanco(String NombreBanco) {
        Parametros.NombreBanco = NombreBanco;
    }

    /**
     * Retorna la variable FotoBanco. 
     * @return String
     */
    public static String getRutaFotoBanco() {
        return FotoBanco;
    }
    
    /**
     * Modifica la variable FotoBanco.
     * @param FotoBanco 
     */
    public void setFotoBanco(String FotoBanco) {
        Parametros.FotoBanco = FotoBanco;
    }

    /**
     * Retorna la variable Cajas. 
     * @return int
     */
    public int getCajas() {
        return Cajas;
    }
    
    /**
     * Modifica la variable Cajas.
     * @param Cajas 
     */
    public void setCajas(int Cajas) {
        Parametros.Cajas = Cajas;
    }
    
    /**
     * Método que retorna un icono de imagen para el titulo del proyecto.
     * @return Image
     */
    public Image getIcon(){
        ImageIcon icon = new ImageIcon(getRutaFotoBanco());
        return icon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
    }
    
    /**
     * Método que retorna una frase para el titulo del proyecto.
     * @return String
     */
    public String getTitle(){
        return (getNombreBanco() + ", Bienvenidos!!");
    }
}
