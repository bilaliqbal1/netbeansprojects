package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter two numbers for arithmetic operations:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b= input.nextInt();
        System.out.println("Addition is :"+(a+b));
        System.out.println("Subtraction is :"+(a-b));
        System.out.println("Multiplication is :"+(a*b));
        System.out.println("Division is :"+(a/b));
        System.out.println("Modulus is :"+(a%b));
        System.out.println("Created By Bilal Iqbal");
    }
    
}
