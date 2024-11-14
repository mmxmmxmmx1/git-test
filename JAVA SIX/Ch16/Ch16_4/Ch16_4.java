package Ch16.Ch16_4;

import java.util.TreeSet;

public class Ch16_4 {
    public static void main(String[] args) {
        TreeSet<Integer> test = new TreeSet<Integer>();

        for (int i = 20; i >= 2; i -= 2) { // 增加元素
            test.add(i);
        }
        System.out.println("元素個數＝" + test.size());
        System.out.println("元素內容=" + test); // 顯示集合物件的內容
        System.out.println("第一個元素=" + test.first());
        System.out.println("最後一個元素=" + test.last());
        System.out.println("介於6和14之間的集合=" + test.subSet(6, 14));
        System.out.println("大於等於10的集合=" + test.tailSet(10));
        System.out.println("小於8的集合=" + test.headSet(8));
    }
}
