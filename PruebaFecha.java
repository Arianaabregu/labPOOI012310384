public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(9, 13, 2023);
        fecha.mostrarFecha();
        fecha.establecerDia(14);
        fecha.mostrarFecha();
    }
}