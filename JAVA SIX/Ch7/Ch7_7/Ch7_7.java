//Ch7_7傳回一維陣列的函數
package Ch7.Ch7_7;

public class Ch7_7 {
    public static void main(String[] args) {
        int[] a1 = { 18, 32, 65, 27, 30 }; // 宣告一維鎮列a1並設定初值
        int[] a2; // 宣告一維陣列a2
        a2 = add10(a1); // 呼叫add10()，並把傳回的值設給陣列a2
        for (int e : a2) { // 印出陣列的內容
            System.out.printf("%3d", e);
        }
    }

    public static int[] add10(int[] b1) {
        int[] b2 = new int[b1.length];
        for (int i = 0; i < b1.length; i++)
            b2[i] = b1[i] + 10;
        return b2;
    }
}
