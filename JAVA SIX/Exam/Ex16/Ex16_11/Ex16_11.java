//Ex16_11 實作Map介面 ,(a)5個介於0~100的整數亂數關鍵值,0~4做對應值 ,並將它們加入TreeMap性泰的tmap物件中
//(b)仿照Map介面的keySet()函數, 將tmap關鍵值轉換成HashSet物件hset
//(c)印出tmap與hset的所有物件
package Exam.Ex16.Ex16_11;

// 引入所需的類別
import java.util.HashSet;
import java.util.Random;
import java.util.TreeMap;

public class Ex16_11 {
    public static void main(String[] args) {
        // 創建一個隨機數生成器
        Random ren = new Random();

        // 創建一個 TreeMap 物件，鍵和值均為整數類型
        TreeMap<Integer, Integer> tmap = new TreeMap<>();

        // (a) 生成5個介於0到100之間的隨機整數作為鍵，並將0到4作為對應的值
        // 注意：迴圈應該執行5次，從0到4
        for (int key = 0; key <= 4; key++) {
            // 生成一個0到100之間的隨機整數
            int randomKey = ren.nextInt(101); // 0到100包括100
            // 將隨機鍵與對應的值放入 TreeMap 中
            tmap.put(randomKey, key);
        }

        // (b) 模仿 Map 介面的 keySet() 方法，將 tmap 的所有鍵轉換成 HashSet 物件
        HashSet<Integer> hset = new HashSet<Integer>(tmap.keySet());

        // (c) 印出 tmap 內所有的鍵值對
        System.out.println("印出 tmap 內所有物件: " + tmap);

        // 印出 hset 內所有的鍵
        System.out.println("印出 hset 內所有物件: " + hset);
    }
}
