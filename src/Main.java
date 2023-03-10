import javax.swing.JOptionPane;
public class Main {
    static Object opcion;
    static Object conversiones;
    static Divisa result;
    public static void main(String[] args) {

        if (escogerTipoDeConversor().toString().equals("Conversor de moneda")) {
            conversorDeMonedas();
        }else {
            System.out.println("Eligio conversor de temperatura");
        }
    }

    public static Object escogerTipoDeConversor() {
        Object [] opciones = {"Conversor de moneda","Conversor de temperatura"};
        return opcion = JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion","Menu",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
    }

    public static void conversorDeMonedas(){
        switch (elegirTipoDeConversionMonetaria().toString()){
            case "De Sol a Dolar":
                result = new Dolar();
                break;
            case "De Sol a Euro":
                result = new Euro();
                break;
            case "De Sol a Libras":
                result = new Libras();
                break;
            case "De Sol a Yen":
                result = new Yen();
                break;
            case "De Sol a Won Koreano":
                result = new WonKoreano();
                break;
            case "De Sol a PesosMXN":
                result = new PesosMXN();
                break;
            case "De Dolar a Sol":
                result = new Sol().escogerTipoDeMoneda("Dolar");
                break;
            case "De Euro a Sol":
                result = new Sol().escogerTipoDeMoneda("Euro");
                break;
            case "De Libras a Sol":
                result = new Sol().escogerTipoDeMoneda("Libras");
                break;
            case "De Yen a Sol":
                result = new Sol().escogerTipoDeMoneda("Yen");
                break;
            case "De Won Koreano a Sol":
                result = new Sol().escogerTipoDeMoneda("Won Koreano");
                break;
            case "De PesoMXN a Sol":
                result = new Sol().escogerTipoDeMoneda("PesosMXN");
                break;
            default:
                result = new Sol();
                break;
        }
        try {
            resultadoConversionMonetaria();
            generarVentanaConfirmDialog();
        }catch (Exception e) {
            e.printStackTrace();
            generarVentanaDialogoInvalido();
        }
    }
    public static Object elegirTipoDeConversionMonetaria(){
        Object [] opcionDeConversion = {"De Sol a Dolar","De Sol a Euro","De Sol a Libras","De Sol a Yen","De Sol a Won Koreano","De Sol a PesosMXN","De Dolar a Sol","De Euro a Sol","De Libras a Sol","De Yen a Sol","De Won Koreano a Sol","De PesoMXN a Sol"};
        return conversiones = JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero","Monedas",JOptionPane.QUESTION_MESSAGE,null,opcionDeConversion,opcionDeConversion[0]);
    }
    public static void resultadoConversionMonetaria(){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese valor"));
        JOptionPane.showMessageDialog(null, "Tienes "+ result.convertir(cantidad)+ " " + result.sufijo(), "Message", 1);
    }
    public static void generarVentanaConfirmDialog(){
        int ventanaYesNotCancel = JOptionPane.showConfirmDialog(null, "¿Desea continuar?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        if(ventanaYesNotCancel == 0) {
            System.out.println("Has pulsado Yes");
        }else if(ventanaYesNotCancel == 1){
            System.out.println("Has pulsado No");
        }else if(ventanaYesNotCancel == 2){
            System.out.println("Has pulsado Cancel");
        }
    }
    public static void generarVentanaDialogoInvalido(){
        JOptionPane.showMessageDialog(null, "Valor no valido");
    }

}
