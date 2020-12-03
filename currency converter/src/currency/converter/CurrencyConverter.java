package currency.converter;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        double rupee,dollar,riyal,dirham,euro,pound;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Currency in Rupees:");
        rupee = input.nextDouble();
        dollar=rupee*133.38;
        riyal=rupee*35.55;
        dirham=rupee*36.31;
        euro=rupee*152.32;
        pound=rupee*171.25;            
        System.out.println("Currency in Dollar is :"+dollar);
        System.out.println("Currency in Riyal is :"+riyal);
        System.out.println("Currency in Dirham is :"+dirham);
        System.out.println("Currency in Euro is :"+euro);
        System.out.println("Currency in Pound is :"+pound);
        System.out.println("Created By Bilal Iqbal");
    }
    
}
