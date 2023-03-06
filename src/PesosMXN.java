public class PesosMXN extends Divisa implements Conversor {

    private Divisa divisa;

    @Override
    public double getTipoDeCambioActual() {
        return 0.21;
    }

    @Override
    public double convertir(int cantidad) {
        return this.getTipoDeCambioActual() * cantidad;
    }
}
