package EquipoInformatico;

import java.util.ArrayList;

public class Paquete extends ElementoDeAlquiler{
    private ArrayList<ElementoDeAlquiler> elementos;

    public Paquete(String codigoDeIdentificacion) {
        super(codigoDeIdentificacion);
        this.elementos= new ArrayList<>();
    }
    public void addElemento(ElementoDeAlquiler e){
        if(!elementos.contains(e)){
            elementos.add(e);
        }
    }

    @Override
    public double getValor() {
        double valorTotal= 0.0;

        for(int i= 0; i< this.elementos.size(); i++){
            valorTotal += this.elementos.get(i).getValor();
        }
        return valorTotal;
    }

    @Override
    public int getAntiguedad() {
        int antiguedadMayor = 0;
        for(int i=0; i<this.elementos.size(); i++){
            int aux = this.elementos.get(i).getAntiguedad();
            if(aux > antiguedadMayor){
                antiguedadMayor =aux;
            }
        }
        return antiguedadMayor;
    }

    @Override
    public double montoCobrado() {
        double monto = 0.0;
        for(int i=0; i< this.elementos.size(); i++){
            monto += this.elementos.get(i).montoCobrado();
        }
        return monto;
    }
}
