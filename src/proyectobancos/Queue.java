/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectobancos;

/**
 * @author Joseph Vega
 * @author Lucia Solis
 * @author Miller Ruiz
 */
public class Queue{

    public Clientes [] arreglo;
    public int first;
    public int last;
    public int size;
    public int maxSize = 1000;
    public int totalSize;

    public Queue (){
        this.arreglo = new Clientes [maxSize];
        this.size = 0;
    }
    
    public void queue (Clientes cliente){
        if (this.size < this.maxSize){
            if (isEmpty()){
                this.arreglo [0] = cliente;
                this.first = this.last = 0;
            }
            else{
                last = (last + 1) % maxSize;
                arreglo [last] = cliente;
            }
            size++;
            totalSize++;
        }
        else{
            System.out.println("La cola esta llena");
        }
    }

    public Clientes deque (){
            Clientes resultado = null;
            if (this.isEmpty()==true){
                System.out.println("No hay mas personas en cola");
            }
            else{
                size--;
                resultado = arreglo [first];
                first = (first+1) % maxSize;
            }
            return resultado;
    }
    
    public Clientes getPersona(){
        Clientes persona = arreglo [first];
        return persona;
    }
    
    public Clientes recorrerCola(int indice){
        Clientes persona = arreglo [indice];
        return persona;
    }

    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getTotalSize(){
        return this.totalSize;
    }

    public int getSize(){
        return this.size;
    }
    
   /* public static void main (String [] args){
        Clientes hola = new Clientes("Miller","R","milleniumruiz@gmail.com","27/010/2014","10:00");
        Clientes hola1 = new Clientes("Juan","D","miller.ruizurbina@gmail.com","27/09/2014","1:00");
        Queue cola = new Queue();
        cola.queue(hola);
        cola.queue(hola1);
        cola.queue(hola2);
        System.out.println(cola.deque().getNombre());
        System.out.println(cola.deque().getNombre());
        cola.deque();
        cola.deque();
    }*/
}