package Ejercicio3;

public class Main {
    public static void main(String [] args){
//******************************** Ejercicio1.Persona ********************************

        PuntoGeometrico p1 = new  PuntoGeometrico(1,1);
        PuntoGeometrico p2 = new  PuntoGeometrico(2,2);

        System.out.println("\n"+
                "p1 ("+p1.getX()+";"+p1.getY()+")"+"\n"+
                "p2 ("+p2.getX()+";"+p2.getY()+")"+"\n"+
                "distancia Euclídea " + p1.distanciaEuclidea(p2)
        );
        System.out.println(".........................................................");

        Rectangulo r1 = new Rectangulo(3,6);
        Rectangulo r2 = new Rectangulo(3,6);

        System.out.println("\n"+
                "Area rectangulo1: "+r1.getArea()+"\n"+
                "Es un cuadrado: "+r1.esUnCuadrado()+"\n"+
                "Cual es el lado mas grande: "+r1.ladoSuperior()+"\n"+
                "Posicion: "+r1.posicion()+"\n"+
                "Area rectangulo2: "+r2.getArea()+"\n"+
                "Es un cuadrado: "+r2.esUnCuadrado()+"\n"+
                "Cual es el lado mas grande: "+r2.ladoSuperior()+"\n"+
                "Posicion: "+r2.posicion()
        );
        System.out.println(r1.compararRectangulos(r1,r2));

    }
}
