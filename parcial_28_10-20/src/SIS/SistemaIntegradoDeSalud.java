package SIS;

import Requerimiento.Requerimiento;

import java.util.ArrayList;

public abstract class SistemaIntegradoDeSalud {
    public abstract ArrayList<Cama> buscar(Paciente p);
    public abstract  int totalCamas();
    public abstract SistemaIntegradoDeSalud getCopia(Requerimiento r);
}
