//第五章 第十題 5-10 三角形
//三角形最短的兩個點相加是否有大於第三個點，就可判斷這三角型是否成立
package Exam.Ex5.Ex5_10;

import java.util.Scanner;

public class Ex5_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入三角形A邊長度: ");
        int a = scn.nextInt();
        System.out.print("請輸入三角形B邊長度: ");
        int b = scn.nextInt();
        System.out.print("請輸入三角形C邊長度: ");
        int c = scn.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("可以形成三角形:A角長:" + a +
                    "+B角長:" + b + "+C角長:" + c + "= " + (a + b + c));
        } else {
            System.out.println("無法形成三角形");
        }
        scn.close();
    }
}
