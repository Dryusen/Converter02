package app;

public class Main {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        System.out.println("My git app.");

        double fahrenheit = 98.6;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");

        double celsiusTemp = 37;
        double fahrenheitTemp = celsiusToFahrenheit(celsiusTemp);
        System.out.println(celsiusTemp + "°C is equal to " + fahrenheitTemp + "°F");

    }
}
