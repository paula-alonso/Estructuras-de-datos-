/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDeFrecuencia;

/**
 *
 * @author alons
 */
public class Frecuencia {
    private int num;
    private int frec;

    public Frecuencia(int num) {
        this.num = num;
        this.frec = 0;
    }
    

    public void setFrec(int frec) {
        this.frec += frec;
    }

    public int getNum() {
        return num;
    }

    public int getFrec() {
        return frec;
    }
    
}
