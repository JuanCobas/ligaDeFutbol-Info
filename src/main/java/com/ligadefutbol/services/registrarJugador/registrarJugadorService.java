package com.ligadefutbol.services.registrarJugador;

import com.ligadefutbol.Storing.JugadoresStoring;
import com.ligadefutbol.entities.Jugador.Jugador;

import java.util.Scanner;

public interface registrarJugadorService {

    public Jugador crearJugador(Scanner scanner, JugadoresStoring jugadoresStoring);

}
