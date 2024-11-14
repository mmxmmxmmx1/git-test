// Ex16_10 實作Map介面
package Exam.Ex16.Ex16_10;

import java.util.Random;    // 匯入 Random 類別，用於生成隨機數
import java.util.TreeMap;   // 匯入 TreeMap 類別，用於儲存有序的鍵值對

public class Ex16_10 {
    public static void main(String[] args) {
        // 建立一個隨機數生成器，用於產生隨機值
        Random ren = new Random();

        // 初始化變數 key 用於迴圈控制，sum 用於累加所有值
        int key = 0;
        int sum = 0;

        // 建立一個 TreeMap，鍵和值均為整數類型
        // TreeMap 會根據鍵的自然順序（升序）自動排序
        TreeMap<Integer, Integer> tmap = new TreeMap<>();

        // 使用 for 迴圈從 1 到 5 產生鍵值對
        for (key = 1; key <= 5; key++) {
            // 產生一個 0 到 99 的隨機整數
            int randomvalue = ren.nextInt(100);

            // 將鍵和值加入到 TreeMap 中
            tmap.put(key, randomvalue);
        }

        // 輸出整個 TreeMap 的內容
        // 例如：{1=45, 2=67, 3=23, 4=89, 5=10}
        System.out.println("tmap 內容: " + tmap);

        // 遍歷 TreeMap 中的所有值，並計算總和
        for (int value : tmap.values()) {
            sum += value; // 將每個值加到 sum 中
        }

        // 計算總和除以最後一個鍵的值（即最大的鍵，這裡是 5）
        // 注意：這裡使用的是整數除法，結果將是整數
        // 如果需要小數結果，應將其中一個操作數轉換為 double
        double average = (double) sum / tmap.lastKey();

        // 輸出總和
        System.out.println("tmap全部數值加總 = " + sum);

        // 使用 printf 格式化輸出，顯示平均值到小數點下兩位
        System.out.printf("平均值 = %.2f\n", average);
    }
}
