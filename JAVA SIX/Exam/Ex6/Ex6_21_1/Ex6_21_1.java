//第六章 習題 6-21 陣列a.b 內容對調後印出內容 chatgpt解法
package Exam.Ex6.Ex6_21_1;

public class Ex6_21_1 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 9, 8, 7, 6 };

        // 印出陣列a和b的內容
        System.out.println("Original Array a,b:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : b) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 將陣列a和b的內容對調
        int[] temp = a;
        a = b;
        b = temp;

        // 印出對調後的陣列a和b的內容
        System.out.println("After swapping, array a,b:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int num : b) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
