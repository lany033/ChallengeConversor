public class WonKoreano extends Divisa {


    @Override
    public double getTipoDeCambioActual() {
        return 0.0029;
    }

    @Override
    public String getSufijo() {
        return "Won Koreanos";
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
