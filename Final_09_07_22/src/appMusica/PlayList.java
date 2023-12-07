package appMusica;

import Condicion.Condicion;
import java.util.ArrayList;
import java.util.Collection;

public class PlayList extends SistemaDeAdministracion{
    private String nombre;
    private ArrayList<Pista>coleccion;

    public PlayList(String nombre) {
        this.nombre = nombre;
        this.coleccion = new ArrayList<>();
    }

    @Override
    public ArrayList<Pista> buscar(Condicion c) {
        ArrayList<Pista>salida = new ArrayList<>();
        for(int i=0; i<this.coleccion.size(); i++){
            salida.addAll(this.coleccion.get(i).buscar(c));
        }
        return salida;
    }

    @Override
    public double getDuracion() {
        double tiempoTotal=0;
        for(int i=0; i<this.coleccion.size();i++){
            tiempoTotal += this.coleccion.get(i).getDuracion();
        }
        return tiempoTotal;
    }
    protected PlayList getCopiaTipo(){
        return new PlayList(this.getNombre());
    }
    @Override
    public SistemaDeAdministracion getCopia(Condicion c) {
        PlayList copia = this.getCopiaTipo();

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
                                        String nuevoTituloAlbum, int anio, String genero){
        for(int i= 0; i< this.coleccion.size(); i++){
           Pista aux = this.coleccion.get(i);
           if(aux.getId() == id){
               aux.setTitulo(nuevoTitulo);
               aux.setDuracion(duracion);
               aux.setArtista(nuevoArtista);
               aux.setTituloAlbum(nuevoTituloAlbum);
               aux.setAnio(anio);
               aux.setGenero(genero);
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
