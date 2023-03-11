public class Yen extends Divisa {

    @Override
    public double getTipoDeCambioActual() {
        return 0.028;
    }
    @Override
    public String getSufijo() {
        return "Yenes";
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
