public class Sol extends Divisa {

    public double tipoDeCambioActual;

    @Override
    public double convertir(double cantidad) {
        return getTipoDeCambioActual()*cantidad;
    }

    @Override
    public double convertidorASoles(double cantidad) {
        return cantidad * getTipoDeCambioActual();
    }

}
