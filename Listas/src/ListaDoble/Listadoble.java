/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDoble;

import javax.swing.JOptionPane;

/**
 *
 * @author alons
 */
public class Listadoble {
    private Nodo pFirst;
    private Nodo pLast;
    private int size;

    public Listadoble() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
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

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        return pFirst == null;
    }
    
    public void Empty(){
        while(!isEmpty()){
            Nodo temp = pLast;
            pLast = pLast.getpPrev();
            temp.setpPrev(null);
            pLast.setpNext(null);  
        }
    }
    
    public void InsertinFinal(int agg){
        Nodo nuevo = new Nodo(agg);
        if (isEmpty()){
            pFirst = nuevo;
            pLast = nuevo;
        }else{
            
            nuevo.setpPrev(pLast);
            pLast.setpNext(nuevo);
            pLast = nuevo;
            
        }
        size ++;
    }
    
    public void InsertinIndex(int index, int num){
        Nodo nuevo = new Nodo(num);
        if (!isEmpty()){
            int count = 0;
            Nodo aux = pFirst;
            while(count<(index-1)){
                aux = aux.getpNext();
                count++;
            }
            nuevo.setpNext(aux.getpNext());
            nuevo.setpPrev(aux);
            aux.getpNext().setpPrev(nuevo);
            aux.setpNext(nuevo);
            }
            size++;   
    }
    
    public void deleteFinal(){
        if(!isEmpty()){
            if(size!=1){
                Nodo aux = pFirst;
                pLast.setpPrev(null);
                while(aux.getpNext()!= pLast){
                    aux = aux.getpNext();
                }
                aux.setpNext(null);
                pLast = aux;
                
            }else{
                pFirst = null;
                pLast = null;
            }
            size--;
            
        }
    }
    
    public void DeleteIndex(int index){
        if(!isEmpty()){
            Nodo aux = pFirst;
            int cont = 0;
            while(cont<(index-1) && aux.getpNext() != null){
                aux = aux.getpNext();
                cont++;
            }
            Nodo temp = aux.getpNext();
            aux.setpNext((temp.getpNext()));
            temp.getpNext().setpPrev(aux);
            temp.setpPrev(null);
            temp.setpNext(null);
        }size--;
    }
    
    public void DeleteFirst(){
        if (size == 1){
            pFirst = null;
            pLast = null;
            size = 0;
        }else{
        Nodo aux = pFirst.getpNext();
        pFirst.setpNext(null);
        pFirst = aux;
        pFirst.setpPrev(null);
        
        }size--;
    }
    
    public void ShowList(){
        if (!isEmpty()){
            Nodo aux = pFirst;
            for (int i = 0; i<size; i++){
                System.out.println(aux.getNum());
                aux = aux.getpNext();
            }
        }
    }
    
    
    
    
}
