package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入圓球的半徑
        System.out.print("請輸入圓球的半徑: ");
        double radius = scanner.nextDouble();

        // 計算圓球體積
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        // 輸出圓球體積
        System.out.println("圓球體積為: " + volume);

        // 關閉scanner物件
        scanner.close();
    }
}