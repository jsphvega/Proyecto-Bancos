package proyectobancos.Administradores;

/**
 * Clase que implementa el metodo de ordenamiento Mergesort. Este permite 
 * ordenar los datos en pares e ir juntandolos nuevamente.
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public final class MergeSort {
    
    private final Object[][] Arreglo;    //Para almacenar arreglos de la tabla.
    
    /**
     * Metodo constructor que asigna datos al arreglo.
     * @param Arreglo = Arreglo que almacena los datos. 
     * @param Columna = Revisa cual columna se debe ordenar
     */
    public MergeSort(Object[][] Arreglo, int Columna) {
        this.Arreglo = Arreglo;
        MergeSort(0, Arreglo.length - 1, Columna); //llama al proceso inmediatamente
    }
    
    /**
     * Método que devuelve el arreglo.
     * @return int[] Arreglo. 
     */
    public Object[][] getArreglo() {
        return Arreglo;
    }

    /**
     * Método que fragmenta el arreglo o la lista para luego agruparlos en pares
     * para su posterior ordenamiento.
     * @param Inicio = Almacena la posición inicial de los datos.
     * @param Fin = Almacena la posición final de los datos. 
     * @param Columna  = Revisa cual columna se debe ordenar
     */
    public void MergeSort(int Inicio, int Fin, int Columna){
        
        //Valida que la posición inicial se encuentre antes de la final.
        if (Inicio < Fin){
            int Mitad = (Fin - Inicio) / 2 + Inicio;
            
            //Llamada recursiva para la fragmentación de datos.
            MergeSort(Inicio, Mitad, Columna);
            MergeSort(Mitad + 1, Fin, Columna);
            
            //Método de ordenamiento. 
            OrdenamientoArreglo(Inicio, Fin, Columna);
        }
    }
    
    /**
     * Método que permite el ordenamiento de los datos del arreglo.
     * @param Inicio = Almacena la posición inicial del arreglo.
     * @param Fin = Almacena la posición final del arreglo.
     * @param Columna  = Revisa cual columna se debe ordenar
     */
    public void OrdenamientoArreglo(int Inicio, int Fin, int Columna){  
        
        //Ciclo que itera por cada posición de un rango determinado.
        for (int Izq = Inicio; Izq < Fin; Izq++){
            
            //Ciclo que indica la posicíon donde se encuentra situado.
            for (int Der = Izq + 1; Der <= Fin; Der++){
                
                String DatoDerecha = String.valueOf(Arreglo[Izq][Columna]);
                String DatoIzquierda = String.valueOf(Arreglo[Der][Columna]);
                
                //Compara dos datos de la lista
                if (DatoDerecha.compareTo(DatoIzquierda) > 0){
                    Object temp[] = Arreglo[Der];
                    Arreglo[Der] = Arreglo[Izq];
                    Arreglo[Izq] = temp;
                }
            }
        }
    }   
}