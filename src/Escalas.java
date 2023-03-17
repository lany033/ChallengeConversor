import javax.swing.*;

public class Escalas{
    double conversion;
    public void celsiusAFahrenheit(Double valor) {
        conversion = (9*(valor)/5)+32;
        JOptionPane.showMessageDialog(null, "Celsius a Fahrenheit: "+ conversion + " " + "°F", "Message", 1);
    }
    public void celsiusAKelvin(Double valor) {
        conversion = valor + 273;
        JOptionPane.showMessageDialog(null, "Celsius a Kelvin: "+ conversion + " " + "°K", "Message", 1);
    }
    public void FahrenheitACelsius(Double valor){
        conversion = (5*(valor)/9)-32;
        JOptionPane.showMessageDialog(null, "Fahrenheit a Celsius: "+ conversion + " " + "°C", "Message", 1);

    }
    public void FahrenheitAKelvin(Double valor){
        conversion = ((5*(valor)/9)-32)+273;
        JOptionPane.showMessageDialog(null, "Fahrenheit a Kelvin: "+ conversion + " " + "°K", "Message", 1);

    }

    public void KelvinACelsius(Double valor){
        conversion = valor - 273;
        JOptionPane.showMessageDialog(null, "Kelvin a Celsius: "+ conversion + " " + "°C", "Message", 1);

    }

    public void KelvinAFahrenheit(Double valor){
        conversion = ((9*(valor)/5)-273)+32;
        JOptionPane.showMessageDialog(null, "Kelvin a Fahrenheit: "+ conversion + " " + "°F", "Message", 1);

    }
}
