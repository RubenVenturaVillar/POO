public class Ingreso extends Dinero {

    public Ingreso(double ingreso, String description) {
        setDinero(dinero += ingreso);
        setDescription(description);
    }

    public String toString() {

        return "Ingreso realizado correctamente\nConcepto: "+description+"\nCantidad:" + getDinero()+"€";
    }
}