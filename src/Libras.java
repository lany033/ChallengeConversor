public class Libras extends Divisa implements Conversor {

    private Divisa divisa;

    @Override
    public double getTipoDeCambioActual() {
        return 4.55;
    }

    @Override
    public double convertir(int cantidad) {
        return this.getTipoDeCambioActual() * cantidad;
    }
}
