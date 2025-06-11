package com.ligadefutbol.services.registrarEquipo;

import com.ligadefutbol.Storing.EquiposStoring;
import com.ligadefutbol.Utils.InputUtils;
import com.ligadefutbol.entities.Equipo;
import com.ligadefutbol.entities.Jugador.Jugador;
import com.ligadefutbol.entities.Jugador.JugadorSuplente;
import com.ligadefutbol.entities.Jugador.JugadorTitular;

import java.util.Scanner;

public class reigistrarEquipoServiceImple1 implements registrarEquipoService {

    String MENU_INICIO = "Va a registrar un equipo";
    String MENU_NOMBRE = "Por favor ingrese el nombre completo del equipo";




    @Override
    public Equipo crearJugador(Scanner scanner, EquiposStoring equiposStoring) {

        String nombre;
        Equipo equipo;

        while(true){
            System.out.println(MENU_INICIO);
            System.out.println(MENU_NOMBRE);
            nombre = scanner.nextLine();
            scanner.nextLine();

            equipo = new Equipo(nombre);
            equiposStoring.getListaEquipos().add(equipo);

            return equipo;

        }
    }
}
