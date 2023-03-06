public class Libras extends Divisa {

    private Divisa divisa;

    @Override
    public double getTipoDeCambioActual() {
        return 4.55;
    }

    @Override
    public String sufijo() {
        return "libras";
    }

    @Override
    public double convertir(int cantidad) {
        return cantidad / getTipoDeCambioActual();
    }
}
