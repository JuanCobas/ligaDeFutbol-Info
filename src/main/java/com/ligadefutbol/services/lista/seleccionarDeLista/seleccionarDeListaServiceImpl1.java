package com.ligadefutbol.services.lista.seleccionarDeLista;

import com.ligadefutbol.Utils.InputUtils;
import com.ligadefutbol.services.lista.listar.listarService;

import java.util.List;
import java.util.Scanner;

public class seleccionarDeListaServiceImpl1<T> implements seleccionarDeListaService<T>{

    String MENU_SELECCIONAR = "Seleccione la opcion desedeada";
    String MENU_SELECCION = "Ha seleccionado: ";

    @Override
    public T seleccionarDeLista(List<T> lista, listarService<T> listarService, Scanner scanner) {
        listarService.listar(lista);
        int opcion;
        T seleccion;
        System.out.println(MENU_SELECCIONAR);

        do {
            opcion = (int) InputUtils.leerEnteroPositivo(scanner);
        }
        while (opcion < 0 || opcion > lista.size());

        seleccion = lista.get(opcion);

        System.out.println(MENU_SELECCION + seleccion);

        return seleccion;
    }
}
