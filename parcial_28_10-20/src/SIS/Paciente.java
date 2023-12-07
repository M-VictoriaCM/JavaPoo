package SIS;

import java.util.ArrayList;

public class Paciente {
    private String nombre;
    private int edad;
    private ArrayList<String>sintomas;
    private ArrayList<String>equipamento;

    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = new ArrayList<>();
        this.equipamento= new ArrayList<>();
    }
    public void deleteSintoma(String sintoma){
        sintomas.remove(sintoma);
    }
    public boolean tieneSintoma(String sintoma){
        return sintomas.contains(sintoma);
    }
    public boolean tieneEquipamento(String equipo){
        return equipamento.contains(equipo);
    }
    public void addSintomas(String sintoma){
        if(!tieneSintoma(sintoma)){
            sintomas.add(sintoma);
        }
    }
    public void addEquipamento(String equipo){
        if(!tieneEquipamento(equipo)){
            equipamento.add(equipo);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
