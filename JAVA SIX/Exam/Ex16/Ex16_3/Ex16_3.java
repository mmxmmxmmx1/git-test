//Ex16_3 ,建立HaseSet h1跟TreeSet t1 
package Exam.Ex16.Ex16_3;

import java.util.*;

public class Ex16_3 {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<Integer>();
        h1.add(36);
        h1.add(15);
        TreeSet<Integer> t1 = new TreeSet<Integer>();
        t1.add(52);
        t1.add(23);
        t1.add(32);
        System.out.print(h1);
        System.out.println(t1);
        if (t1.contains(32)) {
            System.out.println("刪除數值32...");
            t1.remove(32);
            System.out.println(h1+""+t1);
        } else {
            System.out.println("找不到值為32的元素");
        }
System.out.println("t1是否包含h1內的所有元素="+t1.containsAll(h1));
    }
}
