package proyectobancos.Administradores.estructuras.colas;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Clase que permitirá ordenar los datos en la cola según su prioridad.
 * @param <E> tipo de dato
 */
public class ColaPrioridad <E> extends AbstractCollection <E> 
                    implements QueuePropia<E> {
    
    private int TamañoArbol;   // Numero de elementos en el arbol
    private static final int TamFijo = 100; 
    private Comparator <? super E> CMP;
    private E[] Arreglo; // El arreglo de hojos del arbol
    
    /**
     * Método contructor de la clase
     */
    public ColaPrioridad() {
        TamañoArbol = 0;
        Arreglo = (E[]) new Object[TamFijo + 1];
        
        CMP = null;
    }
    
    /**
     * Método constructor de la clase
     * @param CMP 
     */
    public ColaPrioridad(Comparator <? super E> CMP ) {
        TamañoArbol = 0;
        Arreglo = (E[]) new Object[TamFijo + 1];
        
        this.CMP = CMP;
    }
    
    /**
     * Método constructor de la clase 
     * @param CMP
     */
    public ColaPrioridad(Collection <? extends E> CMP) {
        TamañoArbol = CMP.size( );
        Arreglo = (E[]) new Object[(TamañoArbol + 2) * 11 / 10 ];
        
        this.CMP = null;
        
        int i = 1;
        //Ciclo que va a ir asignando los datos en el arreglo
        for(E item: CMP )
            Arreglo[i++] = item;
        
        ConstruyeArbol();
    }
    
    /**
     * Establece propiedades de orden de objetos. Se ejecuta en tiempo lineal.
     */
    private void ConstruyeArbol( ){
        for (int i = TamañoArbol / 2; i>0; i--)
            percolateDown(i);
    }
    
    /**
     * Compara el Arbol de la Izquierda y el Arbol de la Derecha usando 
     * comparaciones
     */
    private int ComparaArboles(E ArbolIzq, E ArbolDer) {
        if (CMP == null)
            return ((Comparable) ArbolIzq).compareTo(ArbolDer);
        else
            return CMP.compare(ArbolIzq, ArbolDer);    
    }
    
    /**
     * Añade datos a ColaPrioridad.
     * @param Dato
     * @return true.
     */
    @Override
    public synchronized boolean add(E Dato)
    {
        if( TamañoArbol + 1 == Arreglo.length )
            DobleArreglo( );

        int hole = ++TamañoArbol;
        Arreglo[0] = Dato;
        
        for( ; ComparaArboles(Dato, Arreglo[ hole / 2 ] ) < 0; hole /= 2 )
            Arreglo[ hole ] = Arreglo[ hole / 2 ];
        
        Arreglo[ hole ] = Dato;
        
        return true;
    }
     
    
    
    
    
    
    
    /**
     * Returns the number of items in this ColaPrioridad.
     * @return the number of items in this ColaPrioridad.
     */
    @Override
    public int size( )
    {
        return TamañoArbol;
    }
    
    /**
     * Make this ColaPrioridad empty.
     */
    @Override
    public void clear( )
    {
        TamañoArbol = 0;
    }
    
    /**
     * Returns an iterator over the elements in this ColaPrioridad.
     * The iterator does not view the elements in any particular order.
     */
    @Override
    public Iterator<E> iterator( )
    {
        return new Iterator<E>( )
        {
            int current = 0;
            
            @Override
            public boolean hasNext( )
            {
                return current != size( );
            }
            
            @Override
            public E next( )
            {
                if( hasNext( ) )
                    return Arreglo[ ++current ];
                else
                    throw new NoSuchElementException( );
            }
            
            @Override
            public void remove( )
            {
                throw new UnsupportedOperationException( );
            }
        };
    }
     
    /**
     * Returns the smallest item in the priority queue.
     * @return the smallest item.
     * @throws NoSuchElementException if empty.
     */
    @Override
    public E element( )
    {
        if( isEmpty( ) )
            throw new NoSuchElementException( );
        return Arreglo[ 1 ];
    }
    
    /**
     * Removes the smallest item in the priority queue.
     * @return the smallest item.
     * @throws NoSuchElementException if empty.
     */
    @Override
    public synchronized E remove( )
    {
        E minItem = element( );
        Arreglo[ 1 ] = Arreglo[ TamañoArbol-- ];
        percolateDown( 1 );

        return minItem;
    }


    

    

    
    

    /**
     * Internal method to percolate down in the heap.
     * @param hole the index at which the percolate begins.
     */
    private void percolateDown( int hole )
    {
        int child;
        E tmp = Arreglo[ hole ];

        for( ; hole * 2 <= TamañoArbol; hole = child )
        {
            child = hole * 2;
            if( child != TamañoArbol &&
                    ComparaArboles(Arreglo[ child + 1 ], Arreglo[ child ] ) < 0 )
                child++;
            if( ComparaArboles(Arreglo[ child ], tmp ) < 0 )
                Arreglo[ hole ] = Arreglo[ child ];
            else
                break;
        }
        Arreglo[ hole ] = tmp;
    }
    
    /**
     * Internal method to extend Arreglo.
     */
    private void DobleArreglo( )
    {
        E [ ] newArray;

        newArray = (E []) new Object[ Arreglo.length * 2 ];
        System.arraycopy(Arreglo, 0, newArray, 0, Arreglo.length);
        Arreglo = newArray;
    }
}
