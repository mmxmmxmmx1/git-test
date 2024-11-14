//第五章 練習題27 5-27   0-100中找出可被2.3整除且不能被12整除的整數
package Exam.Ex5.Ex5_27;

public class Ex5_27 {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            if (num % 2 == 0 && num % 3 == 0 && num % 12 != 0) {
                System.out.println(num);
                continue;
            }
        }
    }
}
