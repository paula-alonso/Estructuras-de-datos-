/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasConArreglos;

/**
 *
 * @author alons
 */
public class Lista<T> {
    private int pFirst;
    private int pLast;
    private int size;
    private Nodo[] array;

    public Lista(int max) {
        this.pFirst = -1;
        this.pLast = -1;
        this.size = 0;
        this.array = new Nodo[max];
    }
    
    public boolean isEmpty(){
        return pFirst == -1;
    }
    
    public void Empty(){
        pFirst = -1;
        pLast = -1;
        size = 0;
        array = new Nodo[this.array.length];
    }
    
    public boolean isFull(){
        return size == array.length;
    }
    
    public int SearchForSpot(){
        for (int i = 0; i<array.length;i++){
            if(array[i] == null){
                return i;
            }
        }return -1;
    }
    
    public void AddAtTheStart(T data){
        Nodo nuevo = new Nodo(data);
        if(!isFull()){
            int postion = this.SearchForSpot();
            array[postion] = nuevo;
            if (!isEmpty()){
                array[postion].setpNext(pFirst);
                pFirst = postion;
            }else{
                pFirst = pLast = postion;
            }
        }size++;
    }
   
    public void AddAtTheEnd(T data){
        Nodo nuevo = new Nodo(data);
        if(!isFull()){
            int postion = this.SearchForSpot();
            array[postion] = nuevo;
            if (!isEmpty()){
                array[pLast].setpNext(postion);
                pLast = postion;
            }else{
                pFirst = pLast = postion;
            }size++;
        }
    }
    
    public String Imprimir(){
        String cadena = "";
        int position = pFirst;
        while(position!= -1){
            cadena += array[position].getDato() +"\n";
            position = array[position].getpNext();
        }return cadena;
    }
    
    public void InsertOrdered(T data){
        if (!isFull()){
            if (isEmpty()){
                this.AddAtTheStart(data);
            }else if(String.valueOf(data).compareTo(String.valueOf(array[pFirst].getDato()))<=0){
                this.AddAtTheStart(data);
            }else if(String.valueOf(data).compareTo(String.valueOf(array[pLast].getDato()))>=0){
                this.AddAtTheEnd(data);
            }else{
                int prev = pFirst;
                int current = array[pFirst].getpNext();
                while (String.valueOf(data).compareTo(String.valueOf(array[current].getDato()))>0){
                    prev = current;
                    current = array[current].getpNext();
                }
                Nodo nuevo = new Nodo(data);
                int position = this.SearchForSpot();
                array[position] = nuevo;
                array[prev].setpNext(position);
                array[position].setpNext(current);
                size++;
            }
        }
    }
    /**
     * @return the pFirst
     */
    public int getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(int pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public int getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(int pLast) {
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

    /**
     * @return the array
     */
    public Nodo[] getArray() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setArray(Nodo[] array) {
        this.array = array;
    }
    
    
}
