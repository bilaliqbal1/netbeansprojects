package weight.converter;
import java.util.Scanner;
public class WeightConverter {
    public static void main(String[] args) {
       double kg,gm,mg,p;
       Scanner input = new Scanner (System.in);
        System.out.println("Enter weight in gram:");
        gm = input.nextDouble();
        kg = gm/1000;
        mg = gm/1000;
        p=gm*453.592;
        System.out.println("Weight in gram is :"+kg);
        System.out.println("Weight in kilogram is :"+mg);
        System.out.println("Weight in pound is :"+p);
        System.out.println("Created By Bilal Iqbal");
    }
    
}
