//第五章 練習題20題 5-20 判斷幾位數的整數
package Exam.Ex5.Ex5_20;

import java.util.Scanner;

public class Ex5_20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入一個整數: ");
        int num = scn.nextInt();
        int count = 0;
        int total = Math.abs(num);
        if (total == 0) {
            count = 1;
        }
        while (total != 0) {
            total =  total / 10;
            count++;
        }
        System.out.print(num + "是一個" + count + "位數的整數");
        scn.close();
    }
}
