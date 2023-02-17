/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libros;

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
   
    
    
    public void Empty(){
        pFirst = null;
        pLast = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return pFirst == null;
    }
     
    public void append(Libro agg){
        Nodo nuevo = new Nodo(agg);
        if (isEmpty()){
            pFirst = nuevo;
            pLast = nuevo;
        
        }else{
            Nodo aux = pLast;
            aux.setpNext(nuevo);
            pLast = nuevo;
        }
        size++;
    }
    public void DeleteFirst(){
        if(!isEmpty()){
            if(size>1){
                pFirst = pFirst.getpNext();
            }else{
                pFirst = null;
            }
            
        }
        size--;
    }
    
    public void DeleteIndex(int index){
        if (!isEmpty()){
            if(index>size){
                JOptionPane.showMessageDialog(null, "El index no está en la lista");
            }else{
                Nodo aux = pFirst;
                for (int i = 0; i<index-1; i++){
                    aux = aux.getpNext();
                }
                Nodo temp = aux.getpNext();
                aux.setpNext(temp.getpNext());
            }
            size--;
        }
    }
    
    public void InsertAtIndex(int index, Libro libro){
        Nodo nodo = new Nodo(libro);
        if (!isEmpty()){
            if(index>size){
                JOptionPane.showMessageDialog(null, "No existe ese index");
            }else{
                if(index!=0){
                Nodo aux = pFirst;
                for (int i = 0; i<index-1; i++){
                   aux = aux.getpNext();
                }
                    nodo.setpNext(aux.getpNext());
                    aux.setpNext(nodo);

            }else{
                nodo.setpNext(pFirst);
                pFirst = nodo;
                }
            }
            size++;   
            }

        
    }
    
    public void ShowList(){
        Nodo aux = pFirst;
        for (int i = 0; i<size; i++){
            System.out.println(aux.getLibro().getName());
            aux = aux.getpNext();
        }
    }
}
