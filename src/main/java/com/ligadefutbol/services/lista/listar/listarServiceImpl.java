package com.ligadefutbol.services.lista.listar;

import java.util.List;

public class listarServiceImpl<T> implements listarService<T> {

    String MENU_LISTA = "Lista";
    String MENU_LISTA_VACIA = "La lista se encuentra vacia";

    @Override
    public void listar(List<T> lista) {

        if(lista.isEmpty()){
            System.out.println(MENU_LISTA_VACIA);
            return;
        }
        System.out.println(MENU_LISTA);
        for (int i = 0; i < lista.size(); i++){
            System.out.println(i + " - " + lista.get(i));
        }
    }
}
