//第六章 習題 6-11 每日跟時段平均溫度  chatgpt的解法
package Exam.Ex6.Ex6_11_1;

public class Ex6_11_1 {
    public static void main(String[] args) {
        float[][] temp = {
                { 18.2f, 17.3f, 15.0f, 13.4f },
                { 23.8f, 25.1f, 20.6f, 17.8f },
                { 20.6f, 21.5f, 18.4f, 15.7f }
        };

        // (a) 印出陣列temp的內容
        System.out.println("陣列 temp 的內容:");
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println(); // 換行印出下一行
        }

        // (b) 每日的平均溫度
        System.out.println("\n每日的平均溫度:");
        for (int i = 0; i < temp.length; i++) {
            float sum = 0;
            for (int j = 0; j < temp[i].length; j++) {
                sum += temp[i][j];
            }
            System.out.println("第 " + (i + 1) + " 日的平均溫度為: " + (sum / temp[i].length));
        }

        // (c) 時段一、時段二、時段三的平均溫度
        System.out.println("\n各時段的平均溫度:");
        for (int j = 0; j < temp[0].length; j++) {
            float sum = 0;
            for (int i = 0; i < temp.length; i++) {
                sum += temp[i][j];
            }
            System.out.printf("時段 %d 的平均溫度為: %.2f\n", (j + 1), (sum / temp.length));
        }

        // (d) 溫度最高的日子與時段
        float maxTemp = Float.MIN_VALUE;
        int maxDay = 0;
        int maxPeriod = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (temp[i][j] > maxTemp) {
                    maxTemp = temp[i][j];
                    maxDay = i;
                    maxPeriod = j;
                }
            }
        }
        System.out.println("\n溫度最高的日子為第 " + (maxDay + 1) + " 日，時段為 " + (maxPeriod + 1));

        // (e) 溫度最低的日子與時段
        float minTemp = Float.MAX_VALUE;
        int minDay = 0;
        int minPeriod = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                if (temp[i][j] < minTemp) {
                    minTemp = temp[i][j];
                    minDay = i;
                    minPeriod = j;
                }
            }
        }
        System.out.println("溫度最低的日子為第 " + (minDay + 1) + " 日，時段為 " + (minPeriod + 1));
    }
}