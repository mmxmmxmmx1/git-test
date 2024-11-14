//Ex16_4 , 建立HashSet hset跟TreeSet test,並合併HashSet元素到TreeSet內,
//再計算第一個元素與最後一個元素的平均值
package Exam.Ex16.Ex16_4;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex16_4 {
    public static void main(String[] args) {
        // 建立一個 HashSet<Integer> 物件 hset
        HashSet<Integer> hset = new HashSet<Integer>();
        // 向 hset 中添加元素
        hset.add(65);
        hset.add(29);
        hset.add(18);
        hset.add(34);
        // 輸出 hset 內的元素
        System.out.println("hset內元素有=" + hset);
        
        // 建立一個 TreeSet<Integer> 物件 test
        TreeSet<Integer> test = new TreeSet<Integer>();
        // 向 test 中添加元素
        test.add(97);
        test.add(62);
        test.add(53);
        // 輸出 test 內的元素
        System.out.println("test內元素有=" + test);
        
        // 將 hset 中的所有元素添加到 test 中
        test.addAll(hset);
        // 輸出合併後的 test 內的元素
        System.out.println("合併後內容有=" + test);
        
        // 計算第一個元素與最後一個元素的平均值
        // 注意：TreeSet 使用 first() 和 last() 方法，而非 getFirst() 和 getLast()
        System.out.println("第一個元素與最後一個元素的平均值="
                + (test.first() + test.last()) / 2);
    }
}
