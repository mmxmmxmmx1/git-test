//第六章 習題 6-21 陣列a.b 內容對調後印出內容
//自己參考網路寫出。
package Exam.Ex6.Ex6_21;

public class Ex6_21 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 9, 8, 7, 6 };
        System.out.print("陣列a,b內的原始數值: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int o = 0; o < b.length; o++) {
            System.out.print(b[o] + " ");
        }
        System.out.print("\n陣列a,b內容對調後的數值: ");
        for (int c = 0; c < a.length; c++) {

            a[c] = a[c] - b[c];                             //利用a陣列-b陣列之後再用b陣列+a陣列
            b[c] = a[c] + b[c];                             //將a陣列的數值+成b陣列的數值，讓b陣
            a[c] = GetAbsoluteValue(a[c] - b[c]);           //列的數值變成a陣列的數值。
            System.out.print(a[c] + " ");
        }
        for (int c = 0; c < b.length; c++) {
            a[c] = a[c] - b[c];
            b[c] = a[c] + b[c];
            b[c] = GetAbsoluteValue(b[c] - a[c]);
            System.out.print(b[c] + " ");
        }
    }

    public static int GetAbsoluteValue(int a) {
        return Math.abs(a);
    }
}