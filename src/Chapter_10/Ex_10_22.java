package Chapter_10;

public class Ex_10_22 {
    public static void main(String[] args){
        char[] c = new char[] {'W','e','l','c','o','m','e','!'};
        char[] b = new char[] {'w','e','l','c','o','m','e','!'};
        char[] d = new char[] {'w','e','l','c','o','n','e','!'};
        MyString1 s = new MyString1(c);
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.substring(2, 5).getStr());
        System.out.println(s.toLowerCase().getStr());
        System.out.println(s.equals(new MyString1(b)));
        System.out.println(s.equals(new MyString1(d)));
        System.out.println(MyString1.valueOf(23324).getStr()); //don't work
    }
}
