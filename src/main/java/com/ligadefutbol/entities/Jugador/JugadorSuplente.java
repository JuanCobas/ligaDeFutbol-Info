package com.ligadefutbol.entities.Jugador;

public class JugadorSuplente extends Jugador{

    private long minutosJugados;


    public JugadorSuplente(){

    }

    public JugadorSuplente(String nombreCompleto, int edad, long minutosJugados){
        super(nombreCompleto,edad);
        this.minutosJugados = minutosJugados;
    }

    public long getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(long minutosJugados) {
        this.minutosJugados = minutosJugados;
    }
}
