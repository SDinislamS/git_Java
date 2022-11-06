package Chapter_5;
import java.util.Scanner;

public class FinancialApplicationCompareLoansWithVariousInterestRates {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        /*Math.pow(1 + monthlyInterestRate, numberOfYears * 12)
        double monthlyPayment = loanAmount * monthlyInterestRate / ( 1
        - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
         */
        double interestRate = 5.0;
        System.out.printf("%-25s %-25s %-25s \n","Interest Rate", "Monthly Payment", "Total Payment");
        for (float i = 0; i <= 20; i++){

            double monthlyInterestRate = interestRate  / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / ( Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            System.out.printf("%-24.3f%% %-25.2f %-25.2f\n", interestRate, monthlyPayment, totalPayment);
            interestRate = interestRate + 0.25;

        }
    }
}
