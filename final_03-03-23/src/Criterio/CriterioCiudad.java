package Criterio;

public class CriterioCiudad extends CriterioDeBusqueda{
    private String ciudad;

    public CriterioCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public boolean cumple(Participante p) {
        return p.getCiudad().equals(ciudad);
    }
}
