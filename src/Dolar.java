public class Dolar extends Divisa implements Conversor {

    private Divisa divisa;

    @Override
    public double getTipoDeCambioActual() {
        return 3.5;
    }

    @Override
    public double convertir(int cantidad) {
        return this.getTipoDeCambioActual() * cantidad;
    }
}
