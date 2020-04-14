public class Gasto extends Dinero {

    public Gasto(double gasto, String description) {
        setDinero(dinero -= gasto);
        setDescription(description);
    }

    public String toString() {

        return "Gasto realizado correctamente\nConcepto: "+description+"\nCantidad:" + getDinero()+"€";
    }
}
