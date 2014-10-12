package proyectobancos.Constantes;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Parametros {
    

    //Constantes
    private String tipoBusqueda = "Nombre";
    
    //Variables
    private int Cajas = 13;

    private String NombreBanco = "Mi banco";
    private String FotoBanco = "C:\\Users\\Joseph\\Pictures\\Abstractas\\Paisaje #02.jpg";

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
    public void setTipoBusqueda(String tipoBusqueda) {
        this.tipoBusqueda = tipoBusqueda;
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
        this.NombreBanco = NombreBanco;
    }

    /**
     * Retorna la variable FotoBanco. 
     * @return String
     */
    public String getFotoBanco() {
        return FotoBanco;
    }
    
    /**
     * Modifica la variable FotoBanco.
     * @param FotoBanco 
     */
    public void setFotoBanco(String FotoBanco) {
        this.FotoBanco = FotoBanco;
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
        this.Cajas = Cajas;
    }
    
    /**
     * Método que retorna un icono de imagen para el titulo del proyecto.
     * @return Image
     */
    public Image getIcon(){
        ImageIcon icon = new ImageIcon(getFotoBanco());
        return icon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
    }
    
    /**
     * Método que retorna una frase para el titulo del proyecto.
     * @return String
     */
    public String getTitle(){
        return (getNombreBanco().toUpperCase() + ", Bienvenidos!!");
    }
}
