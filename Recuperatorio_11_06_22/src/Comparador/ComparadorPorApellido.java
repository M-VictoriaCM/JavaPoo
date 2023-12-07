package Comparador;

import EquipoInformatico.Cliente;

import java.util.Comparator;

public class ComparadorPorApellido implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
