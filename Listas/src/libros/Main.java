/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libros;

/**
 *
 * @author alons
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter","J.K. Rowling","VE-123");
        Libro libro2 = new Libro("Señor de los ","Pedro Perez","VE-155");
        Libro libro3 = new Libro("100 años de soledad","Gabriel Garcia Marquez","VE-844");
        Libro libro4 = new Libro("El Principito","Antonio Zambrano","VE-555");
        
        Lista listbook = new Lista();

        listbook.InsertAtIndex(0, libro3);


        listbook.ShowList();
    }
    
}
