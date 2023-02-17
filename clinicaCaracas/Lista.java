/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaCaracas;

/**
 *
 * @author alons
 */
public class Lista {
    private Nodo pFirst;
    private Nodo pLast;
    private int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
        public boolean isEmpty(){
        return getpFirst() == null;
    }
    
    
//    VACIAR LA LISTA
    public void empty(){
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
//    AGREGAR UN NODO AL FINAL DE LA LISTA
    public void append(Cliente data){
        Nodo nuevo = new Nodo(data);
        if (isEmpty()){
            pFirst = nuevo;
            pLast = nuevo;
        }else{
            Nodo aux = getpLast();
            aux.setpNext(nuevo);
            pLast = nuevo;
        }
        size ++;
    }
    
    
    public void deletepFirst(){
        if (!isEmpty()){
            if (getSize()<1){
                pFirst = null;
            }else{
                pFirst = getpFirst().getpNext();
            }
        }
    }

    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
    
    
}
