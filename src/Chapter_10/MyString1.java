package Chapter_10;

public class MyString1 {
    char[] str;
    public MyString1(char[] chars){
        this.str = chars;
    }
    public char charAt(int index){
        return str[index];
    }
    public int length(){
        return str.length;
    }
    public MyString1 substring(int begin, int end){
        char[] subStr = new char[end - begin];
        if (end - begin >= 0) System.arraycopy(str, begin, subStr, 0, end - begin);
        return new MyString1(subStr);
    }
    public MyString1 toLowerCase(){
        for (int i = 0; i < str.length;i++)
            if (str[i] > 64 && str[i] < 91)
                str[i] += 32;
        return this;

    }
    public boolean equals(MyString1 s){
        if (s.length() != str.length)
            return false;
        for (int i = 0; i < str.length; i++) {
            if(s.str[i] != str[i])
                return false;
        }
        return true;

    }
    public static MyString1 valueOf(int i){
        int length = 0;
        int num = i;
        for (; Math.abs(num) > 0; i /= 10) {
            length++;
        }
        int index = 0;
        char[] chars = new char[length];
        for (;Math.abs(i) > 0; i /= 10) {
            int n = i % 10;
            chars[index++] = (char)(n + 48);
        }
        return new MyString1(chars);
    }

    public char[] getStr() {
        return str;
    }
}
