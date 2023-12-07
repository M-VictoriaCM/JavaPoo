package EquipoInformatico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Empresa {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<ElementoDeAlquiler>elementos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.elementos = new ArrayList<>();
    }
    public void addCliente(Cliente c){
        clientes.add(c);
    }
    public void addelemento(ElementoDeAlquiler e){
        elementos.add(e);
    }
    public ArrayList<Cliente>getClientesOrdenados(Comparator<Cliente>orden){
        ArrayList<Cliente>ordenado = new ArrayList<>(); //copia
        ordenado.addAll(clientes);
        Collections.sort(ordenado, orden);
        return ordenado;
    }
}

