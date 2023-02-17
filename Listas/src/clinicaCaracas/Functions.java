/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaCaracas;

/**
 *
 * @author alons
 */
public class Functions {
    public double Finalmonto(int precio, int edad, String sexo, String seguro){
        double monto = precio;
        if (sexo == "Fem" && edad>55){
            monto -= precio*0.25;
            
        }else if(sexo == "Masc" && edad >65){
            monto -= precio*0.25;
        }else if(seguro == "Sí"){
            monto -= precio*0.8;
        }
        return monto;
    }
    
    public String showList(Lista lista){
        String cadena = "";
        if (!lista.isEmpty()){
            int a = 0;
            cadena += "\n    CLIENTES    \n";
            Nodo aux = lista.getpFirst();
            for (int i = 0; i < lista.getSize(); i++){
                cadena+= a+".";
                cadena += aux.getCliente().getCi()+"\n";
                aux = aux.getpNext();
                a++;}
            
        }else{
            cadena = "No hay clientes";
        }
        
        return cadena;
 }
    
}
