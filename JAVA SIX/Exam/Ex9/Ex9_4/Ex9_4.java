//第九章 習題 9-4 Caaa
package Exam.Ex9.Ex9_4;

class MinMax {
    private int[] arr;

    MinMax(int[] a) {
        arr = a;
    }

    public void find_min_max() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int a = 0; a < arr.length; a++) {
            if (min > arr[a]) {
                min = arr[a];
            }
            if (max < arr[a]) {
                max = arr[a];
            }
        }
        System.out.println("min=" + min + "  max=" + max);
    }
}

public class Ex9_4 {
    public static void main(String[] args) {
        int[] a = { 12, 54, 23, 17, 90 };
        MinMax obj = new MinMax(a);
        obj.find_min_max();
    }
}
