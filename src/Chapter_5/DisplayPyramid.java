package Chapter_5;
import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 15: ");
        int num = input.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + "  ");

            }
            for (int j = 2; j <= i ; j++) {
                System.out.print(j + "  ");

            }
            System.out.println("");
        }
    }
}
