package Ejercicio4;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada>temporadas;

    public Serie() {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<Temporada>();
    }

    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = new ArrayList<Temporada>();
    }
    /*Metodo*/
    public void agregarTemporada(Temporada t){
        if(!temporadas.contains(t)){
            temporadas.add(t);
        }
    }

   /*Obtener el total de episodios vistos de una serie*/
   public int  getTotalEpisodiosVistos(){
       int total =0;
       for(Temporada t: temporadas){
           total += t.getTotalEpisodiosVistoTemporada();
       }
       return total;
   }
   /*Obtener el promedio de las calificaciones dadas para una serie*/
   public double getPromedioCalificaciones(){
       double promedioCalificaciones = 0;
       for(Temporada t : temporadas){
           promedioCalificaciones += t.getPromedioCalificaciones();
       }
       if(promedioCalificaciones ==0){
           return  0;
       }else{
           return promedioCalificaciones/this.getTotalEpisodiosVistos();
       }
   }

    /*Getter y setter*/
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
