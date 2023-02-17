/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sumadiglista;

/**
 *
 * @author alons
 */
public class Functions {
    
    public int suma(Lista list){
        int suma = 0;
        Nodo aux = list.getpFirst();
        for (int i = 0; i < list.getSize(); i++){
            suma += aux.getNum();
            aux = aux.getpNext();        
        }
        return suma;
    }
    public void deleterep(Lista list){
        String used = "";
        Nodo aux = list.getpFirst();
        for(int i = 0; i < list.getSize(); i++){
            if (used.contains(Integer.toString(aux.getNum()))){
               int position = i-1;
               list.delete(position, aux);
               i -= 1;
            }else{
                used += Integer.toString(aux.getNum());
            }
            aux = aux.getpNext();
        }
        
        
        
    }
}
