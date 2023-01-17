package Chapter_10;

public class MyPoint {
    private double x, y;
    MyPoint(){
        x = 0;
        y = 0;
    }

    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint p){
        double d = Math.sqrt( (Math.pow( (this.x - p.getX()), 2)) + (Math.pow( (this.y - p.getY()), 2)) );
        return d;
    }
    public static double distance(MyPoint p1, MyPoint p2){
        double d = Math.sqrt( (Math.pow( (p1.getX() - p2.getX()), 2)) + (Math.pow( (p1.getY() - p2.getY()), 2)) );
        return d;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
