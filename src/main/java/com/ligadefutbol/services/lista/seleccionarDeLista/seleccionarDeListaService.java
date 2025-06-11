package com.ligadefutbol.services.lista.seleccionarDeLista;

import com.ligadefutbol.services.lista.listar.listarService;

import java.util.List;
import java.util.Scanner;

public interface seleccionarDeListaService<T> {

    public T seleccionarDeLista(List<T> lista, listarService<T> listarService, Scanner scanner);
}
