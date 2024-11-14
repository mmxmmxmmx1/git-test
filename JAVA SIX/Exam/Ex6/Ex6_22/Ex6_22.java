//第六章 習題 6-22 a陣列拷貝相同內容給b陣列，並將a[0]內的元素改成100，這時a[0]=100;b[0]要是14
package Exam.Ex6.Ex6_22;

public class Ex6_22 {
    public static void main(String[] args) {
        int[] a = { 14, 36, 31, 61, 65 };
        int[] b = new int[a.length]; // 創建一個與a長度相同的新陣列b

        // 使用System.arraycopy方法將a的內容拷貝給b
        System.arraycopy(a, 0, b, 0, a.length);

        // 修改a[0]的值為100
        a[0] = 100;

        // 列印出陣列a和b的內容
        System.out.println("陣列a的內容: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("陣列b的內容: ");
        for (int num : b) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
