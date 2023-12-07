package SIS;

import Requerimiento.Requerimiento;

import java.util.ArrayList;

public class Cama extends SistemaIntegradoDeSalud{
    private ArrayList<String>equipamentos;
    private Paciente ocupante;
    private Requerimiento requerimiento;

    public Cama(Requerimiento requerimiento) {
        this.ocupante = null;
        this.requerimiento = requerimiento;
        this.equipamentos= new ArrayList<>();
    }
    @Override
    public ArrayList<Cama> buscar(Paciente p) {
        ArrayList<Cama>salida = new ArrayList<>();
        if(this.camaDesocupad() && (requerimiento.cumple(p))){
            salida.add(this);
        }
        return salida;
    }
    public void addEquipamento(String equipo){
        equipamentos.add(equipo);
    }
    public void setOcupante(Paciente ocupante) {
        if(requerimiento.cumple(ocupante)){
            this.ocupante = ocupante;
        }
    }
    public boolean camaDesocupad(){
        return ocupante == null;
    }

    public Paciente getOcupante() {
        return ocupante;
    }
    public Requerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(Requerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    @Override
    public int totalCamas() {
        return 1;
    }

    @Override
    public SistemaIntegradoDeSalud getCopia(Requerimiento r) {
        if(this.camaDesocupad() && r.cumple(ocupante)){
            Cama cama = new Cama(requerimiento);
            cama.setOcupante(ocupante);
            for(int i =0; i< this.equipamentos.size(); i++){
                cama.addEquipamento(this.equipamentos.get(i));
            }
            return cama;
        }else {
            return null;
        }
    }

}
