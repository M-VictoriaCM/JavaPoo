package Calculadora;

import EquipoInformatico.Elemento;

public class MontoFijo extends Calculaldor{
    private double monto;

    public MontoFijo(double monto) {
        this.monto = monto;
    }

    @Override
    public double calcularMonto(Elemento e) {
        return monto;
    }
}
