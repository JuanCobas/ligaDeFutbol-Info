package com.ligadefutbol.services.registrarJugador;

import com.ligadefutbol.Storing.JugadoresStoring;
import com.ligadefutbol.entities.Jugador.Jugador;

public interface RegistrarJugadorService {

    public Jugador crearJugador(JugadoresStoring jugadoresStoring);

}
