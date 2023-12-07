package Requerimiento;

import SIS.Paciente;

public class CriterioSintoma extends Requerimiento{
    private String sintoma;

    public CriterioSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    @Override
    public boolean cumple(Paciente p) {
        return p.tieneSintoma(sintoma);
    }
}
