/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author Windows10
 */
public class RegistrosToAlumnado {
    
    public static  List<Alumnado> conversionListas (List<RegistroJSON> auxEntrada){
        List<Alumnado> auxSalida = new ArrayList<>();
          for (RegistroJSON registro : auxEntrada) {
            Alumnado alumno = new Alumnado();
            alumno.setNombre(registro.getAlumnoA());
            TreeMap<String,String> notas = new TreeMap<>();

            notas.put("CEAC",registro.getcEAC());
            notas.put("EA", registro.geteA());
            notas.put("TC", registro.gettC());
            notas.put("FOL", registro.getfOL());
            notas.put("ING", registro.getiNG());
            notas.put("TII",registro.gettII());
            alumno.setNotas(notas);

            auxSalida.add(alumno);
        }
          Collections.sort(auxSalida);

        return auxSalida;
    
}

   
            
            
            
}
