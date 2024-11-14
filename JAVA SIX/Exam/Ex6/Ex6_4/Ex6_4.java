//第六章 習題6-4 arr內的個數跟介於3~6之間的元素共有幾個
package Exam.Ex6.Ex6_4;

public class Ex6_4 {
    public static void main(String[] args) {
        int a = 0;
        int total = 0;
        int arr[] = { 3, 5, 0, 3, 2, 4, 1, 6, 8, 5, 4, 3, 2 };
        int sum = arr.length;
        System.out.println("arr內的元素有: " + sum + " 個");
        for (a = 0; a < arr.length; a++) {
            if (arr[a] >= 3 && arr[a] <= 6) {
                total++;
            }
        }
        System.out.print("arr內介於3~6之間的有: " + total+" 個");
    }
}