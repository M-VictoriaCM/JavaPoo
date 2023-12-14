package Compania;

import Criterio.CriterioDeBusqueda;
import Strategy.Condicion;

import java.util.ArrayList;

public class Competencia  extends Compania{
    private String nombre;
    protected ArrayList<EventoDeportivo>elemento;

    public Competencia(String nombre) {
        this.nombre = nombre;
        this.elemento = new ArrayList<>();
    }
    @Override//Lista de los participantes
    public ArrayList<Participantes> getListaDeParticipantes() {
        ArrayList<Participantes>salida = new ArrayList<>();
        for(EventoDeportivo e: this.elemento){
            salida.addAll(e.getListaDeParticipantes());
        }
        return salida;
    }

    @Override
    public double getDuracion() {
        int duracionTotal= 0;
        for(EventoDeportivo e: this.elemento){
            duracionTotal += e.getDuracion();
        }
        return duracionTotal;
    }

    @Override
    public int getPuntos() {
        int puntoTotales=0;
        for(EventoDeportivo e: this.elemento){
            puntoTotales += e.getPuntos();
        }
        return puntoTotales;
    }

    public void agregarDeporte(Condicion c){
        for(EventoDeportivo e: this.elemento){
            if(c.cumpleConCondicion(e)){
                elemento.add(e);
            }
        }
    }
}
