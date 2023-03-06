public class WonKoreano extends Divisa {

    private Divisa divisa;

    @Override
    public double getTipoDeCambioActual() {
        return 0.0029;
    }

    @Override
    public String sufijo() {
        return "Won Koreanos";
    }

    @Override
    public double convertir(int cantidad) {
        return cantidad / getTipoDeCambioActual();
    }
}
