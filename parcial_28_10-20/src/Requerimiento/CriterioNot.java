package Requerimiento;

import SIS.Paciente;

public class CriterioNot extends Requerimiento{
    private Requerimiento condicion1;

    public CriterioNot(Requerimiento condicion1) {
        this.condicion1 = condicion1;
    }

    @Override
    public boolean cumple(Paciente p) {
        return !condicion1.cumple(p);
    }
}
