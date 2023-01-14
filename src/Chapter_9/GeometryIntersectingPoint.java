package Chapter_9;

import Chapter_9.LinearEquations;
import java.util.Scanner;

public class GeometryIntersectingPoint {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the four points x1 y1 x2 y2 x3 y3 x4 y4: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble();
        double y2=input.nextDouble();
        double x3=input.nextDouble();
        double y3=input.nextDouble();
        double x4=input.nextDouble();
        double y4=input.nextDouble();
        LinearEquations s = new LinearEquations(y1-y2,x2-x1,y3-y4,x4-x3,(y1-y2)*x1-(x1-x2)*y1,(y3-y4)*x3-(x3-x4)*y3);
        if(s.isSolvable())
            System.out.println(s.getX()+" "+s.getY());
        else
            System.out.println("Error");
    }
}

