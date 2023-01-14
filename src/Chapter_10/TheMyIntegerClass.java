package Chapter_10;


public class TheMyIntegerClass {
    public static void main(String[] args){
        MyInteger a = new MyInteger(119);
        System.out.println("Is odd? " + a.isOdd());
        System.out.println("Is even? " + a.isEven());
        System.out.println("Is prime? " + a.isPrime());

        System.out.println("Is odd? " + MyInteger.isOdd(7));
        System.out.println("Is even? " + MyInteger.isEven(7));
        System.out.println("Is prime? " + MyInteger.isPrime(7));

        System.out.println("Is odd? " + MyInteger.isOdd(a));
        System.out.println("Is even? " + MyInteger.isEven(a));
        System.out.println("Is prime? " + MyInteger.isPrime(a));

    }
}

class MyInteger {
    private int value;
    MyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public boolean isOdd(){
        return value % 2 == 1;
    }
    public boolean isEven(){
        return value % 2 == 0;
    }
    public boolean isPrime(){
        for (int i = 2; i < value; i++) {
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isOdd(int value){
        return value % 2 == 1;
    }
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static boolean isPrime(int value){
        for (int i = 2; i < value; i++) {
            if(value % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isOdd(MyInteger value){
        return value.getValue() % 2 == 1;
    }
    public static boolean isEven(MyInteger value){
        return value.getValue() % 2 == 0;
    }
    public static boolean isPrime(MyInteger value){
        for (int i = 2; i < value.getValue(); i++) {
            if(value.getValue() % i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean isEquals(int num){
        return num == value;
    }
    public boolean isEquals(MyInteger num){
        return num.getValue() == value;
    }
    public static int parseInt(char[] arr){
        return Integer.parseInt(new String(arr));
    }
    public static int parseInt(String arr){
        return Integer.parseInt(arr);
    }



}
// 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