package Criterio;

public class CriterioMenorPuntos extends CriterioDeBusqueda{
    private int punto;

    public CriterioMenorPuntos(int punto) {
        this.punto = punto;
    }

    @Override
    public boolean cumple(Participante p) {
        return p.getPuntosAcumulados()< this.punto;
    }
}
