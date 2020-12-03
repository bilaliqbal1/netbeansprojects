package salary;
import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        int sal,t_salary,t_tax;
        double tax=0.15;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary:");
        sal = input.nextInt();
        t_tax= (int) (sal*tax);
        t_salary=sal-t_tax;
        System.out.println("Salary with tax: "+t_tax);
        System.out.println("Total salary after deduction of tax: "+t_salary);
        System.out.println("Created By Bilal Iqbal");
    }    
}
