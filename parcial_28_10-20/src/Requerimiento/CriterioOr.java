package Requerimiento;

import SIS.Paciente;

public class CriterioOr extends Requerimiento{
    Requerimiento condicion1, condicion2;

    public CriterioOr(Requerimiento condicion1, Requerimiento condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Paciente p) {
        return condicion1.cumple(p) || condicion2.cumple(p);
    }
}
