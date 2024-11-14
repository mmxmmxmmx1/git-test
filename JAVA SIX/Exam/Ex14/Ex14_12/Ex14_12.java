//Ex14_12 
package Exam.Ex14.Ex14_12;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex14_12 {
    public static void main(String[] args) {
        Random random = new Random();

        // 使用 try-with-resources 確保 FileOutputStream 正確關閉
        try (FileOutputStream fo = new FileOutputStream("Exam/Ex14/Ex14_12/rand.txt")) {
            // 生成1000個隨機數並寫入文件
            for (int i = 0; i < 1000; i++) {
                int sum = random.nextInt(99999); // 隨機生成0到99998的整數
                fo.write((sum + "\n").getBytes()); // 將隨機數轉為字串並寫入文件
            }
        } catch (IOException e) {
            e.printStackTrace(); // 處理可能的 IOException
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        int total = 0, max = 0, min = Integer.MAX_VALUE;

        // 使用 try-with-resources 確保所有資源被正確關閉
        try (FileInputStream fi = new FileInputStream("Exam/Ex14/Ex14_12/rand.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fi));
                FileOutputStream fo1 = new FileOutputStream("Exam/Ex14/Ex14_12/rand2.txt")) {

            String line;
            // 讀取文件中的每一行，將其轉換為整數，並計算統計數據
            while ((line = br.readLine()) != null) {
                int currentnum = Integer.parseInt(line); // 將讀取的行轉換為整數
                numbers.add(currentnum); // 添加到數字列表中
                total += currentnum; // 累加總和
                if (currentnum > max) {
                    max = currentnum; // 更新最大值
                }
                if (currentnum < min) {
                    min = currentnum; // 更新最小值
                }
            }

            // 對數字進行排序
            Collections.sort(numbers);

            // 將排序後的數字寫入新文件
            for (int num : numbers) {
                fo1.write((num + "\n").getBytes()); // 寫入每個數字及換行符
            }

        } catch (IOException e) {
            e.printStackTrace(); // 處理可能的 IOException
        }

        // 輸出統計結果
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
        System.out.println("平均值: " + total / 1000); // 計算並輸出平均值
    }
}
