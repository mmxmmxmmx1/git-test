package Exam.Ex16.Ex16_12;

import java.util.HashMap;
import java.util.Map;

public class Ex16_12 {
    public static void main(String[] args) {
        // (a) 建立一個 HashMap，將英文成績（Integer）作為鍵，姓名（String）作為值
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(95, "Ryan");
        hmap.put(83, "Fiona");
        hmap.put(89, "Jack");
        hmap.put(76, "Kevin");
        hmap.put(92, "Ariel");

        // 輸出 HashMap 中的所有元素
        System.out.println("所有成績與姓名:");
        for (Integer key : hmap.keySet()) {
            System.out.println("成績:" + key + "，姓名:" + hmap.get(key));
        }

        // (b) 計算 Ariel 與 Fiona 的英文成績平均值
        int arielScore = 0;
        int fionaScore = 0;

        // 遍歷 HashMap 以找到 Ariel 和 Fiona 的成績
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            if (entry.getValue().equals("Ariel")) {
                arielScore = entry.getKey();
            }
            if (entry.getValue().equals("Fiona")) {
                fionaScore = entry.getKey();
            }
        }

        // 計算平均值
        double averageScore = (arielScore + fionaScore) / 2.0;
        System.out.println("\nAriel與Fiona的英文平均值: " + averageScore);

        // (c) 計算 Kevin 與 Jack 的英文成績差距
        int kevinScore = 0;
        int jackScore = 0;

        // 遍歷 HashMap 以找到 Kevin 和 Jack 的成績
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            if (entry.getValue().equals("Kevin")) {
                kevinScore = entry.getKey();
            }
            if (entry.getValue().equals("Jack")) {
                jackScore = entry.getKey();
            }
        }

        // 計算成績差距的絕對值
        int scoreDifference = Math.abs(kevinScore - jackScore);
        System.out.println("Kevin與Jack的英文分數相差:" + scoreDifference + " 分");
    }
}
