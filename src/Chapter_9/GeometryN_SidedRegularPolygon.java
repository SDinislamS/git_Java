package Chapter_9;

public class GeometryN_SidedRegularPolygon {
    public static void main(String[] args){
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Perimeter: " + p1.getPerimeter() + " Area: " + p1.getArea());
        System.out.println("Perimeter: " + p2.getPerimeter() + " Area: " + p2.getArea());
        System.out.println("Perimeter: " + p3.getPerimeter() + " Area: " + p3.getArea());
    }

}
class RegularPolygon{
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    RegularPolygon(){
        n = 3;
        side = 1;
    }
    RegularPolygon(int n, double newSide){
        this.n = n;
        side = newSide;
    }
    RegularPolygon(int newN, double newSide, double newX, double newY){
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    public void setN(int newN) {
        n = newN;
    }

    public int getN() {
        return n;
    }

    public void setSide(double newSide) {
        side = newSide;
    }
    public double getSide() {
        return side;
    }

    public void setY(double newX) {
        x = newX;
    }
    public double getX() {
        return x;
    }

    public void setX(double newY) {
        y = newY;
    }
    public double getY() {
        return y;
    }

    public double getPerimeter(){
        return n * side;
    }
    public double getArea(){
        return (n * Math.pow(side,2)) / (4 * Math.tan(Math.PI / n));
    }
}
