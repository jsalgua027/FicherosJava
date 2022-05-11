/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio1.LecturaCSV;
import ejercicio3.RegistroJSON;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author Windows10
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap<String,String> mapModulos = LecturaCSV.lecturaFicherosCSV("./nombresModulos.csv",";");
        List<RegistroJSON> notas = LecturaJSON.leerArchivoJSON1("calificacionesGrupo.json");
        List<Alumnado> alumnos = RegistroToAlumnado.registroToAlumnado(notas);
        Alumnado delia = alumnos.stream().filter(a -> a.getNombre().contains("Delia")).findFirst().get();

        AlumnadoToCsv.alumnadoToCsv(delia,mapModulos);
    }
    
}
