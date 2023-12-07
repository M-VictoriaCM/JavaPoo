package Calculadora;

import EquipoInformatico.Elemento;

public class CalculadorSuma extends Calculaldor{
    private Calculaldor sumando1, sumando2;

    public CalculadorSuma(Calculaldor sumando1, Calculaldor sumando2) {
        this.sumando1 = sumando1;
        this.sumando2 = sumando2;
    }

    @Override
    public double calcularMonto(Elemento e) {
        return sumando1.calcularMonto(e) + sumando2.calcularMonto(e);
    }
}
