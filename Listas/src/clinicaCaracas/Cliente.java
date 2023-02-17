/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaCaracas;

/**
 *
 * @author alons
 */
public class Cliente {
    private long ci;
    private int edad;
    private String sexo;
    private String seguro;
    private String tipoest;

    public Cliente(long ci, int edad, String sexo, String seguro, String tipoest) {
        this.ci = ci;
        this.edad = edad;
        this.sexo = sexo;
        this.seguro = seguro;
        this.tipoest = tipoest;
    }
    public void showClient(){
        System.out.println("CI: "+ci);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("Seguro: "+seguro);
        System.out.println("Estudio: "+tipoest);
    }
    /**
     * @return the ci
     */
    public long getCi() {
        return ci;
    }

    /**
     * @param ci the ci to set
     */
    public void setCi(long ci) {
        this.ci = ci;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the seguro
     */
    public String getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    /**
     * @return the tipoest
     */
    public String getTipoest() {
        return tipoest;
    }

    /**
     * @param tipoest the tipoest to set
     */
    public void setTipoest(String tipoest) {
        this.tipoest = tipoest;
    }
    
}
