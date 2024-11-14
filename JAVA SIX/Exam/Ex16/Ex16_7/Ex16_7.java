// Ex16_7 List介面 ,LinkedList型態與ArrayList型態
package Exam.Ex16.Ex16_7;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex16_7 {
    public static void main(String[] args) {
        // 建立一個 LinkedList 物件，用於儲存字串類型的元素
        LinkedList<String> list = new LinkedList<>();
        // 向 LinkedList 中添加元素 "apple"
        list.add("apple");
        // 向 LinkedList 中添加元素 "guava"
        list.add("guava");
        // 印出 LinkedList 中的所有元素
        System.out.println("LinkedList元素有:" + list);
        // 建立一個 ArrayList 物件，用於儲存字串類型的元素
        ArrayList<String> alist = new ArrayList<>();
        // 向 ArrayList 中添加元素 "tomato"
        alist.add("tomato");
        // 向 ArrayList 中添加元素 "apple"
        alist.add("apple");
        // 向 ArrayList 中添加元素 "papaya"
        alist.add("papaya");
        // 向 ArrayList 中添加元素 "grape"
        alist.add("grape");
        // 印出 ArrayList 中的所有元素
        System.out.println("ArrayList元素有:" + alist);
        // 將 LinkedList 中的所有元素加入到 ArrayList 中
        alist.addAll(list);
        // 印出合併後的 ArrayList 中的所有元素
        System.out.println("將LinkedList加入ArrayList後:" + alist);
        // 找出 ArrayList 中第一個出現 "apple" 的索引值
        System.out.println("第一個apple出現的索引值是:" + alist.indexOf("apple"));
        // 找出 ArrayList 中最後一個出現 "apple" 的索引值
        System.out.println("最後一個apple出現的索引值是:" + alist.lastIndexOf("apple"));
    }
}
