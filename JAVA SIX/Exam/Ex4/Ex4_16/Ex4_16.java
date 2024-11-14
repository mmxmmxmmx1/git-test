//第四章 練習題 4-16
package Exam.Ex4.Ex4_16;

public class Ex4_16 {
    public static void main(String[] args) {
        int ten = (50 - 23) / 10;
        int five = (50 - 23) % 10 / 5;
        int one = (50 - 23) % 10 % 5;
        System.out.printf("老闆要找\n%d個:10元硬幣\n%d個:5元硬幣\n%d個:1元硬幣",
                ten, five, one);

    }
}

