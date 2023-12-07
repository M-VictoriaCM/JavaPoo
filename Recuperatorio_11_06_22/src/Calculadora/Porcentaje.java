package Calculadora;

import EquipoInformatico.Elemento;

public class Porcentaje extends Calculaldor{
    private double porcentaje;

    public Porcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularMonto(Elemento e) {
        return e.getValor() * porcentaje;
    }
}
