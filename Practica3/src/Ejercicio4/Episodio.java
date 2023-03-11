package Ejercicio4;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean esVisto;
    private int calificacion;
    private static int mayorcalificacion = 5;
    private static int menorcalificacion = 1;
    private static int calificacionNegativa = -1;

    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.esVisto =esVisto;
        this.calificacion = calificacion;
    }

    /*Getter y setter*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsVisto() {
        return esVisto;
    }

    public void setEsVisto(boolean esVisto) {
        this.esVisto= esVisto;
        if(esVisto == true){
            this.calificacion = this.getCalificacion();
        }else{
            this.calificacion =this.getCalificacion();
        }

    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
        if(this.calificacion >= getMenorcalificacion()
		&& this.calificacion <= getMayorcalificacion()){
        }else{
            this.calificacion = getCalificacionNegativa();
        }
    }

    public static int getMayorcalificacion() {
        return mayorcalificacion;
    }

    public static int getMenorcalificacion() {
        return menorcalificacion;
    }

    public static int getCalificacionNegativa() {
        return calificacionNegativa;
    }
}
