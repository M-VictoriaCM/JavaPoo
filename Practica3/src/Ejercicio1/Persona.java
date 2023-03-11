package Ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fehaNacimiento;
    private String dni;
    private char  sexo;
    private double altura;
    private float peso;
    //variables fijas
    private static double indiceMasaMinimo =18.5;
    private static double indiceMasaMaximo =25;
    private static int mayorEdad= 18;
    private static int edadVotante= 16;
/*constructores*/
    public Persona(String dni){
        this("N","N", LocalDate.of(2000,01,01), dni,'F',1,1);
    }
    public Persona(String dni, String nombre, String apellido){
        this(nombre,apellido, LocalDate.of(2000,01,01), dni,'F',1,1);
    }
    public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento){
        this(nombre, apellido, LocalDate.of(2000,01,01), dni,'F',1,1);
    }
    public Persona(String nombre, String apellido, LocalDate fehaNacimiento, String dni, char sexo, double altura, float peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fehaNacimiento = fehaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }
    public Persona() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fehaNacimiento = fehaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }


    /*Metodos*/
    public double getMasaCorporal(){
        return this.getPeso() / Math.pow(this.getAltura(),2);
    }
    public boolean estaEnForma(){
        double imc = this.getMasaCorporal();
        return (imc >= getIndiceMasaMinimo()) &&
                imc <= getIndiceMasaMaximo();
    }
    public boolean esTuCumpleanio(){
        LocalDate hoy= LocalDate.now();
        return (this.getFehaNacimiento().getMonthValue() == hoy.getMonthValue() &&
                this.getFehaNacimiento().getDayOfMonth() == hoy.getDayOfMonth());
    }
    public int calcularEdad(){
        LocalDate hoy= LocalDate.now();
        return Period.between(this.getFehaNacimiento(), hoy).getYears();
    }
    public boolean esCoherente(){
        int edad= this.calcularEdad();
        LocalDate hoy = LocalDate.now();
        int edadCalculada= hoy.getYear() - this.getFehaNacimiento().getYear();
        if((edadCalculada == edad)){
            return true;
        }else if((edadCalculada-1 == edad)){
            return true;
        }
        return false;
    }

    public boolean puedeVotar(){
        int edad= this.calcularEdad();
        return edad >= getEdadVotante();
    }
    public boolean esMayorDeEdad(){
        return this.calcularEdad() >= getMayorEdad();
    }

    /*getter y setter*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFehaNacimiento() {
        return fehaNacimiento;
    }

    public void setFehaNacimiento(LocalDate fehaNacimiento) {
        this.fehaNacimiento = fehaNacimiento;
    }

    public String getDni() {
        return dni;
    }
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public static double getIndiceMasaMinimo() {
        return indiceMasaMinimo;
    }

    public static double getIndiceMasaMaximo() {
        return indiceMasaMaximo;
    }

    public static int getMayorEdad() {
        return mayorEdad;
    }

    public static int getEdadVotante() {
        return edadVotante;
    }

    @Override
    public String toString() {
        return "Ejercicio1.Persona{" +
                "nombre='" + this.getNombre() + '\'' +
                ", fehaNacimiento=" + this.getFehaNacimiento() +
                ", dni='" + this.getDni() + '\'' +
                ", sexo='" + this.getSexo() + '\'' +
                ", altura=" + this.getAltura() +
                ", peso=" + this.getPeso() +
                '}';
    }
}
