//Ex16_15 ,(a)請取出10個小於100的整數亂數，建立LinkedList型態的物件llist，
//然後印出llist內所有元素
//(b)以反向走訪的方式印出llist裡所有的元素，並計算所有元素和
package Exam.Ex16.Ex16_15;

import java.util.Collections; // 引入 Collections 類，用於操作集合
import java.util.LinkedList; // 引入 LinkedList 類，用於建立鏈結串列
import java.util.Random; // 引入 Random 類，用於生成隨機數

public class Ex16_15 {
    public static void main(String[] args) {
        // (a) 建立 LinkedList 型態的物件 llist 並加入 10 個隨機整數
        LinkedList<Integer> llist = new LinkedList<>();
        Random ran = new Random(); // 使用 Random 生成隨機數
        while (llist.size() < 10) { // 當 llist 的大小小於 10 時，繼續添加元素
            int num = ran.nextInt(100); // 生成 0 到 99 的整數亂數
            llist.add(num); // 將生成的整數添加到 LinkedList 中
        }
        // 印出 llist 中所有的元素
        System.out.println("LinkedList 內的所有元素有:" + llist);

        // (b) 使用 Collections.reverse() 反轉 LinkedList 的順序
        Collections.reverse(llist);

        // 以反向走訪的方式印出反轉後的 LinkedList 中所有的元素
        int sum = 0;
        for (int reverse : llist) { // 透過 for-each 迴圈遍歷反轉後的 llist
            sum += reverse;
            System.out.print(reverse + " "); // 印出每個元素，元素之間以空格分隔
        }
        System.out.println("\nllist內所有元素的和:" + sum); //元素數值總和
    }
}
