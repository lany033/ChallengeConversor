
public class Sol extends Divisa {
    public Divisa divisa;
    public Divisa escogerTipoDeMoneda(String moneda){
        Divisa result;
        switch (moneda){
            case "Dolar":
                result = new Dolar();
                break;
            case "Euro":
                result = new Euro();
                break;
            case "Libras":
                result = new Libras();
                break;
            case "Yen":
                result = new Yen();
                break;
            case "Won Koreano":
                result = new WonKoreano();
                break;
            case "PesosMXN":
                result = new PesosMXN();
                break;
            default:
                result = new Sol();
        }
        return this.divisa = result;
    }

    @Override
    public double getTipoDeCambioActual() {
        return divisa.getTipoDeCambioActual();
    }

    @Override
    public String sufijo() {
        return "Soles";
    }

    @Override
    public double convertir(int cantidad) {
        return getTipoDeCambioActual() * cantidad;
    }
}
