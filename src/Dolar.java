public class Dolar extends Divisa {

    public Dolar() {

    }

    @Override
    public double getTipoDeCambioActual() {
        return 3.8;
    }

    @Override
    public String sufijo() {
        return "Dolares";
    }

    @Override
    public double convertir(int cantidad) {
        return cantidad / getTipoDeCambioActual();
    }
}
