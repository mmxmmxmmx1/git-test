//第五章 習題13 5-13 1-100可被16整除的數
package Exam.Ex5.Ex5_13;

public class Ex5_13 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 16 == 0) {
                System.out.println(i + "可以被16整除");
            }
        }
    }
}
