public class PesosMXN extends Divisa {

    private Divisa divisa;

    @Override
    public double getTipoDeCambioActual() {
        return 0.21;
    }

    @Override
    public String sufijo() {
        return "PesosMXN";
    }

    @Override
    public double convertir(int cantidad) {
        return cantidad / getTipoDeCambioActual();
    }
}
