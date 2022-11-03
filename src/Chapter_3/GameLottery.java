package Chapter_3;
import java.util.Scanner;


public class GameLottery {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lottNum = (int)(Math.random() * 1000);
        System.out.println("The lottery number is: " + lottNum);
        System.out.println("Enter your number: ");
        int num = input.nextInt();

        int d1, d2, d3, ld1, ld2, ld3;
        d1 = num / 100;
        d2 = num / 10 % 10;
        d3 = num % 10;
        ld1 = lottNum / 100;
        ld2 = lottNum / 10 % 10;
        ld3 = lottNum % 10;

        if(num == lottNum)
            System.out.println("You won. The award is $12,000!");
        else if((d1 == ld2 && d2 == ld3 && d3 == ld1) || (d1 == ld3 && d2 == ld1 && d3 == ld2) || (d1 == ld1 && d2 ==ld3 && d3 == ld2)
        || (d1 == ld2 && d2 == ld1 && d3 == ld3) || (d1 == ld3 && d2 == ld2 && d3 == ld1))
            System.out.println("You won. The award is $5000!");
        else if(d1 == ld1 || d1 == ld2 || d1 == ld3 || d2 == ld1 || d2 == ld2 || d2 == ld3 || d3 == ld1 || d3 == ld2 || d3 == ld3 )
            System.out.println("You won. The award is $2000!");
        else
            System.out.println("You lost(");


    }
}
