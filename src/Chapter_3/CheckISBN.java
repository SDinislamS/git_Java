package Chapter_3;

import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int num = input.nextInt();
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
        d1 = num / 100000000;
        d2 = num / 10000000 % 10;
        d3 = num / 1000000 % 10;
        d4 = num / 100000 % 10;
        d5 = num / 10000 % 10;
        d6 = num / 1000 % 10;
        d7 = num / 100 % 10;
        d8 = num / 10 % 10;
        d9 = num % 10;
        d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;

        if(d10 != 10)
            System.out.println("The ISBN-10 number is " + num + d10);
        else
            System.out.println("The ISBN-10 number is " + num + "X");

    }
}
