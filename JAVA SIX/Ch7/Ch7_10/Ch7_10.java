//Ch7_10，函數的多載-引數型別不同
package Ch7.Ch7_10;

public class Ch7_10 {
    public static void main(String[] args) {
        int a = 5, b[] = { 1, 2, 3, 4 };
        show(a);
        show(b);
    }

    public static void show(int i) {
        System.out.println("value= " + i);
    }

    public static void show(int arr[]) {
        System.out.print("array=");
        for (int i = 0; i < arr.length; i++)
            System.out.printf("%2d", arr[i]);
        System.out.println();
    }
}
