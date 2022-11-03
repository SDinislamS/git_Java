package Chapter_4;
import java.util.Scanner;

public class ConvertLetterGradeToNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter grade: ");
        String s = input.nextLine();
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        String s5 = "E";
        if(s.equals(s1))
            System.out.println("The numeric value for grade " + s + " is 4");
        else if(s.equals(s2))
            System.out.println("The numeric value for grade " + s + " is 3");
        else if(s.equals(s3))
            System.out.println("The numeric value for grade " + s + " is 2");
        else if(s.equals(s4))
            System.out.println("The numeric value for grade " + s + " is 1");
        else if(s.equals(s5))
            System.out.println("The numeric value for grade " + s + " is 0");
        else
            System.out.println(s + " is an invalid grade");
    }
}
