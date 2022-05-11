/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Windows10
 */
public class LecturaJSON {
    
   public static ArrayList<RegistroJSON> leerArchivoJSON(String nombre){
        ArrayList<RegistroJSON> alumnos = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();

        try {
            alumnos.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, RegistroJSON.class)));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return alumnos;
    }
    
}
