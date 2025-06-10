package com.ligadefutbol.entities.Jugador;

public class JugadorTitular extends Jugador{

    private int partidosDesdeBanco;

    public JugadorTitular(){

    }
    public JugadorTitular(String nombreCompleto, int edad){
        super(nombreCompleto, edad);
        this.partidosDesdeBanco = 0;
    }

    public int getPartidosDesdeBanco() {
        return partidosDesdeBanco;
    }

    public void setPartidosDesdeBanco(int partidosDesdeBanco) {
        this.partidosDesdeBanco = partidosDesdeBanco;
    }
}
