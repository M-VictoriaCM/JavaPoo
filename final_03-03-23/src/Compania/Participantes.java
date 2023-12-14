package Compania;

import Criterio.CriterioDeBusqueda;

public class Participantes {
    private String nombre;
    private String apellido;
    private String ciudad;
    private int puntos;

    public Participantes(String nombre, String apellido, String ciudad, int puntos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.puntos = puntos;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPuntos() {
        return puntos;
    }
    public int cantidadParticipante(CriterioDeBusqueda c){
        if(c.cumple(this)){
            return 1;
        }else{
            return 0;
        }
    }
    public int cantPartTotales(){
        return 1;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public boolean cumpleCondiion(CriterioDeBusqueda c){
        return c.cumple(this);
    }

    public boolean equals(Object obj){
        try{
            Participantes otro= (Participantes) obj;
            return otro.getApellido().equals(this.getApellido()) &&
                    otro.getNombre().equals(this.getNombre()) &&
                    otro.getPuntos() == this.getPuntos();
        }catch(Exception e){
            return false;
        }
    }
}
