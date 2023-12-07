package Requerimiento;

import SIS.Paciente;

public class CriterioEquipamento  extends Requerimiento{
    private String equipo;

    @Override
    public boolean cumple(Paciente p) {
        return p.tieneEquipamento(equipo);
    }
}
