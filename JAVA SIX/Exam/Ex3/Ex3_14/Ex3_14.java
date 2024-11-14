//第三章 練習題 3-14.15.16.17
package Exam.Ex3.Ex3_14;

public class Ex3_14 {
    public static void main(String[] args) {
        int ch = 66; // unicode碼
        char ch1 = '\u0042'; // 16位元碼
        char ch2 = 100;
        char ch3 = 0x03B8;
        char ch4 = 0x03c0;
        System.out.printf("%c , %c\n", ch, ch1);
        System.out.println(ch2);
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println("\"明天下雨機率為75%\"");

    }
}

// unicode 100=阿拉伯字母的d