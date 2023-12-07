package EquipoInformatico;

public abstract class ElementoDeAlquiler {
    private String codigoDeIdentificacion;

    public ElementoDeAlquiler(String codigoDeIdentificacion) {
        this.codigoDeIdentificacion = codigoDeIdentificacion;
    }

    public String getCodigoDeIdentificacion() {
        return this.codigoDeIdentificacion;
    }
    public abstract double getValor();
    public abstract int getAntiguedad();
    public abstract double montoCobrado();

    public boolean equals(Object obj){
        try{
            ElementoDeAlquiler otro = (ElementoDeAlquiler)obj;
            return this.getCodigoDeIdentificacion().equals(otro.getCodigoDeIdentificacion());
        }catch (Exception e){
            return false;
        }
    }
}
