/*
 * To change this license cabezaer, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobancos.Administradores.estructuras;

/**
 *
 * @author Lucia
 */
public class ListaSimplementeEnlazadaGenerica<E> {

    protected NodoGenericoSimple<E> cabeza, cola;
    protected long size;

    /**
     * Constructor de la lista
     */
    public ListaSimplementeEnlazadaGenerica() {
        cabeza = null;
        cola = null;
        size = 0;
    }

    /**
     *
     * @param NodoGenericoSimple Este metodo agrega al inicio el elemento a
     * insertar
     */
    public void agregarAlInicio(NodoGenericoSimple<E> NodoGenericoSimple) {

        if (cola == null) {
            cola = NodoGenericoSimple;
        }
        NodoGenericoSimple.setNext(cabeza);
        cabeza = NodoGenericoSimple;
        size++;
    }

    /**
     * Agrega despues de cierto nodo
     *
     * @param actualNodoGenericoSimple
     * @param nuevoNodoGenericoSimple
     */
    public void agregarDespues(NodoGenericoSimple<E> actualNodoGenericoSimple, NodoGenericoSimple<E> nuevoNodoGenericoSimple) {
        if (actualNodoGenericoSimple == cola) {
            cola = nuevoNodoGenericoSimple;
        }
        nuevoNodoGenericoSimple.setNext(actualNodoGenericoSimple.getNext());
        actualNodoGenericoSimple.setNext(nuevoNodoGenericoSimple);

        size++;
    }

    /**
     * Agrega al final de la lista
     *
     * @param NodoGenericoSimple
     */
    public void agregarAlFinal(NodoGenericoSimple<E> NodoGenericoSimple) {

        if (cola == null) {
            agregarAlInicio(NodoGenericoSimple);
        } else {

            NodoGenericoSimple.setNext(null);
            cola.setNext(NodoGenericoSimple);
            cola = NodoGenericoSimple;
            size++;
        }
    }

    /**
     * Elimina el primero de la lista
     *
     * @return el elemento eliminado
     */
    public NodoGenericoSimple<E> eliminarPrimero() {
        if (cabeza == null) {
            System.err.println("Error:  La lista esta vacia");
        }

        NodoGenericoSimple<E> temp = cabeza;

        cabeza = cabeza.getNext();
        temp.setNext(null);
        size--;

        return temp;

    }

    /**
     *
     * @return
     */
    public NodoGenericoSimple<E> eliminarUltimo() {

        NodoGenericoSimple<E> NodoGenericoSimpleAnterior;
        NodoGenericoSimple<E> NodoGenericoSimpleARemover;

        if (size == 0) {
            System.err.println("Error:  La lista esta vacia");
        }

        NodoGenericoSimpleAnterior = obtenerPrimero();

        for (int i = 0; i < size - 2; i++) {
            NodoGenericoSimpleAnterior = NodoGenericoSimpleAnterior.getNext();
        }

        NodoGenericoSimpleARemover = cola;

        NodoGenericoSimpleAnterior.setNext(null);
        cola = NodoGenericoSimpleAnterior;
        size--;

        return NodoGenericoSimpleARemover;
    }

    /**
     * Elimina el valor de entrada
     *
     * @param NodoGenericoSimpleAEliminar
     */
    public void eleminar(NodoGenericoSimple<E> NodoGenericoSimpleAEliminar) {
        NodoGenericoSimple<E> NodoGenericoSimpleAnterior, actualNodoGenericoSimple;

        if (size == 0) {
            System.err.println("Error: La lista esta vacia");
        }

        actualNodoGenericoSimple = obtenerPrimero();
        if (actualNodoGenericoSimple == NodoGenericoSimpleAEliminar) {
            eliminarPrimero();
        }
        actualNodoGenericoSimple = obtenerUltimo();
        if (actualNodoGenericoSimple == NodoGenericoSimpleAEliminar) {
            eliminarUltimo();
        }

        if (size - 2 > 0) {
            NodoGenericoSimpleAnterior = obtenerPrimero();
            actualNodoGenericoSimple = obtenerPrimero().getNext();
            for (int count = 0; count < size - 2; count++) {
                if (actualNodoGenericoSimple == NodoGenericoSimpleAEliminar) {
                    // eleminar current NodoGenericoSimple
                    NodoGenericoSimpleAnterior.setNext(actualNodoGenericoSimple.getNext());
                    size--;
                    break;
                }

                NodoGenericoSimpleAnterior = actualNodoGenericoSimple;
                actualNodoGenericoSimple = actualNodoGenericoSimple.getNext();
            }
        }

    }

