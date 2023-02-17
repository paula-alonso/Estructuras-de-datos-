/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasConArreglos;

/**
 *
 * @author alons
 */
public class Nodo<T> {
    private T dato;
    private int pNext;

    public Nodo(T dato) {
        this.dato = dato;
        this.pNext = -1;
    }

    /**
     * @return the dato
     */
    public T getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * @return the pNext
     */
    public int getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(int pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the dato
     */

    
    
    
    
}
