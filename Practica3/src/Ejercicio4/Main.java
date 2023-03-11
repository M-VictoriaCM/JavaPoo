package Ejercicio4;

public class Main {
    public static void main(String[]args){
        Episodio e1= new Episodio("Episodio1","el atraco");
        Episodio e2= new Episodio("Episodio2","x");
        Episodio e3= new Episodio("Episodio3","t");
        Episodio e4= new Episodio("Episodio4","s");
        e1.setEsVisto(true);
        e1.setCalificacion(3);
        e2.setEsVisto(true);
        e2.setCalificacion(5);

        Temporada t1 = new Temporada(1);
        t1.setNumeroTemporada(1);
        t1.agregarEpisodios(e1);
        t1.agregarEpisodios(e2);
        t1.agregarEpisodios(e3);
        t1.agregarEpisodios(e4);



        Serie s1= new Serie("La casa de papel", "La casa de Papel Un misterioso hombre conocido como el profesor..","Alex Pina","Accion");
        s1.agregarTemporada(t1);


        System.out.println("Total episodios vistos de una serie: "+ s1.getTotalEpisodiosVistos());
        System.out.println("Total episodios vistos :"+t1.getTotalEpisodiosVistoTemporada());
        System.out.println("Promedio de calificaciones de  temporada 1: "+t1.getPromedioCalificaciones());
        System.out.println("Promedio de calificaciones de serie: Casa de Papel: "+s1.getPromedioCalificaciones());
        System.out.println("Episodios vistos: "+s1.getTotalEpisodiosVistos());
        System.out.println("clasificacion "+e1.getCalificacion());
        System.out.println("clasificacion "+e2.getCalificacion());

    }
}
