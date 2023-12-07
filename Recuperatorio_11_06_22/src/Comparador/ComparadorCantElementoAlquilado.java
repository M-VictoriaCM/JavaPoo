package Comparador;

import EquipoInformatico.Cliente;

import java.util.Comparator;

public class ComparadorCantElementoAlquilado implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o2.cantidadElementosAlquilados()-o1.cantidadElementosAlquilados();
    }
}
