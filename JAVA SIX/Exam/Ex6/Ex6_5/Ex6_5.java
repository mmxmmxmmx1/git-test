package Exam.Ex6.Ex6_5;

public class Ex6_5 {
    public static void main(String[] args) {
        int[] arr = { 32, 16, 34, 71 };
        double average = 0;
        int sum = 0;

        // 計算總和
        for (int num = 0; num < arr.length; num++) {
            sum = sum + arr[num];
        }

        // 計算平均值
        average = (double) sum / arr.length;

        // 輸出平均值，保留到小數點後兩位
        System.out.printf("陣列內的平均值是：%.2f", average);
    }
}
