package Requerimiento;

import SIS.Paciente;

public class CriterioMenorEdad extends Requerimiento{
    private int edad;

    public CriterioMenorEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean cumple(Paciente p) {
        return p.getEdad() < edad;
    }
}
