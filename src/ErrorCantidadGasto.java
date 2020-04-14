public class ErrorCantidadGasto extends Exception{
    String mensaje;
    public ErrorCantidadGasto(String mensaje){
        this.mensaje = mensaje;
    }
}
