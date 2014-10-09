package proyectobancos.Constantes;

public class Parametros {
    
    private int Cajas = 7;
    private String NombreBanco = "Mi banco";
    private String FotoBanco = "C:\\Users\\Joseph\\Pictures\\Abstractas\\Paisaje #02.jpg";

    public String getNombreBanco() {
        return NombreBanco;
    }

    public void setNombreBanco(String NombreBanco) {
        this.NombreBanco = NombreBanco;
    }

    public String getFotoBanco() {
        return FotoBanco;
    }

    public void setFotoBanco(String FotoBanco) {
        this.FotoBanco = FotoBanco;
    }

    public int getCajas() {
        return Cajas;
    }

    public void setCajas(int Cajas) {
        this.Cajas = Cajas;
    }
    
}
