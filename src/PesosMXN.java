public class PesosMXN extends Divisa {
    public String sufijo = "dolares";
    @Override
    public double getTipoDeCambioActual() {
        return 0.21;
    }

    @Override
    public String getSufijo() {
        return "PesosMXN";
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
