package com.ligadefutbol.services.registrarJugador;

import com.ligadefutbol.Storing.JugadoresStoring;
import com.ligadefutbol.Utils.InputUtils;
import com.ligadefutbol.entities.Jugador.Jugador;
import com.ligadefutbol.entities.Jugador.JugadorSuplente;
import com.ligadefutbol.entities.Jugador.JugadorTitular;

import java.util.Scanner;

public class reigistrarJugadorServiceImple1 implements registrarJugadorService {

    String MENU_INICIO = "Va a registrar un jugador";
    String MENU_NOMBRE = "Por favor ingrese el nombre completo del jugador";
    String MENU_EDAD = "Por favor ingrese la edad del jugador";
    String MENU_TIPO_JUGADOR = "Ingrese el tipo de jugador a crear, indicando el numero";
    String MENU_TIPO_JUGADOR_LISTA = "1 - Titular \n 2 - Suplente";
    String MENU_JUGADOR_SUPLENTE = "Ingrese la cantidad de partidos que el jugador entro desde el banco";



    @Override
    public Jugador crearJugador(Scanner scanner, JugadoresStoring jugadoresStoring) {

        String nombreCompleto;
        int edad;
        int opcionTipo;
        Jugador jugador;
        while(true){
            System.out.println(MENU_INICIO);
            System.out.println(MENU_NOMBRE);
            nombreCompleto = scanner.nextLine();
            scanner.nextLine();
            System.out.println(MENU_EDAD);
            edad = (int)InputUtils.leerEnteroPositivo(scanner);
            scanner.nextLine();
            System.out.println(MENU_TIPO_JUGADOR);
            System.out.println(MENU_TIPO_JUGADOR_LISTA);
            do{opcionTipo = (int) InputUtils.leerEnteroPositivo(scanner);}
                    while (opcionTipo > 2 || opcionTipo < 0);
            if(opcionTipo == 1){
                jugador = new JugadorTitular(nombreCompleto, edad);
            } else {
                int partidosDesdeBanco;
                System.out.println(MENU_JUGADOR_SUPLENTE);
                partidosDesdeBanco = (int) InputUtils.leerEnteroPositivo(scanner);
                jugador = new JugadorSuplente(nombreCompleto,edad,partidosDesdeBanco);
            }

            jugadoresStoring.getListaJugadores().add(jugador);

            return jugador;


        }
    }
}
