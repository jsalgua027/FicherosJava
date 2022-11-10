/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4a_nacho_salcedo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author jsalc
 */
public class Morra {

    /**
     * @param args the command line arguments
     */
    private static Random numerosRandom = new Random();
    private static int JugadorNumeroDedos = 0;
    private static int maquinaNumeroDedos = 0;
    private static int numeroApuestaJugador = 0;
    private static int numeroApuestaMaquina = 0;

    private static final String menuJuego = """
                                   
                                   ***********************Bienvenido a Pares y Nones******************
                                   
                                                    -Escriba INICIAR para comenzar el programa
                                                    -Escriba SALIR  para finalizar el programa
                                   
                                   *********************************************************************
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

    //***************** NUMERO APUESTA  JUGADOR Y MAQUINA*********************
    private static int numeroApuestaJugador() {
        boolean repetir = true;
        numeroApuestaJugador = 0;

        do {

            do {

                try {

                    numeroApuestaJugador = Integer.parseInt(JOptionPane.showInputDialog("Que número va ser el Ganador"));
                    repetir = false;

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "El dato Introducido es erroneo");
                    //limpio buffer

                }

            } while (repetir);

        } while (numeroApuestaJugador > 10);

        return numeroApuestaJugador;

    }

    private static int numeroApuestaMaquina() {
        numeroApuestaMaquina = numerosRandom.nextInt(10 - 0 + 1) + 0;
        return numeroApuestaMaquina;
    }

    //*************NUMERO DE DEDOS JUGADOR Y MAQUINA**********************
    private static int numeroDedosJugador() {
        boolean repetir = true;
        JugadorNumeroDedos = 0;
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

        return JugadorNumeroDedos;
    }

    private static int numeroDedosMaquina() {

        maquinaNumeroDedos = numerosRandom.nextInt(5 - 0 + 1) + 0;
        return maquinaNumeroDedos;
    }

    public static void main(String[] args) {
        String opcion = "";// gestion menu
        int contadorRondas = 1;//Rondas
        int victoriasJugador = 1;//victorias
        int victoriasMaquina = 1;
        int numeroGanadorJugador = 0;
        int numeroGanadorMaquina = 0;
        int numeroSacadoJugador = 0;
        int numeroSacadoMaquina = 0;
        int numeroPremiado = 0;
        boolean finJuego = true;

        opcion = gestionoMenu();

        do {
            if (opcion.equalsIgnoreCase("iniciar")) {
                finJuego = false;
                do {

                    numeroGanadorJugador = numeroApuestaJugador();
                    numeroGanadorMaquina = numeroApuestaMaquina();
                    numeroSacadoJugador = numeroDedosJugador();
                    numeroSacadoMaquina = numeroDedosMaquina();
                    //obtengo el numero ganador
                    numeroPremiado = numeroSacadoJugador + numeroSacadoMaquina;

                    //contar victorias
                    if (numeroGanadorJugador == numeroPremiado) {
                        JOptionPane.showMessageDialog(null, "Ha ganado JUGADOR la ronda: "
                                + contadorRondas + " Es la victoria numero: " + victoriasJugador);
                        victoriasJugador++;
                    } else if (numeroPremiado == numeroGanadorMaquina) {
                        JOptionPane.showMessageDialog(null, "Ha ganado MAQUINA la ronda: "
                                + contadorRondas + " Es la victoria numero: " + victoriasMaquina);
                        victoriasMaquina++;
                    }
                    if (numeroGanadorJugador != numeroPremiado && numeroGanadorMaquina != numeroPremiado) {
                        JOptionPane.showMessageDialog(null, "En la ronda: " + contadorRondas + " NADIE ha ganado");

                    }
                    //logica de premios
                    if ((victoriasJugador >= 3 && victoriasJugador >= victoriasMaquina + 2)) {
                        JOptionPane.showMessageDialog(null, "Ha ganado  el JUGADOR la partida con: " + victoriasJugador
                                + " victorias  sobre " + victoriasMaquina + " victorias de la maquina");
                        finJuego = true;
                    } else if ((victoriasMaquina >= 3 && victoriasMaquina >= victoriasJugador + 2)) {
                        JOptionPane.showMessageDialog(null, "Ha ganado la MAQUINA la partida con: " + victoriasMaquina
                                + " victorias sobre  " + victoriasJugador + " victorias del jugador");
                        finJuego = true;
                    }
                    if (contadorRondas == 21) {
                        JOptionPane.showMessageDialog(null, "Se ha llegado a la ronda 21 y no tenemos ganador");
                    }

                    contadorRondas++;//control de rondas
                } while (!finJuego);
                break;
            }

        } while (!opcion.equalsIgnoreCase("salir"));
    }

}
