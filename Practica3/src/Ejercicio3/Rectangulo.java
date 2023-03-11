package Ejercicio3;

public class Rectangulo {
    private int base;
    private int altura;
    private PuntoGeometrico origen;

    public Rectangulo() {
        this.base = base;
        this.altura = altura;
        this.origen = new PuntoGeometrico(0,0);
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(int base, int altura, PuntoGeometrico origen) {
        this.base = base;
        this.altura = altura;
        this.origen = origen;
    }
    /*Metodos*/
    public double getArea(){
        return this.getBase() * this.getAltura();
    }
    public boolean esUnCuadrado(){
        return this.getBase() == this.getAltura();
    }
    public int ladoSuperior(){
        if(this.getBase() > this.getAltura()){
            return this.getBase();
        }else {
            return getAltura();
        }
    }
    public String posicion(){
        if(this.ladoSuperior() == this.getBase()){
            return  "esta acostado";
        }else{
            return "esta Parado";
        }
    }
    public void desplazar(int x , int y){
        origen.desplazar(x,y);
    }
    public int compararRectangulos(Rectangulo r1, Rectangulo r2){
        if(r1.getArea() > r2.getArea()){
            return 1;
        }else if(r1.getArea() < r2.getArea()){
            return -1;
        }else{
            return 0;
        }
    }
    /*Getter y setter*/
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
