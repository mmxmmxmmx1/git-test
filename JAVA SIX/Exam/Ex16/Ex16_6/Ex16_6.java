//Ex16.6 List介面
package Exam.Ex16.Ex16_6;

import java.util.*;

public class Ex16_6 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add((int) (Math.random() * 100));
        list.add((int) (Math.random() * 100));
        list.add((int) (Math.random() * 100));
        list.add((int) (Math.random() * 100));
        list.add((int) (Math.random() * 100));
        list.add(150);
        list.add(55);
        list.add(10);
        System.out.println("原始的list:" + list);
        list.set(5, 999);
        System.out.println("更換後的list:" + list);
        System.out.println("list第一個元素:" + list.getFirst() + " ， " + "list最後一個元素:" + list.getLast());
        System.out.println("印出索引值2~5:"+list.subList(2, 5));
    }
}
