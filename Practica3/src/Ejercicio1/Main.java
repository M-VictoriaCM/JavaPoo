package Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){
//******************************** Ejercicio1.Persona ********************************

        Persona p1 = new Persona();
        p1.setNombre("N");
        p1.setFehaNacimiento(LocalDate.of(1991,07,14));
        p1.setSexo('F');
        p1.setAltura(1.58);
        p1.setPeso(85);

        System.out.println("\n"+
                "Nombre : "+p1.getNombre()+ "\n"+ "\n"+
                "Fecha de nacimiento : "+p1.getFehaNacimiento()+ "\n"+
                "Sexo : "+p1.getSexo()+ "\n"+
                "Altura : "+p1.getAltura()+ "mts"+"\n"+
                "Peso : "+p1.getPeso()+ "kg."
        );

        System.out.println("¿La edad coincide? " +p1.esCoherente());

        System.out.println("Edad "+ p1.calcularEdad());
        System.out.println("¿Esta en forma? " +p1.estaEnForma());
        System.out.println("¿Es su cumpleaño? "+p1.esTuCumpleanio());
        System.out.println("¿Es mayor de edad?"+p1.esMayorDeEdad());
        System.out.println("¿puede votar?"+p1.puedeVotar());
    }
}
