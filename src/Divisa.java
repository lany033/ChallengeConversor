public abstract class Divisa implements Conversor{
    private double tipoDeCambioActual;
    private String sufijo;

    public String getSufijo() {
        return sufijo;
    }

    public double convertir(double cantidad) {
        return tipoDeCambioActual;
    }

    protected double getTipoDeCambioActual() {
        return tipoDeCambioActual;
    }
}
