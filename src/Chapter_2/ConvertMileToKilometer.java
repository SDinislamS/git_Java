package Chapter_2;
import java.util.Scanner;
public class ConvertMileToKilometer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double miles, kilometers;
        System.out.print("Enter miles: " );
        miles = input.nextDouble();
        kilometers = 1.6 * miles;
        System.out.println(miles + " miles is " + kilometers + " kilometers");

    }
}
