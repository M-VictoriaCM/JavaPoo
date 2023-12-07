package Condicion;

public class CondicionMayorDuracion extends Condicion{
    private double duracion;

    public CondicionMayorDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pista p) {
        return p.getDuracion()>duracion;
    }
}
