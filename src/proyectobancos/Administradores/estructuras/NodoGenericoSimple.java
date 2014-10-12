/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectobancos.Administradores.estructuras;

/**
 * @author 
 * 
 */
 
public class NodoGenericoSimple<E> {
       
    // instance variables
    private E dato;
    public NodoGenericoSimple<E> next;
 
    // constructor first
    public NodoGenericoSimple() {
        this(null, null); 
    }
 
    public NodoGenericoSimple(E element, NodoGenericoSimple<E> next) {
        this.dato = element;
        this.next = next;
    }
 
    public E getElement() {
        return dato;
    }
 
    public NodoGenericoSimple<E> getNext() {
        return next;
    }
 
    public void setElement(E element) {
        this.dato = element;
    }
 
    public void setNext(NodoGenericoSimple<E> next) {
        this.next = next;
    }
 
}
