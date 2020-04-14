import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        Scanner sn = new Scanner((System.in));

        System.out.println("Introduce el nombre de usuario");
        usuario.setNombre(sn.nextLine());
        System.out.println("Introduce la edad del usuario");
        usuario.setEdad(sn.nextInt());
        System.out.println("Introduce el DNI del usuario");
        String DNI = sn.next();
        while (!DNI.matches("[0-9]{8}-?[A-Z]")) {
            System.out.println("DNI introducido incorrecto");
            System.out.println("Introduzca un DNI válido: ");
            DNI = sn.next();
        }
        usuario.setDNI(DNI);
        Cuenta cuenta = new Cuenta(usuario);
        System.out.println(usuario.toString());


        int eleccion = 0;
        do {
            System.out.println("Realiza una nueva acción\n" +
                    "1 Introduce un nuevo gasto\n" +
                    "2 Introduce un nuevo ingreso\n" +
                    "3 Mostrar gastos\n" +
                    "4 Mostrar ingresos\n" +
                    "5 Mostrar saldo\n" +
                    "0 Salir");
            eleccion = sn.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Introduce la descripción");
                    sn.nextLine();
                    String descripcion = sn.nextLine();
                    System.out.println("Introduce la cantidad");
                    double cantidad = sn.nextDouble();
                    try {
                        cuenta.addGastos(descripcion, cantidad);
                    } catch (ErrorCantidadGasto errorCantidadGasto) {
                        System.out.println(errorCantidadGasto.mensaje);
                    }
                    System.out.println(cuenta.getGastos().toString());
                    break;
                case 2:
                    System.out.println("Introduce la descripción");
                    sn.nextLine();
                    descripcion = sn.nextLine();
                    System.out.println("Introduce la cantidad");
                    cantidad = sn.nextDouble();
                    cuenta.addIngresos(descripcion, cantidad);
                    System.out.println(cuenta.getIngresos().toString());
                    break;
                case 3:
                    for (int i = 0; i < cuenta.getGastos().size(); i++) {
                        System.out.println(cuenta.getGastos().get(i).description + " cantidad " + cuenta.getGastos().get(i).dinero + "€");
                    }
                    break;
                case 4:
                    for (int i = 0; i < cuenta.getIngresos().size(); i++) {
                        System.out.println(cuenta.getIngresos().get(i).description + " cantidad " + cuenta.getIngresos().get(i).dinero + "€");
                    }
                    break;
                case 5:
                    System.out.println(cuenta.toString());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Introduce una opción válida");
            }
        } while (eleccion != 0);

        System.out.println("Fin del programa\n" +
                "Gracias por utilizar la aplicación");
    }
}