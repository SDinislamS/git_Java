package Chapter_6;
import java.util.Scanner;

public class ConversionsBetweenMileAndKilometer {
    public static void main(String[] args){
        System.out.println("Miles     Kilometers | Kilometers     Miles");
        System.out.println("---------------------------------------------");
        int km = 20;
        for (int i = 1; i <= 10 ; i++) {

            System.out.printf("%-8d  %-8.3f   | %-10d     %-8.3f\n", i, mileToKilometer(i), km, kilometerToMile(km) );
            km += 5;
        }

    }

    public static double mileToKilometer(double mile){
        mile *= 1.608;
        return mile;
    }

    public static double kilometerToMile(double kilometer){
        kilometer /= 1.609;
        return kilometer;
    }
}
