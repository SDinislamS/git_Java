package Chapter_4;
import java.util.Scanner;

public class PhoneKeyPads {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String s = input.nextLine();

        switch (s.toLowerCase()){
            case "a": System.out.println("The corresponding number is: " + 2);
                break;
            case "d": System.out.println("The corresponding number is: " + 3);
                break;
            case "g": System.out.println("The corresponding number is: " + 4);
                break;
            case "j": System.out.println("The corresponding number is: " + 5);
                break;
            case "m": System.out.println("The corresponding number is: " + 6);
                break;
            case "p": System.out.println("The corresponding number is: " + 7);
                break;
            case "t": System.out.println("The corresponding number is: " + 8);
                break;
            case "w": System.out.println("The corresponding number is: " + 9);
                break;
            default: System.out.println(s + " is an invalid input");
        }

    }
}
