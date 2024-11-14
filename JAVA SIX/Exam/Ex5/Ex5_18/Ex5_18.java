package Exam.Ex5.Ex5_18;

public class Ex5_18 {
    public static void main(String[] args) {
        int sum = 0, sum1 = 0;
        for (int a = 1; a <= 49; a = a + 2) {
            sum = sum + a * a;
        }
        for (int b = 2; b <= 50; b = b + 2) {
            sum1 = sum1 + b * b;
        }
        int total = sum - sum1;
        System.out.println("1-50次方相加減後的值: " + (total));
    }
}