package Chapter_3;
import java.util.Scanner;

public class GeometryIsPointInACircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x1 = 0, y1 = 0, x2, y2;
        int radius = 10;
        System.out.println("Enter a point with two coordinates: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        double s = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        if(s <= radius)
            System.out.println("Point (" + x2 + " , " + y2 +") is in the circle");
        else
            System.out.println("Point (" + x2 + " , " + y2 +") is  not in the circle");
    }
}
