package Ejercicio3;

public class PuntoGeometrico {
    private int x;
    private int y;

    public PuntoGeometrico() {
        this(0,0);
    }
    public PuntoGeometrico(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /*Metodos*/
    public void desplazar(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
   
    public double distanciaEuclidea(PuntoGeometrico p){
        double diferenciaX=this.x - p.getX();
        double diferenciaY= this.y - p.getY();
        return Math.sqrt((Math.pow(diferenciaX,2)+
		(Math.pow(diferenciaY,2))));
    }
    /*Getter y setter*/
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
