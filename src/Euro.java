public class Euro extends Divisa {

    private Divisa divisa;

    @Override
    public double getTipoDeCambioActual() {
        return 4.02;
    }

    @Override
    public String sufijo() {
        return "Euros";
    }

    @Override
    public double convertir(int cantidad) {
        return cantidad / getTipoDeCambioActual();
    }
}
