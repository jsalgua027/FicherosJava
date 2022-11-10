/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4a_nacho_salcedo;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author nacho
 *
 *
 * pares y nones
 *
 * menu iniciar y salir que se repita
 *
 * dos jugadores uno es la maquina
 *
 * 1 elegir (pares o nones) usuario la maquina es lo contrario 2 elegir numero
 * de dedos usuario y maquina el numero de dedos random 4 buscamos ganador y
 * mostramos
 *
 *
 * -------una vez que tengamos una partida correcta----------
 *
 * lo hacemos para una ronda de 10
 *
 */
public class ParesYNones {

    /**
     * @param args the command line arguments
     */
    private static Random numerosRandom = new Random();
    private static int JugadorNumeroDedos = 0;
    private static int maquinaNumeroDedos = 0;
    private static final String PARES = "pares";
    private static final String NONES = "nones";

    private static final String menuJuego = """
                                   
                                   ***********************Bienvenido a Pares y Nones******************
                                   
                                                    -Escriba INICIAR para comenzar el programa
                                                    -Escriba SALIR  para finalizar el programa
                                   
                                   *********************************************************************
                                   """;

    private static final String paresONones = """
                                            
                                                    ¿Que elijes Pares o Nones?
                                            
                                            """;

    private static final String rondas = """
                                                En este juego no existe el empate elige rondas Impares
                                                            ¿Cuantas rondas quieres jugar?
                                            
                                            """;

    //*******************MENU INICIAL***************
    //muestro menu y meto dato
    private static String muestroPidoMenu() {
        String opcion;

        opcion = JOptionPane.showInputDialog(menuJuego);

        return opcion;
    }

    // valido opcion 
    public static boolean esValidoOpcion(String opcion) {

        return opcion.equalsIgnoreCase("iniciar") || opcion.equalsIgnoreCase("salir");
    }

    //gestiono menu
    public static String gestionoMenu() {
        String opcion;
        do {

            opcion = muestroPidoMenu();

        } while (!esValidoOpcion(opcion));

        return opcion;
    }

    //******************SELECCION Y GESTION DE RONDAS*************
    // muestro y pido Numero de rondas
    private static int muestroPidoRondas() {
        int numeroRondas = 0;
        boolean repetir = true;
        do {
            repetir = true;

            do {

                try {

                    numeroRondas = Integer.parseInt(JOptionPane.showInputDialog(rondas));
                    repetir = false;

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "El dato Introducido es erroneo");
                    //limpio buffer

                }

            } while (repetir);

        } while (numeroRondas < 1 || numeroRondas % 2 == 0);