    // The gets to return the cabeza and/or cola NodoGenericoSimples and size of the list
    public NodoGenericoSimple<E> obtenerPrimero() {
        return cabeza;
    }

    public NodoGenericoSimple<E> obtenerUltimo() {
        return cola;
    }

    public long getSize() {
        return size;
    }

    // merge sort
    public <E extends Comparable<? super E>> NodoGenericoSimple<E> mergeSortList(NodoGenericoSimple<E> head) {

        if (head == null || head.getNext() == null) {
            return head;
        }

        // cuenta el total de elementos
        int contador = 0;
        NodoGenericoSimple<E> nodoContador = head;
        while (nodoContador != null) {
            contador++;
            nodoContador = nodoContador.getNext();
        }

        // divide la lista
        int middle = contador / 2;

        NodoGenericoSimple<E> left = head;
        NodoGenericoSimple<E> right = null;
        NodoGenericoSimple<E> pivote = head;
        int countHalf = 0;
        while (pivote != null) {
            countHalf++;
            NodoGenericoSimple<E> next = pivote.getNext();

            if (countHalf == middle) {
                pivote.setNext(null);
                right = next;
            }
            pivote = next;
        }

        // now we have two parts l and r, recursively sort them
        NodoGenericoSimple<E> h1 = mergeSortList(left);
        NodoGenericoSimple<E> h2 = mergeSortList(right);

        // merge together
        NodoGenericoSimple<E> merged = merge(h1, h2);

        return merged;
    }

    private <E extends Comparable<? super E>> NodoGenericoSimple<E> merge(
            NodoGenericoSimple<E> izquierdo, NodoGenericoSimple<E> derecho) {

        NodoGenericoSimple<E> pivoteIzquierdo = izquierdo;
        NodoGenericoSimple<E> pivoteDerecho = derecho;

        NodoGenericoSimple<E> cabezaFalsa = new NodoGenericoSimple<E>();
        NodoGenericoSimple<E> nodoNuevo = cabezaFalsa;

        while (pivoteIzquierdo != null || pivoteDerecho != null) {

            if (pivoteIzquierdo == null) {
                nodoNuevo.next = new NodoGenericoSimple<E>(pivoteDerecho.getElement(), null);
                pivoteDerecho = pivoteDerecho.next;
                nodoNuevo = nodoNuevo.next;
            } else if (pivoteDerecho == null) {
                nodoNuevo.next = new NodoGenericoSimple<E>(pivoteIzquierdo.getElement(), null);
                pivoteIzquierdo = pivoteIzquierdo.next;
                nodoNuevo = nodoNuevo.next;
            } else {
                if ((pivoteIzquierdo.getElement()).compareTo(pivoteDerecho.getElement()) < 0) {
                    // if(fakeHead)
                    nodoNuevo.next = new NodoGenericoSimple<E>(pivoteIzquierdo.getElement(), null);
                    pivoteIzquierdo = pivoteIzquierdo.next;
                    nodoNuevo = nodoNuevo.next;
                } else if ((pivoteIzquierdo.getElement()).compareTo(pivoteDerecho.getElement()) < 0) {
                    nodoNuevo.next = new NodoGenericoSimple<E>(pivoteIzquierdo.getElement(), null);
                    nodoNuevo.next.next = new NodoGenericoSimple<E>(pivoteIzquierdo.getElement(), null);
                    nodoNuevo = nodoNuevo.next.next;
                    pivoteIzquierdo = pivoteIzquierdo.next;
                    pivoteDerecho = pivoteDerecho.next;

                } else {
                    nodoNuevo.next = new NodoGenericoSimple<E>(pivoteDerecho.getElement(), null);
                    pivoteDerecho = pivoteDerecho.next;
                    nodoNuevo = nodoNuevo.next;
                }
            }
        }

        // printList(fakeHead.next);
        return cabezaFalsa.next;
    }

    public static <E extends Comparable<? super E>> void printList(NodoGenericoSimple<E> x) {
        if (x != null) {
            System.out.print(x.getElement() + " ");
            while (x.next != null) {
                System.out.print(x.next.getElement() + " ");
                x = x.next;
            }
            System.out.println();
        }

    }

}
