package Compania;

import Criterio.CriterioDeBusqueda;

import java.util.ArrayList;

public abstract class Compania {
    private ArrayList<Competencia>competencia;

    public Compania() {
        this.competencia = new ArrayList<>();
    }

    public abstract ArrayList<Participantes>getListaDeParticipantes();
    public abstract double getDuracion();
    public abstract int getPuntos();


}
