/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectobancos.Administradores.estructuras.colas;

import java.util.Collection;

/**
 * QueuePropia interface.
 */
public interface QueuePropia<AnyType> extends Collection<AnyType>
{
    /**
     * Returns but does not EliminaNodo the item at the "front"
 of the queue.
     * @return the front item of null if the queue is empty.
     */
    AnyType element( );
    
    /**
     * Returns and removes the item at the "front"
     * of the queue.
     * @return the front item.
     */
    AnyType EliminaNodo( );
}
