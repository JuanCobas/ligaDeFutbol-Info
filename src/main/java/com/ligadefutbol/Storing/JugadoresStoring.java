package com.ligadefutbol.Storing;
import java.util.ArrayList;
import java.util.List;

import com.ligadefutbol.entities.Jugador.Jugador;



public class JugadoresStoring {

    /// Por no tener persistencia almaceno aqui los jugadores creados
    private List<Jugador> listaJugadores = new ArrayList<Jugador>();

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }
}
