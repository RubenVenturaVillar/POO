import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private double saldo;
    private Usuario usuario;
    private ArrayList<Gasto> gastos = new ArrayList<>();
    private ArrayList<Ingreso> ingresos = new ArrayList<>();

    public Cuenta(Usuario usuario) {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    double addIngresos(String description, double cantidad) {

        Ingreso ingreso = new Ingreso(cantidad, description);
        ingresos.add(ingreso);
        setSaldo(saldo + cantidad);
        return cantidad;
    }

    double addGastos(String description, double cantidad) throws ErrorCantidadGasto {
        if (cantidad > saldo) {
            throw new ErrorCantidadGasto("Cantidad insuficiente");
        } else {
            Gasto gasto = new Gasto(cantidad, description);
            gastos.add(gasto);
            setSaldo(saldo + cantidad);
            return cantidad;
        }
    }

    public List<Ingreso> getIngresos() {
        return ingresos;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public String toString() {
        return "El saldo restante es :" + getSaldo();
    }
}

