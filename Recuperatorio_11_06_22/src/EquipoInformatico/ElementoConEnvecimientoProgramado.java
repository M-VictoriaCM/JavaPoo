package EquipoInformatico;

public class ElementoConEnvecimientoProgramado extends ElementoDeAlquiler{
    private ElementoDeAlquiler referencia;
    private int cantidadMeses;
    private double porcentaje;
    public ElementoConEnvecimientoProgramado(String codigoDeIdentificacion,ElementoDeAlquiler referencia, int cantidadMeses, double porcentaje) {
        super(codigoDeIdentificacion);
        this.referencia = referencia;
        this.cantidadMeses= cantidadMeses;
        this.porcentaje = porcentaje;
    }
    public boolean esObsoleto(){
        return referencia.getAntiguedad() > cantidadMeses ;
    }

    @Override
    public double getValor() {
        double valor =referencia.getValor() * porcentaje;
        if(esObsoleto()){
            return valor;
        }
        return 0;
    }

    @Override
    public int getAntiguedad() {
        return referencia.getAntiguedad();
    }

    @Override
    public double montoCobrado() {
        double valor = referencia.montoCobrado();
        if(esObsoleto()){
            return valor * porcentaje;
        }
        return 0;
    }
}
