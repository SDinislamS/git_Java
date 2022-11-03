package Chapter_4;


public class GenerateVehiclePlateNumbers {
    public static void main(String[] args){
        double a1 = 65 + Math.random() * 25;
        char ch1 = (char)a1;
        double a2 = 65 + Math.random() * 25;
        char ch2 = (char)a2;
        double a3 = 65 + Math.random() * 25;
        char ch3 = (char)a3;
        int num = (int)(1000 + Math.random() * 8999);
        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);
        System.out.print(num);
    }
}
