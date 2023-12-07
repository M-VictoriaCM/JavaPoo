package Condicion;

public class CondicionCondicionales extends Condicion{
    private Condicion c1, c2;

    public CondicionCondicionales(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Pista p) {
        return this.c1.cumple(p) && this.c2.cumple(p);
    }
}
