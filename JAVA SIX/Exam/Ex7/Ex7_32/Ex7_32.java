//第七章 習題 7-32 函數的圓面積計算，整數與浮點運算的差異
package Exam.Ex7.Ex7_32;

public class Ex7_32 {
    public static int area(int r) {
        // 計算面積並返回整數部分
        return (int) (3.14 * r * r);
    }

    // 方法多載 2: 接受 double 型別的 r
    public static double area(double r) {
        // 計算面積並返回 double 型別的結果
        return 3.14 * r * r;
    }

    public static void main(String[] args) {
        // 測試 area 方法
        System.out.println("整數的圓面積" + area(2)); // 應該輸出 12
        System.out.printf("浮點運算的圓面積%.2f", area(2.3)); // 應該輸出 16.61
    }
}
