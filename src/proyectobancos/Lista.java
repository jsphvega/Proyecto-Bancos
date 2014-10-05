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
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * Clase ArrayLit para gestionar la lista de los clientes
 */
class Lista {
    /**
     * Declaración de variables a utilizar
     */
    public int size;
    public int maxSize;
    public String[] arreglo;
    public final int MAX_SIZE = 1000;

    /**
     * Constructor de la clase
     * Se declaran los valores de las variables y se inicializan 
     */
    public Lista () {
            
	this.size = 0;
	this.maxSize = MAX_SIZE;
	this.arreglo = new String[this.maxSize];
    }
    /**
     * Agrega un elemento al arreglo si este es menor al máximo la lista, de lo contrario devuelve un error
     * @param Dato
     */
    public void Modificar(String Dato, int indice){
        this.arreglo[indice]=Dato;
    }
    
    public void add (String Dato) {

	if (this.size < this.maxSize) {
            this.arreglo [this.size] = Dato;
            this.size ++;
	}
	else {
            System.out.println ("Error");
	}
    }
    
    public int getSize (){
        return this.size;
    }
    /**
     * Obtiene un elemento a través de un índice siempre y cuando el índice sea MAYOR o IGUAL que 0 
     * y MENOR o IGUAL que size 
     * 
     * @param indice para seleccionar de la lista
     * @return elemento que tiene asignado el índice a seleccionar
     * @throws Exception posibles errores a devolver
     */
    public String getElemento (int indice) throws Exception {
                        
	if ((indice >= 0 ) && (indice <= this.size)){
            return this.arreglo [indice];
        }
        if (indice == 0) {
            JOptionPane.showMessageDialog (null," Es el ultimo elemento","Error",ERROR_MESSAGE);
        }
        return null;
    }
        
    /**
     * Borra un elemento dentro del arreglo, recibe un índice.
     * @param porBorrar 
     */
    public void borrar (int porBorrar) {
	for (int i=0; i <= this.size; i++) {
		if (arreglo[i] == arreglo[porBorrar]) {
                        arreglo[porBorrar] = arreglo[++i];
                        --this.size;
			}
		}
	}
}