/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDeFrecuencia;

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
     
    public void append(int agg){
        Nodo nuevo = new Nodo(agg);
        if (isEmpty()){
            pFirst = nuevo;
            pLast = nuevo;
                    
        }else{
            Nodo aux = getpLast();
            aux.setpNext(nuevo);
            pLast = aux.getpNext();
        }
        size++;
         }
    
    public void empty(){
        setpFirst(null);
        setpLast(null);
        size  = 0;
    }
    
   public void deletepFirst(){
        if (!isEmpty()){
            if (size<1){
                pFirst = null;
            }else{
                pFirst = pFirst.getpNext();
            }
        }}
    public void showList(){
        if (!isEmpty()){
            Nodo aux = pFirst;
            for (int i = 0; i < size; i++){
                System.out.println(aux.getDato());
                aux = aux.getpNext();
        }}}

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
