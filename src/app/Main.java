package app;

public class Main {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        System.out.println("My git app.");
        
        double fahrenheit = 98.6;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}
