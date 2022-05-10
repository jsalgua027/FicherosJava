/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Windows10
 */
public class LecturaCSV {

    public static Map<String, String> lecturaFicherosCSV(String nombreFichero) throws FileNotFoundException {
        String idFichero = nombreFichero;
        Map<String, String> listaAux = new TreeMap<String, String>();
        String[] tokens;
        String linea;

        // muestro por consola el fichero a leer
        System.out.println("Leyendo el fichero: " + idFichero);

        // inicializo el flujo de lectura en funcion del idFichero
        try ( Scanner datosFichero = new Scanner(new File(idFichero), "ISO-8859-1")) {

             datosFichero.nextLine();
            while (datosFichero.hasNextLine()) {

                linea = datosFichero.nextLine();
              
                tokens = linea.split(";");

                Modulo m1 = new Modulo();
                m1.setInicial(tokens[0]);
                m1.setDesacripcion(tokens[1].replaceAll(" ", ""));

                listaAux.put(m1.getInicial(), m1.getDesacripcion());

            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaAux;
    }
}
