// Ex16_14 ，請取出10個小於100的整數亂數，建立TreeSet型態的物件tset，
//並利用for-each迴圈走訪集合，將集合元素印出，然後計算所有元素的平均值
package Exam.Ex16.Ex16_14;

import java.util.Random; // 引入 Random 類，用於生成隨機數
import java.util.TreeSet; // 引入 TreeSet 類，用於存儲唯一且有序的元素

public class Ex16_14 {
    public static void main(String[] args) {
        // 創建一個 TreeSet 來存儲整數，並自動排序
        TreeSet<Integer> tset = new TreeSet<>();

        // 創建一個 Random 對象，用於生成隨機數
        Random ran = new Random();

        // 持續生成隨機整數，直到 TreeSet 中有10個不重複的數字
        while (tset.size() < 10) {
            int random = ran.nextInt(101); // 生成 0 到 100 的隨機數
            tset.add(random); // 將隨機數添加到 TreeSet 中（重複的數字會被自動忽略）
            // 注意：ran.nextInt(101) 會生成 0 到 100（包含100）的數字。如果您需要生成小於100的數字，請使用
            // ran.nextInt(100)
        }

        int sum = 0; // 初始化總和變數，用於計算所有元素的總和

        // 打印 TreeSet 中的所有元素
        System.out.print("TreeSet內所有的元素有: ");
        for (int num : tset) { // 使用 for-each 迴圈遍歷 TreeSet 中的每個元素
            sum += num; // 將當前元素加到總和中
            System.out.print(num + " "); // 打印當前元素，元素之間以空格分隔
        }

        // 計算元素的平均值，確保執行浮點除法以保留小數部分
        double average = (double) sum / tset.size(); // 將 sum 轉換為 double 類型後再除以集合的大小

        // 打印所有元素的平均值，格式化為保留兩位小數
        System.out.printf("\n所有元素的平均值: %.2f ", average); // 使用 printf 進行格式化輸出
    }
}