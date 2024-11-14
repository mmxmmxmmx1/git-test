package test;

public class test11 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 9, 8, 7, 6 };

        // 印出陣列a和b的內容
        System.out.println("Original Array a,b:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        //System.out.println("Array b:");
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

        //System.out.println("After swapping, array b:");
        for (int num : b) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
