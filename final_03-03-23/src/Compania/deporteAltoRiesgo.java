package Compania;

import Criterio.CriterioDeBusqueda;
import Strategy.Condicion;

import java.time.LocalDate;

public class deporteAltoRiesgo extends EventoDeportivo{
    private CriterioDeBusqueda criterio;
    public deporteAltoRiesgo(String deporte, int puntos, LocalDate fecha, double duracion) {
        super(deporte, puntos, fecha, duracion);
    }
    public void agregarParticipante(Participantes p){
        if(p.cumpleCondiion(criterio)){
            super.agregarParticipante(p);
        }
    }
}
