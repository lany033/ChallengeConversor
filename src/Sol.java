public class Sol extends Divisa {

    private Divisa dolar = new Dolar();


    @Override
    public double getTipoDeCambioActual() {
        return dolar.getTipoDeCambioActual();
    }

    @Override
    public String sufijo() {
        return "Soles";
    }

    @Override
    public double convertir(int cantidad) {
        return 0;
    }
}
