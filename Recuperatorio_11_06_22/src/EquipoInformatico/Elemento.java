package EquipoInformatico;

import Calculadora.Calculaldor;

public class Elemento extends ElementoDeAlquiler{
    private double valor;
    private int antiguedad;
    private String descripcion;
    private Calculaldor calculaldor;

    public Elemento(String codigoDeIdentificacion, double valor,int antiguedad, String descripcion, Calculaldor calculaldor) {
        super(codigoDeIdentificacion);
        this.valor=valor;
        this.antiguedad=antiguedad;
        this.descripcion = descripcion;
        this.calculaldor =calculaldor;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public int getAntiguedad() {
        return this.antiguedad;
    }

    @Override
    public double montoCobrado() {
        return calculaldor.calcularMonto(this);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
