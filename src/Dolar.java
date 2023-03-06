public class Dolar extends Divisa {

    @Override
    public double getTipoDeCambioActual() {
        return 3.5;
    }

    @Override
    public String sufijo() {
        return "Dolares";
    }

    @Override
    public double convertir(int cantidad) {
        return cantidad / getTipoDeCambioActual();
    }
}
