package appMusica;

import Condicion.Condicion;

import java.util.ArrayList;
import java.util.Timer;

public class Pista extends  SistemaDeAdministracion{
    private int id;
    private String titulo;
    private double duracion;
    private String artista;
    private String tituloAlbum;
    private int anio;
    private String genero;

    public Pista(int id, String titulo, double duracion, String artista, String tituloAlbum, int anio, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
        this.tituloAlbum = tituloAlbum;
        this.anio = anio;
        this.genero = genero;
    }

    @Override
    public ArrayList<Pista> buscar(Condicion c) {
        ArrayList<Pista>salida = new ArrayList<>();
        if(c.cumple(this)){
            salida.add(this);
        }
        return salida;
    }

    @Override
    public double getDuracion() {
        return this.duracion;
    }
    public boolean cumpleCriterio(Condicion c){
        return c.cumple(this);
    }

    @Override
    public SistemaDeAdministracion getCopia(Condicion c) {
        if(cumpleCriterio(c)){
            SistemaDeAdministracion copia= new Pista(this.getId(), this.getTitulo(), this.getDuracion(), this.getArtista(), this.getTituloAlbum(), this.getAnio(), this.getGenero());
            return copia;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTituloAlbum() {
        return tituloAlbum;
    }

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
