package test;

public class test2 {
    public static void main(String[] args) {
        char ch = 'A';
        short s = 12;
        float f = 12.4f;
        int i = 15;
        double d = 13.62;
        System.out.println(s + (f / s) + (ch * i));
        System.out.println(ch + d / (s - i) * f);
        System.out.println((s + d / ch * (d + i)));
        System.out.println(s + f * s + ch);
    }
}
