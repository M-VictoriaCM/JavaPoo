package Criterio;

public class CriterioOr extends CriterioDeBusqueda{
    private CriterioDeBusqueda c1, c2;

    public CriterioOr(CriterioDeBusqueda c1, CriterioDeBusqueda c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Participante p) {
        return this.c1.cumple(p) || this.c2.cumple(p);
    }
}
