package Comparador;

import EquipoInformatico.Cliente;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Cliente> {
    Comparator<Cliente>comp1, comp2;

    public ComparadorCompuesto(Comparator<Cliente> comp1, Comparator<Cliente> comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Cliente o1, Cliente o2) {
        int resultado1=comp1.compare(o1, o2);
        if(resultado1 == 0){
            return comp2.compare(o1, o2);
        }else {
            return resultado1;
        }
    }
}
