package Compania;

import Criterio.CriterioDeBusqueda;

import java.time.LocalDate;
import java.util.ArrayList;

public class EventoDeportivo extends Compania{
    protected ArrayList<Participantes>participantes;
    private String deporte;
    private int puntos;
    private LocalDate fecha;
    private double duracion;

    public EventoDeportivo(String deporte, int puntos, LocalDate fecha, double duracion) {
        this.deporte = deporte;
        this.puntos = puntos;
        this.fecha = fecha;
        this.duracion = duracion;
        this.participantes = new ArrayList<>();
    }
    //cantidad de participantes con criterio
    public int cantidadDeparticipantesQueCumplen(CriterioDeBusqueda c){
        int cantidadParticipantes= 0;
        for(Participantes p: this.participantes){
            cantidadParticipantes += p.cantidadParticipante(c);
        }
        return cantidadParticipantes;
    }
    //cantidad Total sin tener en cuenta el citerio de busqyeda
    public int cantidadTotal(){
        int total= 0;
        for(Participantes p: this.participantes){
            total+= p.cantPartTotales();
        }
        return total;
    }
    public double getPorcentaje(CriterioDeBusqueda c){
        if(cantidadDeparticipantesQueCumplen(c) != 0){
            return cantidadDeparticipantesQueCumplen(c)/this.cantidadTotal();
        }
        return 0;
    }

    @Override //Obtener listado de todos los participantes
    public ArrayList<Participantes> getListaDeParticipantes() {
        return this.participantes;
    }

    @Override
    public double getDuracion() {
        return this.duracion;
    }

    @Override
    public int getPuntos() {
        return this.puntos;
    }


    public void agregarParticipante(Participantes p){
        if(!this.participantes.contains(p)){
            this.participantes.add(p);
        }
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
