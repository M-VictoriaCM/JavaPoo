package Criterio;

public class CriterioPorMayorPuntos extends CriterioDeBusqueda{
    private int puntos;

    public CriterioPorMayorPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public boolean cumple(Participante p) {
        return p.getPuntosAcumulados()> this.puntos;
    }
}
