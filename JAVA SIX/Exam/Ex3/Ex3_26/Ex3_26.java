//第三章練習題3-26
package Exam.Ex3.Ex3_26;

import java.util.Scanner;

public class Ex3_26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入英文小寫字母:");
        char ch = scn.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            int sum = ch - 'a' + 1;
            System.out.print("\"" + ch + "是第" + sum + "個字母\"");
        } else {
            System.out.print("輸入的不是英文小寫字母");
            scn.close();
        }
    }
}
