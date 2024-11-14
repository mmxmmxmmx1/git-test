//Ex13_14
// 自訂例外類別，用於表示輸入的邊長無法構成三角形
package Exam.Ex13.Ex13_14;

class NotTriangleException extends Exception {
    public NotTriangleException(String message) {
        super(message);
    }
}

// 自訂例外類別，用於表示輸入的邊長構成正三角形
class EquilateralTriangleException extends Exception {
    public EquilateralTriangleException(String message) {
        super(message);
    }
}

// 自訂例外類別，用於表示輸入的邊長構成的不是正三角形
class NotEquilateralTriangleException extends Exception {
    public NotEquilateralTriangleException(String message) {
        super(message);
    }
}

public class Ex13_14 {

    // 判斷三角形類型的方法
    public static void triangle(int a, int b, int c)
            throws NotTriangleException, EquilateralTriangleException, NotEquilateralTriangleException {
        // 檢查是否構成三角形
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            // 若不能構成三角形，拋出 NotTriangleException
            throw new NotTriangleException("不構成三角形");
        } else if (a == b && b == c) {
            // 若為正三角形，拋出 EquilateralTriangleException
            throw new EquilateralTriangleException("這是正三角形");
        } else {
            // 若為其他三角形，拋出 NotEquilateralTriangleException
            throw new NotEquilateralTriangleException("這不是正三角形");
        }
    }

    // 主方法，測試三種不同的邊長組合
    public static void main(String[] args) {
        try {
            // 測試正三角形
            triangle(3, 3, 3);
            // 測試非正三角形
            // triangle(3, 4, 5);
            // 測試無法構成三角形
            triangle(1, 2, 3);
        } catch (Exception e) {
            // 捕捉並列印例外訊息
            // System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
