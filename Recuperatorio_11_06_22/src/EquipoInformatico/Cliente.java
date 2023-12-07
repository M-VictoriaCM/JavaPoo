package EquipoInformatico;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private ArrayList<ElementoDeAlquiler>alquilerPrevio;

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.alquilerPrevio = new ArrayList<>();
    }
    public void alquilar(ElementoDeAlquiler e){
        if(!alquilerPrevio.contains(e)){
            alquilerPrevio.add(e);
        }
    }
    public int cantidadElementosAlquilados(){
        return alquilerPrevio.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
