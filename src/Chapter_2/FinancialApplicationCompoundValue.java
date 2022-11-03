package Chapter_2;
import java.util.Scanner;

public class FinancialApplicationCompoundValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        int num = input.nextInt();
        final double RATE = 1 + 0.0375 / 12;
        double firstM = num * RATE;
        double secondM = (num + firstM) * RATE;
        double thirdM = (num + secondM) * RATE;
        double fourthM = (num + thirdM) * RATE;
        double fifthM = (num + fourthM) * RATE;
        double sixthM = (num + fifthM) * RATE;
        System.out.println("After first month, the account value is: " + firstM);
        System.out.println("After second month, the account value is " + secondM);
        System.out.println("After third month, the account value is " + thirdM);
        System.out.println("After fourth month, the account value is " + fourthM);
        System.out.println("After fifth month, the account value is " + fifthM);
        System.out.println("After sixth month, the account value is " + sixthM);

    }
}
