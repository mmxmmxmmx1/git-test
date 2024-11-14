//第七章 習題 7-1 用greeting() 印出對應的Hello Java!
package Exam.Ex7.Ex7_1;

public class Ex7_1 {
    public static void main(String[] args) {
        greeting(4);
    }

    public static void greeting(int k) {
        for (int i = 0; i < k; i++) {
            System.out.println("Hello Java!");
        }
    }
}