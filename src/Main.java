import javax.swing.JOptionPane;

import static jdk.nashorn.internal.objects.NativeFunction.function;

public class Main {
    public static void main(String[] args) {
        Object [] opciones = {"Conversor de moneda","Conversor de temperatura"};
        Object opcion = JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion","Menu",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
        if (opcion.toString().equals("Conversor de moneda")) {
            Object [] opcionDeConversion = {"De Sol a Dolar","De Sol a Euro","De Sol a Libras","De Sol a Yen","De Sol a Won Koreano","De Sol a PesosMXN","De Dolar a Sol","De Euro a Sol","De Libras a Sol","De Yen a Sol","De Won Koreano a Sol","De PesoMXN a Soles"};
            Object conversiones = JOptionPane.showInputDialog(null,"Elije la moneda a la que deseas convertir tu dinero","Monedas",JOptionPane.QUESTION_MESSAGE,null,opcionDeConversion,opcionDeConversion[0]);
            Divisa result;
            switch (conversiones.toString()){
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
                    result = new Sol();
                    break;
                default:
                    result = new Sol();
                    break;
            }
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese valor"));
            JOptionPane.showMessageDialog(null, "Tienes "+ result.convertir(cantidad)+ " " + result.sufijo(), "Message", 1);

        }else {
            System.out.println("Eligio conversor de temperatura");
        }
    }
}
