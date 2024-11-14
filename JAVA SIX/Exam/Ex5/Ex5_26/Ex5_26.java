//第五章 練習題26 6-26 繩子3500公尺，每天剪一半，多少天後會低於3公尺
package Exam.Ex5.Ex5_26;

public class Ex5_26 {
    public static void main(String[] args) {
        int m = 3500;
        int day = 0;
        while (true) {
            m = m / 2;
            day++;
            if (m < 3) {
                break;
            }
        }
        System.out.println("繩子切到剩下3公尺以下需要 " + day + " 天");
    }
}
