package com.ligadefutbol.services.incorporarJugadorEquipo;

import com.ligadefutbol.entities.Equipo;
import com.ligadefutbol.entities.Jugador.Jugador;

public class incoporarJugadorEquipoServiceImpl1 implements incoporarJugadorEquipoService{

    @Override
    public void incoporarJugadorAEquipo(Equipo equipo, Jugador jugador) {
        equipo.getJugadores().add(jugador);
    }
}
