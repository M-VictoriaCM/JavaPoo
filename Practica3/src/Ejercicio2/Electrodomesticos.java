package Ejercicio2;

public class Electrodomesticos {
    private String nombre;
    private int precio;
    private double consumo;
    private double peso;
    private double costo;
    private static int indiceConsumo=45;
    private static int indiceBalance=3;

    public Electrodomesticos(String nombre, int precio, double consumo, double peso,double costo) {
        this.nombre = "gris plata";
        this.precio = 100;
        this.consumo = 10;
        this.precio = 2;
        this.costo = costo;
    }
    /*Metodos*/
    public boolean esBajoConsumo(){
        return this.getConsumo() < getIndiceConsumo();
    }
    public double getBalance(){
        return this.getCosto() / this.getPeso();
    }
    public boolean esAltaGama(){
        return this.getBalance() > getIndiceBalance();
    }

    /*Getters y setter*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static int getIndiceConsumo() {
        return indiceConsumo;
    }

    public static int getIndiceBalance() {
        return indiceBalance;
    }
}
