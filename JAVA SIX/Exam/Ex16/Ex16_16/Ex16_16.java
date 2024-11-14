package Exam.Ex16.Ex16_16;

import java.util.ArrayList;   // 引入 ArrayList 類，用於創建動態數組
import java.util.Collections; // 引入 Collections 類，用於集合的相關操作

public class Ex16_16 {
    public static void main(String[] args) {
        // 建立 ArrayList 並添加一週中的七天名稱（字串）
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Sunday");    // 添加 "Sunday" 字串到 ArrayList 中
        alist.add("Monday");    // 添加 "Monday" 字串到 ArrayList 中
        alist.add("Tuesday");   // 添加 "Tuesday" 字串到 ArrayList 中
        alist.add("Wednesday"); // 添加 "Wednesday" 字串到 ArrayList 中
        alist.add("Thursday");  // 添加 "Thursday" 字串到 ArrayList 中
        alist.add("friday");    // 添加 "friday"（小寫的 "f"）字串到 ArrayList 中
        alist.add("Saturday");  // 添加 "Saturday" 字串到 ArrayList 中

        // 正向走訪 ArrayList 中的所有元素，並印出
        System.out.println("ArrayList 正向走訪元素:" + alist);

        // 使用 Collections.reverse() 反轉 ArrayList 中元素的順序
        Collections.reverse(alist);

        // 印出反向走訪後的 ArrayList 元素
        System.out.println("ArrayList 反向走訪元素:" + alist);
    }
}
