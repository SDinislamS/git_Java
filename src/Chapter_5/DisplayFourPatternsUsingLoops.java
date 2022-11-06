package Chapter_5;
import java.util.Scanner;

public class DisplayFourPatternsUsingLoops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Pattern A");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i+1 ; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Pattern B");
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i ; j--) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Pattern C");
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i + 1; j--) {
                System.out.print("   ");

            }
            for (int j = 0; j < i + 1 ; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Pattern D");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("   ");

            }
            for (int j = num; j > i ; j--) {
                System.out.print("*  ");
            }
            System.out.println("");
        }


    }
}
