//第四張練習題4-6.4-7
package Exam.Ex4.Ex4_6;

public class Ex4_6 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int num = (a++) - b; // -10
        System.out.println("num=" + num);

        a = 10;
        b = 20;
        int num1 = (-b) * a; // - 200
        System.out.println("num1=" + num1);

        a = 10;
        b = 20;
        int num2 = (a++) + (++b);// 31
        System.out.println("num2=" + num2);

        a = 10;
        b = 20;
        int num3 = (--a) + (b--);// 29
        System.out.println("num3=" + num3);

        a = 10;
        b = 20;
        int num4 = (a += a * (b++));// a+=a*(b++) = 10+10*20=210
        System.out.println("num4=" + num4);
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("----------------------------------------------------------------");
        a = 10;
        b = 5;
        System.out.println(b *= a); // 50 4-7(a)
        a = 10;
        b = 5;
        System.out.println(a/=b++); // 2 4-7(b)
        a = 10;
        b = 5;
        System.out.println(a/++b); //1  4-7(c)
        a = 10;
        b = 5;
        System.out.println(a%=--b); //2  4-7(d));
        a = 10;
        b = 5;
        System.out.print(b%=a++); //5  餘數正常沒辦法求到小數  4-7(e) 

    }
}
