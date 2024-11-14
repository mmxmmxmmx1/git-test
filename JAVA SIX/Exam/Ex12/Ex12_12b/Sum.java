//Ex12_12b , Sum 類別
package Exam.Ex12.Ex12_12b;

public class Sum {
    private int sum = 0;

    public int add(int n) {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}