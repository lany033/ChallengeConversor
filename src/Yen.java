public class Yen extends Divisa implements Conversor {

    private Divisa divisa;

    @Override
    public double getTipoDeCambioActual() {
        return 0.028;
    }

    @Override
    public double convertir(int cantidad) {
        return this.getTipoDeCambioActual() * cantidad;
    }
}
