package Ch3;

import java.util.Scanner; //載入Scanner 類別

public class Ch3_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 宣告Scanner 類別的物件

        System.out.print("What's your name? ");
        String name = scn.next(); // 輸入姓名字串
        System.out.print("How old are you? ");
        int age = scn.nextInt(); // 輸入年齡
        System.out.printf("your name is " + name + " , " + age + " years old. ");
        scn.close();

    }
}
