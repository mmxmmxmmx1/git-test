//第五章 第五題 5-5 判斷0-9與英文大小寫
package Exam.Ex5.Ex5_5;

import java.util.Scanner;

public class Ex5_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個0-9數字或一個英文字: ");
        String str = scn.nextLine();
        if (str.length() == 1) {
            char ch = str.charAt(0);
            if (ch >= '0' && ch <= '9') {
                System.out.println("此字元是一個數字: " + ch);
            } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                System.out.println("此字元是一個英文字母: " + ch);
            }else{
                System.out.println("此字元不是0-9的數字或是英文字母");
            }
            }else{
                System.out.println("請重新輸入正確的英文字母或數字");
            }
            scn.close();
        }
    }
