/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sumadiglista;

/**
 *
 * @author alons
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Lista list = new Lista();
        Functions func = new Functions();
        list.append(5);
        list.append(5);
        list.append(9);
        list.append(5);
        list.append(57);
        
        list.postinsertar(1, 2);
        list.postinsertar(0, 0);
        list.showList();
    }
    
}
