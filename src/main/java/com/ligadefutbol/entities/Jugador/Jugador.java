package com.ligadefutbol.entities.Jugador;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    /// Por no tener persistencia almaceno aqui los jugadores creados
    private static List<Jugador> listaJugadores = new ArrayList<Jugador>();


    private String nombreCompleto;
    private int edad;
    private int cantidadGoles;

    public Jugador() {
        listaJugadores.add(this);
    }

    public Jugador(String nombreCompleto, int edad){
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.cantidadGoles = 0;

        listaJugadores.add(this);
    }

    public static List<Jugador> getListaJugadores() {
        return listaJugadores;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles += cantidadGoles;
    }
}
