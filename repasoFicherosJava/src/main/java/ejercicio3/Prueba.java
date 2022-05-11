/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Windows10
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<RegistroJSON> calificaciones=LecturaJSON.leerArchivoJSON("calificacionesGrupo.json");
        for(RegistroJSON aux: calificaciones){
            System.out.println(aux.toString());
        }
        
         List<Alumnado>listaAlumnado=RegistrosToAlumnado.conversionListas(calificaciones);

        for(Alumnado aux: listaAlumnado){
            System.out.println(aux);
        }
        
        
    }
    
}
