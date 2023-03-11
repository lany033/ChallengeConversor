public class Dolar extends Divisa {

    public double getTipoDeCambioActual() {
        return 3.8;
    }
    public String getSufijo() {
        return "dolares";
    }
    @Override
    public double convertir(double cantidad) {
        return cantidad / getTipoDeCambioActual();
    }

    @Override
    public double convertidorASoles(double cantidad) {
        return cantidad * getTipoDeCambioActual();
    }
}
