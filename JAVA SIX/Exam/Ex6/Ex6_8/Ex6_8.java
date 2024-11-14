package Exam.Ex6.Ex6_8;

public class Ex6_8 {
    public static void main(String[] args) {
        int[] arr = { 12, 43, 56, 77 };
        int[] ind = { 2, 0, 1, 3 };
        int[] sort = new int[arr.length];

        for (int i = 0; i < ind.length; i++) {
            sort[i] = arr[ind[i]];
        }
        for (int end = 0; end < arr.length; end++) {
            System.out.print(sort[end] + " ");

        }
    }
}
