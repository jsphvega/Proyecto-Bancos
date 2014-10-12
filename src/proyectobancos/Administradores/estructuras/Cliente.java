/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectobancos.Administradores.estructuras;

/**
 *
 * @author Lucia
 */
public class Cliente extends Object{
    int valor;
    String nombre;

    public Cliente(int pValor, String pNombre) {
        this.valor = pValor;
        nombre = pNombre;
    }

    public int getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
