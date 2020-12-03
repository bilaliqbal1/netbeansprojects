package lenghtconverter;
import java.util.Scanner;
public class Lenghtconverter {
    public static void main(String[] args) {
        double len,cm,mm,km,mile,inch,feet,yard;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length in meter:");
        len = input.nextDouble();
        cm=len/100;
        mm=len/1000;
        km=len*1000;
        inch=len*39.3701;
        feet=len*3.28;
        yard=len*1.093;
        mile=len*0.000621371;        
        System.out.println("Length in milimeter is :"+mm);
        System.out.println("Length in centimeter is :"+cm);
        System.out.println("Length in kilometer is :"+km);
        System.out.println("Length in inches is :"+inch);
        System.out.println("Length in feet is :"+feet);
        System.out.println("Length in yard is :"+yard);
        System.out.println("Length in mile is :"+mile);
        System.out.println("Created By Bilal Iqbal");
    }    
}
