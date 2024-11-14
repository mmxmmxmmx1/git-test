//Ex16_13 , 取出10個小於100的整數亂數 ,建立ArryList物件alist,利用for-ech走訪集合,將集合元素印出
package Exam.Ex16.Ex16_13;

import java.util.ArrayList; // 引入ArrayList類別，用於創建列表
import java.util.Random;    // 引入Random類別，用於生成隨機數

public class Ex16_13 {
    public static void main(String[] args) {
        // 建立一個ArrayList物件，用來儲存整數
        ArrayList<Integer> alist = new ArrayList<>();
        
        // 建立一個Random物件，用於生成隨機數
        Random ran = new Random();
        
        // 透過for迴圈生成9個隨機整數，範圍在0到99之間（不包含100），並將其加入列表中
        for (int i = 0; i < 9; i++) {
            int random = ran.nextInt(100); // 生成小於100的隨機整數
            alist.add(random);             // 將隨機數加入到列表alist中
        }

        // 輸出提示訊息
        System.out.print("10個小於100的整數數值為:");
        
        // 使用for-each迴圈走訪集合並印出每個元素
        for (int num : alist) {
            System.out.print(num + " "); // 印出每個整數，並以空格隔開
        }
    }
}