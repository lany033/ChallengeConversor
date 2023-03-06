public class Yen extends Divisa {

    private Divisa divisa;

    @Override
    public double getTipoDeCambioActual() {
        return 0.028;
    }

    @Override
    public String sufijo() {
        return "Yenes";
    }

    @Override
    public double convertir(int cantidad) {
        return cantidad / getTipoDeCambioActual();
    }
}
