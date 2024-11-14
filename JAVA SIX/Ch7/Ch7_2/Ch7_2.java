//Ch7_2 1+2+....end
package Ch7.Ch7_2;

public class Ch7_2 {

    public static void main(String[] args) {
        double avg = average(4); // 呼叫average()函數
        System.out.printf("avg=%6.2f\n", avg);
    }

    public static double average(int end) { 
        int sum = 0;
        double avg;
        for (int i = 1; i <= end; i++) {
            sum += i;
        }
        avg = (double) sum / end;
        return avg;
    }
}
