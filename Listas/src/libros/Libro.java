/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libros;

/**
 *
 * @author alons
 */
public class Libro {
    private String name;
    private String author;
    private String code;

    public Libro(String name, String author, String code) {
        this.name = name;
        this.author = author;
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }
    
    
}
