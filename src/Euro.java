public class Euro extends Divisa implements Conversor {

    private Divisa divisa;

    @Override
    public double getTipoDeCambioActual() {
        return 4.02;
    }

    @Override
    public double convertir(int cantidad) {
        return this.getTipoDeCambioActual() * cantidad;
    }
}
