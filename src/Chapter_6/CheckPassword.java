package Chapter_6;
import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        if(isAtLeastTenCharacters(password) && isConsistsOfOnlyLettersAndDigits(password) && isContainAtLeastThreeDigits(password))
            System.out.println("Valid password");
        else
            System.out.println("Invalid password");

    }
    public static boolean isAtLeastTenCharacters (String passw){
        if(passw.length() < 10) return false;
        else return true;

    }
    public static boolean isConsistsOfOnlyLettersAndDigits (String passw){
        for (int i = 0; i < passw.length(); i++) {
            if((passw.charAt(i) <= 'z' && passw.charAt(i) >= 'a') || (passw.charAt(i) <= 'Z' && passw.charAt(i) >= 'A') || (passw.charAt(i) <= '9' && passw.charAt(i) >= '0')) {
            }
            else
                return false;
        }
        return true;
    }
    public static boolean isContainAtLeastThreeDigits (String passw){
        int count = 0;
        for (int i = 0; i < passw.length(); i++) {
            if(passw.charAt(i) >= '0' && passw.charAt(i) <= '9') count++;
        }
        if(count >= 3) return true;
        else return false;
    }
}
