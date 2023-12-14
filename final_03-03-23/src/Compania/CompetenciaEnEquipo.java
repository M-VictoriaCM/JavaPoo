package Compania;

public class CompetenciaEnEquipo extends Competencia{
    public CompetenciaEnEquipo(String nombre) {
        super(nombre);
    }
    public double getDuracion(){
        double max= 0;
        for(EventoDeportivo e: this.elemento){
            if(e.getDuracion() > max){
                max = e.getDuracion();
            }
        }
        return max;
    }
}
