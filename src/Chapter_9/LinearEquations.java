package Chapter_9;

public class LinearEquations {
    private double a,b,c,d,e,f;
    public LinearEquations(double newA,double newB,double newC,double newD,double newE,double newF){
        a=newA;
        b=newB;
        c=newC;
        d=newD;
        e=newE;
        f=newF;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable(){
        return a*d-b*c!=0;
    }
    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
}
