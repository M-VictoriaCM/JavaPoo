package appMusica;

import Condicion.Condicion;

import java.util.ArrayList;

public class Pista extends  SistemaDeAdministracion{
    private int id;
    private String titulo;
    private double duracion;
    private String artista;
    private String tituloAlbum;
    private int anio;
    private String genero;
    private boolean esPromocionada;
    private boolean esParaTodos;

    public Pista(int id, String titulo, double duracion, String artista, String tituloAlbum, int anio, String genero, boolean esPromocionada, boolean esParaTodos) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.artista = artista;
        this.tituloAlbum = tituloAlbum;
        this.anio = anio;
        this.genero = genero;
        this.esPromocionada= esPromocionada;
        this.esParaTodos = esParaTodos;
    }

    @Override
    public ArrayList<Pista> buscar(Condicion c) {
        ArrayList<Pista>salida = new ArrayList<>();
        //Si es una pista para todos
        if (esParaTodos && c.cumple(this)) {
            salida.add(this);
        }
        //resto de la busquedas
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
            SistemaDeAdministracion copia= new Pista(this.getId(), this.getTitulo(), this.getDuracion(), this.getArtista(), this.getTituloAlbum(),
                    this.getAnio(), this.getGenero(), this.esPromocionada, this.esParaTodos);
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

    public boolean isEsPromocionada() {
        return esPromocionada;
    }

    public void setEsPromocionada(boolean esPromocionada) {
        this.esPromocionada = esPromocionada;
    }

    public boolean isEsParaTodos() {
        return esParaTodos;
    }

    public void setEsParaTodos(boolean esParaTodos) {
        this.esParaTodos = esParaTodos;
    }
}
