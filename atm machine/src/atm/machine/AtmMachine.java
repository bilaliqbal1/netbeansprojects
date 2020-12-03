package atm.machine;
import java.util.Scanner;
public class AtmMachine {
    public static void main(String[] args) {
        int input,note,note1,note2,note3,note4,note5,note6,rem,rem1,rem2,rem3,rem4,rem5,rem6,bal,bal1,bal2,bal3,bal4,bal5,bal6;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your amount: ");
        input = in.nextInt();
        rem = input/5000;
        note = rem*5000;
        bal = input - note;
        rem1 = bal/1000;
        note1 = rem1 * 1000;
        bal1 = bal - note1;
        rem2 = bal1 / 500;
        note2 = rem2 *500;
        bal2 = bal1 - note2;
        rem3 = bal2 / 100;
        note3 = rem3 * 100;
        bal3 = bal2 - note3;
        rem4 = bal3 / 50;
        note4 = rem4 * 50;
        bal4 = bal3 - note4;
        rem5 = bal4 / 20;
        note5 = rem5 * 20;
        bal5 = bal4 - note5;
        rem6 = bal5 / 10;
        note6 = rem6 * 10;
        bal6 = bal5 - note6;
        System.out.println(rem+"notes of 5000\n"+rem1+"notes of 1000\n"+rem2+"notes of 500\n");
        System.out.println(rem3+"notes of 100\n"+rem4+"notes of 50\n"+rem5+"notes of 20\n"+rem6+"notes of 10\n");
        System.out.println("Created By Bilal Iqbal");
    }
    
}
