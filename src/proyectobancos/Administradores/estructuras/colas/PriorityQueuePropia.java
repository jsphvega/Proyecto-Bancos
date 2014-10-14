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
public class PriorityQueuePropia <E> extends AbstractCollection <E> 
                    implements QueuePropia<E> {
    
    private int TamañoArbol;   // Numero de elementos en el arbol
    private static final int TamFijo = 100; 
    private Comparator <? super E> CMP;
    private E[] Arreglo; // El arreglo de hojos del arbol
    
    /**
     * Método contructor de la clase
     */
    public PriorityQueuePropia() {
        TamañoArbol = 0;
        Arreglo = (E[]) new Object[TamFijo + 1];
        
        CMP = null;
    }
    
    /**
     * Método constructor de la clase
     * @param CMP 
     */
    public PriorityQueuePropia(Comparator <? super E> CMP ) {
        TamañoArbol = 0;
        Arreglo = (E[]) new Object[TamFijo + 1];
        
        this.CMP = CMP;
    }
    
    /**
     * Método constructor de la clase 
     * @param CMP
     */
    public PriorityQueuePropia(Collection <? extends E> CMP) {
        TamañoArbol = CMP.size( );
        Arreglo = (E[]) new Object[(TamañoArbol + 2) * 11 / 10 ];
        
        this.CMP = null;
        
        int i = 1;
        for(E item: CMP )
            Arreglo[i++] = item;
        
        buildHeap( );
    }
    
    
    
    
    
    
     
    
    
    /**
     * Compares lhs and rhs using comparator if
 provided by CMP, or the default comparator.
     */
    private int compare( E lhs, E rhs )
    {
        if( CMP == null )
            return ((Comparable)lhs).compareTo( rhs );
        else
            return CMP.compare( lhs, rhs );    
    }
    
    /**
     * Adds an item to this PriorityQueuePropia.
     * @param x any object.
     * @return true.
     */
    @Override
    public synchronized boolean add( E x )
    {
        if( TamañoArbol + 1 == Arreglo.length )
            doubleArray( );

            // Percolate up
        int hole = ++TamañoArbol;
        Arreglo[ 0 ] = x;
        
        for( ; compare(x, Arreglo[ hole / 2 ] ) < 0; hole /= 2 )
            Arreglo[ hole ] = Arreglo[ hole / 2 ];
        Arreglo[ hole ] = x;
        
        return true;
    }
    
    /**
     * Returns the number of items in this PriorityQueuePropia.
     * @return the number of items in this PriorityQueuePropia.
     */
    @Override
    public int size( )
    {
        return TamañoArbol;
    }
    
    /**
     * Make this PriorityQueuePropia empty.
     */
    @Override
    public void clear( )
    {
        TamañoArbol = 0;
    }
    
    /**
     * Returns an iterator over the elements in this PriorityQueuePropia.
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
     * Establish heap order property from an arbitrary
     * arrangement of items. Runs in linear time.
     */
    private void buildHeap( )
    {
        for( int i = TamañoArbol / 2; i > 0; i-- )
            percolateDown( i );
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
                    compare(Arreglo[ child + 1 ], Arreglo[ child ] ) < 0 )
                child++;
            if( compare(Arreglo[ child ], tmp ) < 0 )
                Arreglo[ hole ] = Arreglo[ child ];
            else
                break;
        }
        Arreglo[ hole ] = tmp;
    }
    
    /**
     * Internal method to extend Arreglo.
     */
    private void doubleArray( )
    {
        E [ ] newArray;

        newArray = (E []) new Object[ Arreglo.length * 2 ];
        System.arraycopy(Arreglo, 0, newArray, 0, Arreglo.length);
        Arreglo = newArray;
    }
}
