package Chapter_5;
import java.util.Scanner;

public class DisplayCalendars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter first day of the year: ");
        int firstDay = input.nextInt();
        int count = 1;
        boolean isLeapYear = ((year / 4 == 0) && (year / 100 != 0)) || (year / 400 == 0);

        for (int i = 1; i <= 12; i++) {

            switch (i){
                case 1: System.out.println("                 Jan                 ");
                        System.out.println("_____________________________________");
                        System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 31) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 2: System.out.println("                 Feb                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        int febDays;
                        if(isLeapYear) febDays = 29;
                        else febDays = 28;
                        if(j - firstDay + 1 > febDays) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 3: System.out.println("                 Mar                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 31) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 4: System.out.println("                 Apr                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 30) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 5: System.out.println("                 May                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 31) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 6: System.out.println("                 Jun                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 30) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 7: System.out.println("                 Jul                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 31) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 8: System.out.println("                 Aug                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 31) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 9: System.out.println("                 Sep                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 30) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 10: System.out.println("                 Oct                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 31) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 11: System.out.println("                 Nov                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 30) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 12: System.out.println("                 Dec                 ");
                    System.out.println("_____________________________________");
                    System.out.println("  Mon  Tue  Wed  Thu  Fri  Sat  Sun  ");
                    for (int j = 1; j <= 40; j++) {
                        if(j - firstDay + 1 > 31) {
                            if(j % 7 != 0){
                                firstDay = j % 7;
                            }
                            else firstDay = 7;
                            break;
                        }
                        if(j < firstDay) {
                            System.out.print("     ");
                        } else{
                            System.out.printf("%5d" , j - firstDay + 1);
                            if(j % 7 == 0) System.out.println();
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                default: break;
            }
        }
    }
}
