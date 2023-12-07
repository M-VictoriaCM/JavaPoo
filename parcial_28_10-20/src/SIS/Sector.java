package SIS;

import Requerimiento.Requerimiento;

import java.util.ArrayList;

public class Sector extends SistemaIntegradoDeSalud{
    private ArrayList<SistemaIntegradoDeSalud>sistema;

    public Sector() {
        this.sistema=new ArrayList<>();
    }
    public void addSector(SistemaIntegradoDeSalud ss){
        if(!sistema.contains(ss)){
            sistema.add(ss);
        }
    }
    @Override
    public ArrayList<Cama> buscar(Paciente p) {
        ArrayList<Cama>salida = new ArrayList<>();
        for(int i=0; i< this.sistema.size(); i++){
            salida.addAll(this.sistema.get(i).buscar(p));
        }
        return salida;
    }
    @Override
    public int totalCamas() {
        int suma=0;
        for(int i=0; i<this.sistema.size(); i++){
            suma += this.sistema.get(i).totalCamas();
        }
        return suma;
    }

    @Override
    public SistemaIntegradoDeSalud getCopia(Requerimiento r) {
        ArrayList<SistemaIntegradoDeSalud>copia= new ArrayList<>();
        for(int i=0; i< this.sistema.size(); i++){
            SistemaIntegradoDeSalud sis = this.sistema.get(i).getCopia(r);
            if(sis != null){
                copia.add(sis);
            }
        }
        if(copia.size()>0){
            Sector ss = new Sector();
            for( int i=0; i< copia.size(); i++){
                ss.addSector(copia.get(i));
            }
            return ss;
        }else {
            return null;
        }
    }
}
