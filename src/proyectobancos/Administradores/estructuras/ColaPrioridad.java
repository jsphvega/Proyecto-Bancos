/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectobancos.Administradores.estructuras;



public class ColaPrioridad
{
   PQNode topOfTheHeap;  // Root node of the binary tree
   
   public ColaPrioridad()
   {
      topOfTheHeap = null;
   }
   
   public boolean isEmpty()
   {
      return topOfTheHeap == null;
   }
   
   public void insert(Cliente item)
   {
      PQNode temp = new PQNode(item);
      if (topOfTheHeap == null)
         topOfTheHeap = temp;
      else
         topOfTheHeap = merge(temp,topOfTheHeap);
   }



   public PQNode delete()
   {
      PQNode temp = topOfTheHeap;
      if (topOfTheHeap.leftChild == null && topOfTheHeap.rightChild == null)
      {
         topOfTheHeap = null;
      }
      else if (topOfTheHeap.rightChild == null)
      {
         topOfTheHeap = topOfTheHeap.leftChild;
      }
      else if (topOfTheHeap.leftChild == null)
      {
         topOfTheHeap = topOfTheHeap.rightChild;
      }
      else
      {
         topOfTheHeap = merge(topOfTheHeap.leftChild, topOfTheHeap.rightChild);
      }
      return temp;
   }
   
   private PQNode merge(PQNode leftHeap, PQNode rightHeap)
   {
      // Make sure the heap with the higher priority at its root is at the left.
      if ((Integer)leftHeap.data < (Integer)rightHeap.data)
      {
         PQNode temp = leftHeap;
         leftHeap = rightHeap;
         rightHeap = temp;
      }
      // Merge the heaps by using the root of the leftHeap as the root of the combined heap.
      if (leftHeap.leftChild == null)
      {
         leftHeap.leftChild = rightHeap;
      }
      else if (leftHeap.rightChild == null)
      {
         leftHeap.rightChild = rightHeap;
      }
      else if ((Integer)leftHeap.leftChild.data > (Integer)leftHeap.rightChild.data)
      {
         leftHeap.leftChild = merge(leftHeap.leftChild, rightHeap);       
      }
      else
      {
         leftHeap.rightChild = merge(leftHeap.rightChild, rightHeap);
      }
      return leftHeap;
   }
}