package Chapter_2;
import java.util.Scanner;

public class MultiplyTheDigitsInAnInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 - 1000 : ");
        int num = input.nextInt();
        int result = (num / 100) * ((num % 100) / 10) * (num % 10) ;
        System.out.println("The multiplication of all digits in " + num + " is: " + result);
    }
}
