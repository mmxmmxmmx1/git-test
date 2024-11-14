//第五章 第八題 5-8 輸入數字看是否能被5和6同時整除
package Exam.Ex5.Ex5_8;

import java.util.Scanner;

public class Ex5_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入一組數字:"); // 輸入一組數字
        int sum = scn.nextInt();
        if (sum % 5 == 0 && sum % 6 == 0) {
            System.out.println(sum + " :可被5 和 6同時整除 ");
        } else {
            System.out.println(sum + "無法被5 和 6同時整除 ");
        }
        scn.close();
    }
}
