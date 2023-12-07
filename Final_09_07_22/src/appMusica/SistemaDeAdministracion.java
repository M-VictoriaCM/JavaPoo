package appMusica;

import Condicion.Condicion;

import java.util.ArrayList;

public abstract class SistemaDeAdministracion {
    private ArrayList<PlayList>listaDeReproduccion;

    public SistemaDeAdministracion() {
        this.listaDeReproduccion = new ArrayList<>();
    }
    public void addPlayList(PlayList lista){
        if(!listaDeReproduccion.contains(lista)){
            listaDeReproduccion.add(lista);
        }
    }
    public void deletePlayList(PlayList lista){
        listaDeReproduccion.remove(lista);
    }

    public abstract ArrayList<Pista>buscar(Condicion c);
    public abstract double getDuracion();
    public abstract SistemaDeAdministracion getCopia(Condicion c);
}
