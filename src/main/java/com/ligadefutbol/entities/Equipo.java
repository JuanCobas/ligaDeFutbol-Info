package com.ligadefutbol.entities;

import com.ligadefutbol.entities.Jugador.Jugador;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    /// Por no tener persistencia almaceno aqui los equipos creados
    private static List<Equipo> listaEquipos = new ArrayList<Equipo>();

    private String nombre;
    private List<Jugador> jugadores;

    public static List<Equipo> getListaEquipos() {
        return listaEquipos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
