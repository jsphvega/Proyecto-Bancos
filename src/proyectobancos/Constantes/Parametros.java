package proyectobancos.Constantes;

import java.awt.Image;

public class Parametros {
    
    private int Cajas;
    private String NombreBanco;
    private Image FotoBanco;

    public String getNombreBanco() {
        return NombreBanco;
    }

    public void setNombreBanco(String NombreBanco) {
        this.NombreBanco = NombreBanco;
    }

    public Image getFotoBanco() {
        return FotoBanco;
    }

    public void setFotoBanco(Image FotoBanco) {
        this.FotoBanco = FotoBanco;
    }

    public int getCajas() {
        return Cajas;
    }

    public void setCajas(int Cajas) {
        this.Cajas = Cajas;
    }
    
}
