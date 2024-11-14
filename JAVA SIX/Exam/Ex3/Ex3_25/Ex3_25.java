//第三章練習題3-25
package Exam.Ex3.Ex3_25;

import java.util.Scanner;

public class Ex3_25 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入1200:"); // 鍵盤輸入1200
        int num = scn.nextInt();
        System.out.print("輸入2100:"); // 鍵盤輸入2100
        int num1 = scn.nextInt();
        System.out.println(num + num1);

        scn.close();
    }
}
