//第五章 練習題24(a) 5-24(a) 列印*跟^
package Exam.Ex5.Ex5_24;

public class Ex5_24 {

    public static void main(String[] args) {
        int lines = 5; // 總共需要列印的行數

        for (int row = 0; row < lines; row++) {
            // 列印前導插入符號
            for (int space = 0; space < row; space++) {
                System.out.print("^");
            }
            // 列印星號
            for (int star = 0; star < lines - row; star++) {
                System.out.print("*");
            }
            // 每列印完一行之後換行
            System.out.println();
        }
    }
}
