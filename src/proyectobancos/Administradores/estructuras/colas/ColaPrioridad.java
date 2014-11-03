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
            HaciaAbajo(i);
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
        if (TamañoArbol+1 == Arreglo.length)
            DobleArreglo();

        int Arbolito = ++TamañoArbol;
        Arreglo[0] = Dato;
        
        for(;ComparaArboles(Dato, Arreglo[Arbolito/2]) < 0; Arbolito/=2)
            Arreglo[Arbolito] = Arreglo[Arbolito/2];
        
        Arreglo[Arbolito] = Dato;
        
        return true;
    }

    /**
     * Retorna el número de items in la cola.
     * @return the number of items in this ColaPrioridad.
     */
    @Override
    public int size(){
        return TamañoArbol;
    }
    
    /**
     * Limpia la el tamaño de la cola
     */
    @Override
    public void clear(){
        TamañoArbol = 0;
    }
    
    /**
     * Permite recorrer la estructura sin que sea necesario conocerla.
     */
    @Override
    public Iterator <E> iterator(){
        
        return new Iterator <E>(){
            int IteradorComun = 0;
            
            @Override
            public boolean hasNext(){
                return IteradorComun != size();
            }
            
            @Override
            public E next(){
                if (hasNext())
                    return Arreglo[++IteradorComun];
                else
                    throw new NoSuchElementException();
            }
            
            @Override
            public void remove(){
                throw new UnsupportedOperationException( );
            }
        };
    }
     
    /**
     * Retorna el primer elemento
     * @return int
     */
    @Override
    public E element(){
        if (isEmpty())
            throw new NoSuchElementException();
        return Arreglo[1];
    }
    
    /**
     * Eimina el primer elemento
     * @return int
     */
    @Override
    public synchronized E EliminaNodo() {
        E Minimo = element();
        Arreglo[1] = Arreglo[TamañoArbol--];
        HaciaAbajo(1);

        return Minimo;
    }

    /**
     * Método que revisa los demas datos de la cola
     */
    private void HaciaAbajo(int Arbolito){
        
        int Hijo;
        E Temp = Arreglo[ Arbolito ];

        for (; Arbolito*2 <= TamañoArbol; Arbolito=Hijo){
            Hijo = Arbolito*2;
            
            if (Hijo!=TamañoArbol && ComparaArboles(Arreglo[Hijo+1], Arreglo[Hijo])<0)
                Hijo++;
            
            if (ComparaArboles(Arreglo[Hijo],Temp)<0)
                Arreglo[Arbolito] = Arreglo[Hijo];
            else
                break;
        }
        Arreglo[Arbolito] = Temp;
    }
    
    /**
     * Método que extiende el arreglo
     */
    private void DobleArreglo(){
        E[] NuevoArreglo;

        NuevoArreglo = (E[]) new Object[Arreglo.length*2];
        System.arraycopy(Arreglo, 0, NuevoArreglo, 0, Arreglo.length);
        Arreglo = NuevoArreglo;
    }
}
