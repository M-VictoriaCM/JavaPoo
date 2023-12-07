package appMusica;


import Condicion.Condicion;
import Condicion.CondicionAnio;

public class Main {
    public static void main(String[] args) {
        // Crear algunas pistas
        Pista pista1 = new Pista(1, "Canción 1", 200, "Artista 1", "Álbum 1", 2001, "Rock");
        Pista pista2 = new Pista(2, "Canción 2", 300, "Artista 2", "Álbum 2", 2002, "Pop");

        // Crear una lista de reproducción y agregar las pistas
        PlayList listaDeReproduccion = new PlayList("Mi Lista de Reproducción");
        listaDeReproduccion.agregarPista(pista1);
        listaDeReproduccion.agregarPista(pista2);

        // Crear una condición
        Condicion condicion = new CondicionAnio(2001);

        // Obtener una copia restringida de la lista de reproducción
        PlayList copiaRestringida = (PlayList) listaDeReproduccion.getCopia(condicion);

        // Imprimir la duración total de la lista de reproducción original y la copia restringida
        System.out.println("Duración total de la lista de reproducción original: " + listaDeReproduccion.getDuracion());
        System.out.println("Duración total de la copia restringida: " + (copiaRestringida != null ? copiaRestringida.getDuracion() : 0));
    }
}
