package truck.expenses;
import java.util.Scanner;
public class TruckExpenses {
    public static void main(String[] args) {
        int trucks,t_earn,t_exp,profit,t_profit,exp;
        int earn=3000,deiel=500,tax=100,drivers=1000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Trucks:");
        trucks = input.nextInt();
        t_earn=earn*trucks;
        exp=deiel+tax+drivers;
        t_exp=trucks*exp;
        profit=earn-exp;
        t_profit=t_earn-t_exp;
        System.out.println("Earning of total trucks are: "+t_earn);
        System.out.println("Expenses of one truck is: "+exp);
        System.out.println("Earning of total trucks are: "+t_exp);
        System.out.println("Profit of one truck is: "+profit);
        System.out.println("Total profit of each truck are: "+t_profit);
        System.out.println("Created By Bilal Iqbal");
    }
    
}
