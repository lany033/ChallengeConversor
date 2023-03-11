public class Euro extends Divisa {
    @Override
    public double getTipoDeCambioActual() {
        return 4.02;
    }
    @Override
    public String getSufijo() {
        return "Euros";
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
