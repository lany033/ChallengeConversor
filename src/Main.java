import javax.swing.JOptionPane;
public class Main {
    static Object opcion;
    static Object conversiones;
    static Divisa result;
    public static void main(String[] args) {
        escogerTipoDeConversor();
    }

    public static void escogerTipoDeConversor() {
        Object [] opciones = {"Conversor de moneda","Conversor de temperatura"};
        opcion = JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion","Menu",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
        if (opcion.toString().equals("Conversor de moneda")) {
            conversorDeMonedas();
        }else {
            System.out.println("Eligio conversor de temperatura");
        }
    }

    public static Object elegirTipoDeConversionMonetaria(){
        Object [] opcionDeConversion = {"De Sol a Dolar","De Sol a Euro","De Sol a Libras","De Sol a Yen","De Sol a Won Koreano","De Sol a PesosMXN","De Dolar a Sol","De Euro a Sol","De Libras a Sol","De Yen a Sol","De Won Koreano a Sol","De PesoMXN a Sol"};
        return conversiones = JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero","Monedas",JOptionPane.QUESTION_MESSAGE,null,opcionDeConversion,opcionDeConversion[0]);
    }

    public static void conversorDeMonedas(){
        switch (elegirTipoDeConversionMonetaria().toString()){
            case "De Sol a Dolar":
                resultadoConversionMonetaria(new Dolar());
                break;
            case "De Sol a Euro":
                resultadoConversionMonetaria(new Euro());
                break;
            case "De Sol a Libras":
                resultadoConversionMonetaria(new Libras());
                break;
            case "De Sol a Yen":
                resultadoConversionMonetaria(new Yen());
                break;
            case "De Sol a Won Koreano":
                resultadoConversionMonetaria(new WonKoreano());
                break;
            case "De Sol a PesosMXN":
                resultadoConversionMonetaria(new PesosMXN());
                break;
            case "De Dolar a Sol":
                resultadoConversionASoles(new Dolar());
                break;
            case "De Euro a Sol":
                resultadoConversionASoles(new Euro());
                break;
            case "De Libras a Sol":
                resultadoConversionASoles(new Libras());
                break;
            case "De Yen a Sol":
                resultadoConversionASoles(new Yen());
                break;
            case "De Won Koreano a Sol":
                resultadoConversionASoles(new WonKoreano());
                break;
            case "De PesoMXN a Sol":
                resultadoConversionASoles(new PesosMXN());
                break;
            default:
                result = new Sol();
                break;
        }
    }
    public static void resultadoConversionMonetaria(Divisa divisa){
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese valor"));
        try {
            JOptionPane.showMessageDialog(null, "Tienes "+ divisa.convertir(cantidad)+ " " + divisa.getSufijo(), "Message", 1);
            generarVentanaConfirmDialog();
        }catch (Exception e) {
            e.printStackTrace();
            generarVentanaDialogoInvalido();
        }
    }
    public static void resultadoConversionASoles(Divisa divisa){
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese valor"));
        try {
            JOptionPane.showMessageDialog(null, "Tienes "+ divisa.convertidorASoles(cantidad)+ " " + "soles", "Message", 1);
            generarVentanaConfirmDialog();
        }catch (Exception e) {
            e.printStackTrace();
            generarVentanaDialogoInvalido();
        }
    }
    public static void generarVentanaConfirmDialog(){
        int ventanaYesNotCancel = JOptionPane.showConfirmDialog(null, "¿Desea continuar?","Select an Option",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        if(ventanaYesNotCancel == 0) {
            escogerTipoDeConversor();
        }else if(ventanaYesNotCancel == 1){
            cerrar();
        }else if(ventanaYesNotCancel == 2){
            escogerTipoDeConversor();
        }
    }
    public static void generarVentanaDialogoInvalido(){
        JOptionPane.showMessageDialog(null, "Valor no valido");
    }

    public static void cerrar(){
        System.out.println("Cerrando");
    }
}
