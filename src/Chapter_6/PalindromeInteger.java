package Chapter_6;
import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        if(isPalindrome(num))
            System.out.println(num +" is palindrome");
        else
            System.out.println(num + " is not palindrome");
    }

    public static int reverse(int number){
        int reversedNum = 0;
        for(;number != 0; number /= 10) {
            int digit = number % 10;
             reversedNum = reversedNum * 10 + digit;
        }
        return reversedNum;
    }

    public static boolean isPalindrome(int number){
        if(number == reverse(number))
            return true;
        else
            return false;
    }
}
