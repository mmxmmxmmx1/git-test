//第七章 習題 7-5 溫度轉換
package Exam.Ex7.Ex7_5;

public class Ex7_5 {
    public static void main(String[] args) {
        double c = fahrenheit(5);
        System.out.print("華氏溫度: " + c);
    }

    public static double fahrenheit(double i) {
        return (i * ((double) 9 / 5)) + 32;

    }
}
