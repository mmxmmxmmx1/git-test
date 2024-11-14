//Ch16_6 ,  ArrayList範例
package Ch16.Ch16_6;

import java.util.*;

public class Ch16_6 {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<Integer>();

        for (int i = 10; i <= 50; i += 10) { // 增加元素
            alist.add(i);
        }
        alist.add(3, 200);
        alist.add(0, 300);
        alist.add(400); // 將400放在alist的最後一個位置

        System.out.println("元素個數:" + alist.size());
        System.err.println("ArrayList的元素：" + alist);
        System.err.println("將索引值1的元素以200取代...");
        alist.set(1, 200);
        System.err.println("ArrayList的元素：" + alist);
        System.err.print("第一個元素值為200的索引值=");
        System.err.println(alist.indexOf(200));
        System.err.print("最後一個元素值為200的索引值=");
        System.err.println(alist.lastIndexOf(200));

        int count = 0;
        for (Integer num : alist) {
            if (num.equals(200)) {
                count++;
            }
        }
        System.out.println("數字200出現次數:" + count);
    }
}
