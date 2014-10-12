/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectobancos.Administradores.estructuras;

public class PQNode
{
   Object data;            // Includes a field data.pValue
    PQNode leftChild; // Reference to left child.
    
    PQNode rightChild; // Reference to right child.
    
   Cliente cliente;
   
   public PQNode(Cliente pCliente)
   {
      cliente = pCliente;
      data = pCliente.valor;
      leftChild = null;
      rightChild = null;
   }

    public Cliente getCliente() {
        return cliente;
    }
   
   

    public Object getData() {
        return data;
    }
   
   
}