        return numeroRondas;
    }

    // seleccion de pares y nones
    //*******************SELECCION DE PARES Y NONES****************
    public static String seleccionParesYNones() {
        String opcion;
        do {

            opcion = JOptionPane.showInputDialog(paresONones);
        } while (!(opcion.equalsIgnoreCase("pares") || opcion.equalsIgnoreCase("nones")));

        return opcion;
    }

    //selecion de manos 
    private static String cuantasManos() {
        String opcion;
        do {

            opcion = JOptionPane.showInputDialog("¿Con Una o dos Manos?");

        } while (!(opcion.equalsIgnoreCase("Una") || opcion.equalsIgnoreCase("Dos")));

        return opcion;
    }

    //***************SOLICITUD DE DEDOS MAQUINA Y JUGADOR
    public static int numeroDedosJugador(String manos) {
        JugadorNumeroDedos = 0;
        boolean repetir = true;

        if (manos.equalsIgnoreCase("una")) {
            do {

                do {

                    try {

                        JugadorNumeroDedos = Integer.parseInt(JOptionPane.showInputDialog("Inidica el numero de Dedos"));
                        repetir = false;

                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "El dato Introducido es erroneo");
                        //limpio buffer

                    }

                } while (repetir);

            } while (JugadorNumeroDedos > 5);

        } else if (manos.equalsIgnoreCase("dos")) {
            do {

                do {

                    try {

                        JugadorNumeroDedos = Integer.parseInt(JOptionPane.showInputDialog("Inidica el numero de Dedos"));
                        repetir = false;

                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "El dato Introducido es erroneo");
                        //limpio buffer

                    }

                } while (repetir);
            } while (JugadorNumeroDedos > 10);

        }

        return JugadorNumeroDedos;

    }

    //metodo numeroMaquina si es a una mano 
    public static int numeroDedosMaquina(String manos) {

        if (manos.equalsIgnoreCase("una")) {
            maquinaNumeroDedos = numerosRandom.nextInt(5 - 0 + 1) + 0;

        } else if (manos.equalsIgnoreCase("dos")) {

            maquinaNumeroDedos = numerosRandom.nextInt(10 - 0 + 1) + 0;
        }

        return maquinaNumeroDedos;

    }

    //metodo calculo resultado // si gana jugador es true y gana maquina es false 
    public static boolean resultadoJuego(String opcion, int jugador, int maquina) {
        boolean gana = true;//true que acierta;
        int total = 0;
        if (opcion.equalsIgnoreCase("Pares")) {//pares ganando jugador
            total = jugador + maquina;
            if (total % 2 == 0) {
                gana = true;
                JOptionPane.showMessageDialog(null, "Sale  Pares,  gana jugador");
            } else if (!(total % 2 == 0)) {
                gana = false;
                JOptionPane.showMessageDialog(null, "Sale Nones,  gana Maquina");
            }

        } else if (opcion.equalsIgnoreCase("Nones")) {//nones ganando jugador

            if (total % 2 == 0) { //Nones gana ------> nones true
                gana = false;
                JOptionPane.showMessageDialog(null, "sale Pares, gana Maquina");
            } else if (!(total % 2 == 0)) {
                gana = true;
                JOptionPane.showMessageDialog(null, " Sale Nones, gana Jugador");
            }

        }

        return gana;
    }

    public static void main(String[] args) {
        String opcion = "";
        String manos = "";
        String paresONones = "";
        int jugadorNumeroDedos;
        int maquinaNumeroDedos;
        boolean quienGana = true; // el ganador siempre es true
        int numeroRondasElegidas = 0;
        int contadorRondas = 0;
        int contadorVictoriasJugador = 0;
        int contadorVictoriasMaquina = 0;
        boolean ganador = true;
        do {

            opcion = gestionoMenu();
            if (opcion.equalsIgnoreCase("iniciar")) {
                numeroRondasElegidas = muestroPidoRondas();
                do {

                    manos = cuantasManos();
                    switch (manos) {
                        case "una" -> {
                            //con una mano
                            paresONones = seleccionParesYNones();
                            switch (paresONones) {
                                case "pares" -> {
                                    JOptionPane.showMessageDialog(null, "estas en pares");
                                    jugadorNumeroDedos = numeroDedosJugador(manos);
                                    maquinaNumeroDedos = numeroDedosMaquina(manos);
                                    quienGana = resultadoJuego(paresONones, jugadorNumeroDedos, maquinaNumeroDedos);
                                    System.out.println("numero dedos juagdor: " + jugadorNumeroDedos + " numero dedos maquina: " + maquinaNumeroDedos + " quien gana es : " + quienGana);
                                }
                                case "nones" -> {
                                    JOptionPane.showMessageDialog(null, "estas en nones");
                                    jugadorNumeroDedos = numeroDedosJugador(manos);
                                    maquinaNumeroDedos = numeroDedosMaquina(manos);
                                    quienGana = resultadoJuego(paresONones, jugadorNumeroDedos, maquinaNumeroDedos);
                                    System.out.println("numero dedos juagdor: " + jugadorNumeroDedos + " numero dedos maquina: " + maquinaNumeroDedos + " quien gana es : " + quienGana);
                                }
                                default -> {
                                }

                            }
                        }
                        case "dos" -> {
                            opcion = seleccionParesYNones();
                            switch (opcion) {
                                case "pares" -> {
                                    JOptionPane.showMessageDialog(null, "estas en pares");
                                    jugadorNumeroDedos = numeroDedosJugador(manos);
                                    maquinaNumeroDedos = numeroDedosMaquina(manos);
                                    quienGana = resultadoJuego(paresONones, jugadorNumeroDedos, maquinaNumeroDedos);
                                    System.out.println("numero dedos juagdor: " + jugadorNumeroDedos + " numero dedos maquina: " + maquinaNumeroDedos + " quien gana es : " + quienGana);
                                }
                                case "nones" -> {
                                    JOptionPane.showMessageDialog(null, "estas en nones");
                                    jugadorNumeroDedos = numeroDedosJugador(manos);
                                    maquinaNumeroDedos = numeroDedosMaquina(manos);
                                    quienGana = resultadoJuego(paresONones, jugadorNumeroDedos, maquinaNumeroDedos);
                                    System.out.println("numero dedos juagdor: " + jugadorNumeroDedos + " numero dedos maquina: " + maquinaNumeroDedos + " quien gana es : " + quienGana);
                                }
                                default -> {
                                }

                            }
                        }

                        default -> {
                        }

                    }

                    //sumo cada ronda
                    contadorRondas++;
                    JOptionPane.showMessageDialog(null, " Vas por la ronda: "+contadorRondas);
                    //cuento el numero de vitorias
                    if (quienGana == true) {
                        contadorVictoriasJugador++;
                    } else {
                        contadorVictoriasMaquina++;
                    }

                    //si las victorias del numero de maquina o jugador es mayor que la mitad del numero 
                    //de rondas total se da por ganador. con el ceil cosingo resultados enteros
                    //para que no me de problemas el bucle.
                    if (contadorVictoriasJugador >= Math.ceil(numeroRondasElegidas / 2)) {
                        JOptionPane.showMessageDialog(null, "El jugador ha ganado la partida");
                        break;
                    }
                    if (contadorVictoriasMaquina >= Math.ceil(numeroRondasElegidas / 2)) {
                        JOptionPane.showMessageDialog(null, "La Maquina  ha ganado la partida");
                        break;
                    }

                } while (contadorRondas < numeroRondasElegidas);

            }

        } while (!opcion.equalsIgnoreCase("salir"));

    }

}
