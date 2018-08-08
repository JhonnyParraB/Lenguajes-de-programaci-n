/*
 * To change 1this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesregulares;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sala a
 */
public class ExpresionesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> pruebas=new ArrayList<>();
        pruebas.add("Madfjkq@hotakld.dfq.eqe.de");
        pruebas.add("aaaa____.@4848hotmail99.com.8995.rre");
        pruebas.add("C:\\Archivos de programa\\Java\\Java.exe");
        for (String posibleCorreo: pruebas){
            if (comprobarRutaArchivo(posibleCorreo))
                System.out.println(posibleCorreo+"   :   "+"ES válido");
            else
                System.out.println(posibleCorreo+"   :   "+"NO ES válido");
        }        
        
    }
    
    private static boolean comprobarCorreo (String posibleCorreo){
        return posibleCorreo.matches("[a-zA-Z]+@[a-zA-Z]+(\\.[a-zA-Z]+)+");
    }
    
    private static boolean comprobarCorreo2 (String posibleCorreo){
        return posibleCorreo.matches("[a-zA-Z][a-zA-Z0-9_\\.]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+");
    }

    private static boolean comprobarRutaArchivo (String posibleRutaArchivo){
        return posibleRutaArchivo.matches("[A-Z]:(\\\\((\\.)*[a-zA-Z ]+(\\.)*)*)+");
    }
    
    //https://www.google.com.co/search?q=perro&oq=perro&aqs=chrome..69i57.773j0j4&sourceid=chrome&es_sm=119&ie=UTF-8 
    private static boolean comprobarURL (String posibleURL){
        return posibleURL.matches("https://(//)");
    }
    
}
