public abstract class Divisa implements Conversor{
    private double tipoDeCambioActual;

    public double getTipoDeCambioActual() {
        return tipoDeCambioActual;
    }

    public abstract String sufijo();


    public double convertir(int cantidad) {
        return 0;
    }
}
