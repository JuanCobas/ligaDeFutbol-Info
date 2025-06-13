package com.ligadefutbol.services.menu;

import com.ligadefutbol.Storing.EquiposStoring;
import com.ligadefutbol.Storing.JugadoresStoring;
import com.ligadefutbol.Storing.PartidosStoring;
import com.ligadefutbol.Utils.InputUtils;
import com.ligadefutbol.entities.Jugador.Jugador;
import com.ligadefutbol.services.lista.ListarService;
import com.ligadefutbol.services.lista.ListarServiceImpl;
import com.ligadefutbol.services.registrarJugador.RegistrarJugadorService;

import java.util.Scanner;

public class MenuServiceImpl1 implements MenuService {

    private final int OPCIONES = 6;
    private final  String MENU = "LIGA DE FUTBOL\n" +
            "1 - Registrar Jugador\n" +
            "2 - Crear Equipo\n" +
            "3 - Incorporar Jugadores a Equipos\n" +
            "4 - Registrar Partido\n" +
            "5 - Asignar Goles a Jugadores durante Partido\n" +
            "6 - Mostrar Listado de Jugadores y su Tipo\n";

    private JugadoresStoring jugadoresAlmacenados;
    private EquiposStoring equiposAlmacenados;
    private PartidosStoring partidosAlmacenados;
    private RegistrarJugadorService registrarJugadorService;
    private ListarService<Jugador> listarJugador;

    public MenuServiceImpl1(JugadoresStoring jugadoresAlmacenados,
                            EquiposStoring equiposAlmacenados,
                            PartidosStoring partidosAlmacenados,
                            RegistrarJugadorService registrarJugadorService) {
        this.jugadoresAlmacenados = jugadoresAlmacenados;
        this.equiposAlmacenados = equiposAlmacenados;
        this.partidosAlmacenados = partidosAlmacenados;
        this.registrarJugadorService = registrarJugadorService;
        listarJugador = new ListarServiceImpl<>(jugadoresAlmacenados.getListaJugadores());
    }

    @Override
    public int seleccionarOpcion(Scanner scanner) {
        int opcion;
        System.out.println(MENU);
        do {
            opcion = (int) InputUtils.leerEnteroPositivo();
        }while(opcion > OPCIONES );
        return opcion;
    }

    @Override
    public void correrOpcion(int opcion){

        switch (opcion){
            case 1: {
                registrarJugadorService.crearJugador(jugadoresAlmacenados);
                break;
            }

            case 2: {}

            case 3: {}

            case 4: {}

            case 5: {

            }

            case 6: {
                listarJugador.listar();
                break;
            }
        }
    }
}
