package test;

public class Ch6_2 {
    public static void main(String[] args) {
        int[] a = { 33, 34, 41, 38, 93, 101, 77 };
        int max = a[0];
        for (int i : a) {
            if (i > max)
                max = i;
        }
        System.out.print("最大值= " + max);
    }
}