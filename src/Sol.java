public class Sol extends Divisa implements Conversor {

    private Divisa divisa;

    private String eleccionDeDivisa;

    public Object Divisa() {
        Divisa result = null;
        switch (eleccionDeDivisa) {
            case "Dolar":
                result = new Dolar();
                break;
            case "Euro":
                result = new Euro();
                break;
            case "PesosMXN":
                result = new PesosMXN();
                break;
            case "Libras":
                result = new Libras();
                break;
            case "Yen":
                result = new Yen();
                break;
            case "WonKoreano":
                result = new WonKoreano();
        }
        return result;
    }

    @Override
    public double getTipoDeCambioActual() {
        return divisa.getTipoDeCambioActual();
    }

    @Override
    public double convertir(int cantidad) {
        return this.getTipoDeCambioActual() * cantidad;
    }
}
