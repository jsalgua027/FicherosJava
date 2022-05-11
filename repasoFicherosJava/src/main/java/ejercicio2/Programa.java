/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Windows10
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<RegistroJSON> alumnosPro = new ArrayList<>();
        alumnosPro = LecturaJSON.leerArchivoJSON("calificacionesGrupo.json");
        
        System.out.println(alumnosPro.toString());
    }
    
}
