package Ejercicio4;

import java.util.ArrayList;

public class Temporada {
    private int numeroTemporada;
    private ArrayList<Episodio> episodio;

    public Temporada() {
        this.numeroTemporada = numeroTemporada;
        this.episodio = new ArrayList<Episodio>();
    }

    public Temporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
        this.episodio = new ArrayList<Episodio>();
    }
    /*Metodos*/
    public void agregarEpisodios(Episodio e){
        if(!this.episodio.contains(e)){
            this.episodio.add(e);
        }
    }
	public int getTotalEpisodios(){
        return episodio.size();
	}
	/*Obtener el total episodios vistos de una temporada particular.*/
    public int getTotalEpisodiosVistoTemporada(){
        int totalVisto =0;
        for(Episodio e: episodio){
            if(e.isEsVisto()){
                totalVisto++;
            }
        }
        return totalVisto;
    }
    /*Obtener el promedio de las calificaciones dadas para una temporada particular.*/
    public double getPromedioCalificaciones(){
        double totalCalificaciones =0;
        for(Episodio e: episodio){
            if(e.isEsVisto()){
                totalCalificaciones += e.getCalificacion();
                totalCalificaciones++;
            }
        }
        if(totalCalificaciones == 0){
            return 0;
        }else{
            return totalCalificaciones/this.getTotalEpisodiosVistoTemporada();
        }
    }
    /*Getter y Setter */
    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }
}
