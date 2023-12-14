package Strategy;

import Compania.EventoDeportivo;

public class CondicionMayorpuntoAcumulados implements Condicion{
    int puntos;

    public CondicionMayorpuntoAcumulados(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public boolean cumpleConCondicion(EventoDeportivo e) {
        return e.getPuntos() > this.puntos;
    }
}
