/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebanovedadesjava15;

/**
 *
 * @author Windows10
 */
public class PruebaNovedadesJava15 {

    public static void main(String[] args) {
        String html = "<html>/n" + 
                      "      <body>/n" +
                      "          <p>hello, world</p>/n" +
                      "      </body>/n " +
                      "</html>/n";
        
        
        System.out.println(html);
        
        System.out.println("*********************************************************** con las triple comillas*************************************************");
        
        String html2 ="""
                      <html>/n
                           <body>/n
                                <p>hello, world</p>/n
                           </body>/n 
                      </html>/n
                      """;
        System.out.println(html2);
        
        System.out.println("********************************************************* otras pruebas**************************************************");
         String j = """
               Hola mundo
               Vamos a probar como funciona la triple comilla 
               1
               2
               3
               """;
        
         System.out.println(j);
         System.out.println("*************************************************************************************************************");
       String j2 ="hola mundo"
               + "vamos a probar";
       
        System.out.println(j2);
        
        System.out.println("****************************************************jugamos con variables y string concatenados ");
        int a =1;
        int b = 2;
        int c = 3;
        
        String resultado = "a vale="+ a + " b vale="+ b + " c vale="+c;
        System.out.println(resultado);
            
        System.out.println("*******************************************************Triple comilla con variable y estring concatenado");
        
      
        
        
    }
       
       
}
