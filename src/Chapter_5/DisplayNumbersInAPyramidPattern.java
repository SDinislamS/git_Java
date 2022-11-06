package Chapter_5;
import java.util.Scanner;

public class DisplayNumbersInAPyramidPattern {
    public static void main(String[] args) {
        int num = 8;

        for (int i = 0; i < num; i++) {
            for (int j = num; j > i + 1; j--) {
                System.out.print("     ");

            }
            for (int j = 0; j < i + 1; j++) {
                System.out.printf( "%5d" , (int)(Math.pow(3,j)));
            }
            for (int j = i-1; j >= 0; j--) {
                System.out.printf( "%5d" , (int)(Math.pow(3,j)));

            }
            System.out.println("");
        }
    }

}
