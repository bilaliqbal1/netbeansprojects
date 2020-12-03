package temperature.converter;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        double temp,fah,kel;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        temp = input.nextDouble();
        fah=32.0+(9.0/5.0)*temp;
        kel=(5.0/9.0*(fah-32.0))+273.15;
        System.out.println("Temperature in Fahrenheit is :"+fah);
        System.out.println("Temperature in Kevin is :"+kel);
        System.out.println("Created By Bilal Iqbal");
    }
    
}
