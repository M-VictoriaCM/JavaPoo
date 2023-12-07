package Condicion;

public class CondicionAnio extends Condicion{
    private int anio;

    public CondicionAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Pista p) {
        return p.getAnio() == anio;
    }
}
