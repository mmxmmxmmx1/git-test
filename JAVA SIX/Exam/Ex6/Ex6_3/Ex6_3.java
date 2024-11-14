//第六章練習題6-2 
package Exam.Ex6.Ex6_3;

public class Ex6_3 {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 = 0;
        int a, b, max = 0;
        int max1 = 0;
        int[] arr = { 53, 27, 69, 12, 3, 96 };
        System.out.print("arr所有元素值: ");
        for (a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
        for (b = 0; b < arr.length; b++) {
            if (max < arr[b] && arr[b] % 2 != 0) {
                max = arr[b];
                sum++;
            }
            if (max1 < arr[b] && arr[b] % 2 == 0) {
                max1 = arr[b];
                sum1++;
            }
        }
        System.out.print("\narr中奇數的最大值為: " + max);
        System.out.print("\narr中偶數的最大值為: " + max1);
        System.out.print("\narr中的奇數有:" + sum1 + " 個" + "，arr中的偶數有:" + sum + " 個");
    }
}