package com.ligadefutbol.services.registrarEquipo;

import com.ligadefutbol.Storing.EquiposStoring;
import com.ligadefutbol.Storing.JugadoresStoring;
import com.ligadefutbol.entities.Equipo;

import java.util.Scanner;

public interface registrarEquipoService {

    public Equipo crearJugador(Scanner scanner, EquiposStoring equiposStoring);

}
