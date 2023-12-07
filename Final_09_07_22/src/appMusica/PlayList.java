package appMusica;

import Condicion.Condicion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlayList extends SistemaDeAdministracion{
    private String nombre;
    private ArrayList<Pista>coleccion;
    private boolean esPromocionada;

    public PlayList(String nombre) {
        this.nombre = nombre;
        this.esPromocionada = esPromocionada;
        this.coleccion = new ArrayList<>();
    }

    @Override
    public ArrayList<Pista> buscar(Condicion c) {
        ArrayList<Pista>salida = new ArrayList<>();
        if(esPromocionada){
            salida.addAll(obtenerPistasPromocionadas(c));
        }
        for(Pista p : this.coleccion){
            salida.addAll(p.buscar(c));
        }
        return salida;
    }

    private List<Pista>obtenerPistasPromocionadas(Condicion c) {
        List<Pista>pistasPromocionadas = new ArrayList<>();
        for(Pista p : this.coleccion){
            if(p.isEsPromocionada() && c.cumple(p)){
                pistasPromocionadas.add(p);
            }
        }
        return pistasPromocionadas;
    }

    @Override
    public double getDuracion() {
        double tiempoTotal=0;
        for(int i=0; i<this.coleccion.size();i++){
            tiempoTotal += this.coleccion.get(i).getDuracion();
        }
        return tiempoTotal;
    }
    @Override
    public SistemaDeAdministracion getCopia(Condicion c) {
        PlayList copia = new PlayList(this.getNombre());

        for(Pista p: this.coleccion){
            if(c.cumple(p)){
                copia.agregarPista(p);
            }
        }
        if(copia.coleccion.isEmpty()){
            return null;
        }
        return copia;
    }
    public void agregarPista(Pista pista){
        if(!coleccion.contains(pista)){
            coleccion.add(pista);
        }
    }
    public void eliminaPista(Pista pista){
        coleccion.remove(pista);
    }
    public void cambiaratributosDepista(int id, String nuevoTitulo, double duracion, String nuevoArtista,
                                        String nuevoTituloAlbum, int anio, String genero, boolean esPromocionada, boolean esParaTodos){
        for(int i= 0; i< this.coleccion.size(); i++){
           Pista aux = this.coleccion.get(i);
           if(aux.getId() == id){
               aux.setTitulo(nuevoTitulo);
               aux.setDuracion(duracion);
               aux.setArtista(nuevoArtista);
               aux.setTituloAlbum(nuevoTituloAlbum);
               aux.setAnio(anio);
               aux.setGenero(genero);
               aux.setEsPromocionada(esPromocionada);
               aux.setEsParaTodos(esParaTodos);
               break;
           }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
