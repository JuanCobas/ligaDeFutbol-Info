package com.ligadefutbol;

import com.ligadefutbol.Storing.EquiposStoring;
import com.ligadefutbol.Storing.JugadoresStoring;
import com.ligadefutbol.Storing.PartidosStoring;
import com.ligadefutbol.services.menu.MenuService;
import com.ligadefutbol.services.menu.MenuServiceImpl1;
import com.ligadefutbol.services.registrarJugador.RegistrarJugadorService;
import com.ligadefutbol.services.registrarJugador.RegistrarJugadorServiceImpl1;

import java.util.Scanner;

public class AppRun {

    JugadoresStoring jugadoresStoring = new JugadoresStoring();
    EquiposStoring equiposStoring = new EquiposStoring();
    PartidosStoring partidosStoring = new PartidosStoring();
    RegistrarJugadorService registrarJugadorService = new RegistrarJugadorServiceImpl1();
    Scanner scanner = new Scanner(System.in);

    private MenuService menu = new MenuServiceImpl1(
            jugadoresStoring,
            equiposStoring,
            partidosStoring,
            registrarJugadorService);


    public void runApp(){
        while(true){
            int opcion;
            opcion = menu.seleccionarOpcion(scanner);
            menu.correrOpcion(opcion);
        }
    }
}
