/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Windows10
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
          Map<String, String> listaModulos = new TreeMap<String, String>();
       listaModulos= LecturaCSV.lecturaFicherosCSV("nombresModulos.csv");
        System.out.println(listaModulos);
        
        
    }
    
}
