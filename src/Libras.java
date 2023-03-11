public class Libras extends Divisa {
    @Override
    public double convertir(double cantidad) {
        return cantidad / getTipoDeCambioActual();
    }

    @Override
    public double convertidorASoles(double cantidad) {
        return cantidad * getTipoDeCambioActual();
    }

    @Override
    public double getTipoDeCambioActual() {
        return 4.55;
    }

}
