//Ch6_3,比較陣列元素值的大小
package Ch6.Ch6_3;

public class Ch6_3 {
    public static void main(String[] args) {
        int arr[] = { 17, 48, 30, 74, 62 };
        int max = arr[0];

        for (int i : arr) {
            if (i > max)
                max = i;
        }
        System.out.printf("Maximum is %d ", max);
    }
}
