package com.ligadefutbol.Storing;
import java.util.ArrayList;
import java.util.List;
import com.ligadefutbol.entities.Equipo;

public class EquiposStoring {

    /// Por no tener persistencia almaceno aqui los equipos creados
    private List<Equipo> listaEquipos = new ArrayList<Equipo>();

    public List<Equipo> getListaEquipos() {
        return listaEquipos;
    }
}
