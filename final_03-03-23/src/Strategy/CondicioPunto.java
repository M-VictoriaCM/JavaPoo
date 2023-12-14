package Strategy;

import Compania.EventoDeportivo;

public class CondicioPunto implements Condicion{
    private int puntos;

    public CondicioPunto(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public boolean cumpleConCondicion(EventoDeportivo e) {
        return e.getPuntos() ==  this.puntos;
    }
}
