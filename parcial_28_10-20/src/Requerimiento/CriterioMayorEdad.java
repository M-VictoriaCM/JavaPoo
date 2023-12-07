package Requerimiento;

import SIS.Paciente;

public class CriterioMayorEdad extends Requerimiento{
    private int edad;

    @Override
    public boolean cumple(Paciente p) {
        return p.getEdad()>edad;
    }
}
