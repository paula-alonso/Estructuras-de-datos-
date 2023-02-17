/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ListaDeFrecuencia;

/**
 *
 * @author alons
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista list = new Lista();
        list.append(2);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(4);
        list.append(4);
        list.append(2);
        Lista listfrec = new Lista(); 
        String used = "";
        int cont = 0 ;
        Nodo aux2 = list.getpFirst();
        
        while(cont<list.getSize()){
            
            Nodo aux = list.getpFirst();
            Frecuencia frec = new Frecuencia(aux2.getDato());
            for (int i = 0; i < list.getSize(); i++){
                int num = aux.getDato();
                if (frec.getNum() == num){
                    frec.setFrec(1);
                }
                aux = aux.getpNext();

            }
            if (!used.contains(Integer.toString(aux2.getDato()))){
                listfrec.append(frec.getFrec());
            }
            used += Integer.toString(aux2.getDato());
            aux2 = aux2.getpNext();
            cont+=1;
        }
        listfrec.showList();
    }
    
}
