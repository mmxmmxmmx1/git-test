package Ch6.Ch6_2;

public class Ch6_2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = { 62, 7, 12, 3, 8, 47 };

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.printf("Average=%5.2f", (float) sum / a.length);
    }
}
