/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sumadiglista;

import javax.swing.JOptionPane;

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
        return pFirst == null;
    }
    public void empty(){
        pFirst = null;
        pLast = null;
        size = 0;
    }
    public void showList(){
        if (!isEmpty()){
            Nodo aux = pFirst;
            for (int i = 0; i < size; i++){
                System.out.println(aux.getNum());
                aux = aux.getpNext();
               
        }}}
    
    public void append(int agg){
        Nodo nuevo = new Nodo(agg);
        if (isEmpty()){
            pFirst = nuevo;
            pLast = nuevo;
        }else{
            Nodo aux = pLast;
            aux.setpNext(nuevo);
            pLast = aux.getpNext();
        }size++;
    }
    
    public void deleteFirst(){
        if (!isEmpty()){
            if(size<1){
                pFirst = null;
            }else{
                pFirst = pFirst.getpNext();
            }
    }size--;
    }
    public void delete(int position, Nodo del){
        Nodo aux = pFirst;
        for (int i = 0; i<position; i++){
            aux = aux.getpNext();
            
        }
        if (del.getpNext() == null){
            pLast = aux;
        
        }else{
            aux.setpNext(del.getpNext());
        }
        size--;
    }
    
    public void postinsertar(int position, int num){
        Nodo agg = new Nodo (num);
        if(position<1){
            agg.setpNext(pFirst);
            pFirst = agg;
        }else{
            Nodo aux = pFirst;
        for (int i = 0; i < position; i++){
            aux = aux.getpNext();
        }
        agg.setpNext(aux.getpNext());
        aux.setpNext(agg);
        }
        
        size++;
    }
    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
    
    
    
}
