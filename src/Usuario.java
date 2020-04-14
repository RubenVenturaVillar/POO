
public class Usuario {
    private String nombre;
    private int edad;
    private String DNI;

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String toString() {
        return "El usuario " + getNombre() + ", edad " + getEdad() + " y DNI " + getDNI()+" ha sido creado correctamente";
    }
}
