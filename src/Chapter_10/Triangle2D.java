package Chapter_10;

public class Triangle2D {
    MyPoint p1, p2, p3;

    Triangle2D(){
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }
    Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double getArea(){
        double area = ( (p2.getX() - p1.getX()) * (p3.getY() - p1.getY()) -
                (p3.getX() - p1.getX()) * (p2.getY() - p1.getY()) ) / 2;
        return area;
    }
    public double getPerimeter(){
        double p = MyPoint.distance(p1, p2) + MyPoint.distance(p2, p3) +
                MyPoint.distance(p3, p1);
        return p;
    }
    public boolean isContains(MyPoint p){
/*      (x1-x0)*(y2-y1)-(x2-x1)*(y1-y0)
        (x2-x0)*(y3-y2)-(x3-x2)*(y2-y0)
        (x3-x0)*(y1-y3)-(x1-x3)*(y3-y0)
*/
        double d1 = (p1.getX() - p.getX()) * (p2.getY() - p1.getY()) -
                (p2.getX() - p1.getX()) * (p1.getY() - p.getY());
        double d2 = (p2.getX() - p.getX()) * (p3.getY() - p2.getY()) -
                (p3.getX() - p2.getX()) * (p2.getY() - p.getY());
        double d3 = (p3.getX() - p.getX()) * (p1.getY() - p3.getY()) -
                (p1.getX() - p3.getX()) * (p3.getY() - p.getY());
        return ((d1 > 0 && d2 > 0 && d3 > 0) || (d1 < 0 && d2 < 0 && d3 < 0));
    }
    public boolean isContains(Triangle2D t){
        return isContains(t.p1) && isContains(t.p2) && isContains(t.p3);
    }

    public boolean overlaps(Triangle2D t)
    {
        MyPoint[] t1 = new MyPoint[] {p1, p2, p3};
        MyPoint[] t2 = new MyPoint[] {t.p1, t.p2, t.p3};

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                if (intersect(t1[i], t1[i+1], t2[j], t2[j+1]))
                    return true;
        return false;
    }


    private boolean intersect(MyPoint p1, MyPoint p2,
                              MyPoint p3, MyPoint p4)
    {
        int l1 = (int) ((p2.getY() - p1.getY()) / (p2.getX() -p1.getX()));
        int l2 = (int) ((p4.getY() - p3.getY()) / (p4.getX() - p3.getX()));

        return l1 != l2;
    }

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}
