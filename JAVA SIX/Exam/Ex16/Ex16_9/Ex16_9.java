// Ex16_9 實作Map介面
package Exam.Ex16.Ex16_9;

import java.util.HashMap;   // 匯入 HashMap 類別
import java.util.HashSet;   // 匯入 HashSet 類別
import java.util.TreeSet;   // 匯入 TreeSet 類別

public class Ex16_9 {
    public static void main(String[] args) {
        // 建立一個 HashMap 物件，鍵與值皆為 Integer 類型
        HashMap<Integer, Integer> hmap = new HashMap<>();

        // 使用 for 迴圈生成 5 組鍵值對，鍵為 0 到 4，值為 0 到 100 之間的隨機整數
        for (int i = 0; i < 5; i++) {
            // 生成 0 到 100（包含 100）的隨機整數
            int num = (int) (Math.random() * 101);
            // 將鍵值對放入 HashMap 中
            hmap.put(i, num);
        }

        // 印出整個 HashMap 的內容
        System.out.println("完整的 HashMap 內容: " + hmap);

        // 使用 TreeSet 來儲存 HashMap 中所有的對應值，並自動排序
        TreeSet<Integer> tSet = new TreeSet<Integer>(hmap.values());

        // 使用 HashSet 來儲存 HashMap 中所有的關鍵值（鍵）
        HashSet<Integer> hSet = new HashSet<>(hmap.keySet());

        // 印出所有對應值（鍵值對）
        System.out.println("所有對應值 (鍵值對): " + hmap);

        // 印出所有關鍵值（鍵）
        System.out.println("關鍵值 (鍵): " + hSet);

        // 印出所有對應值，並以排序後的方式顯示
        System.out.println("對應值 (排序後): " + tSet);
    }
}
