package Ch16.Ch16_5;

import java.util.*;

public class Ch16_5 {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<Integer>();

        for (int i = 10; i <= 30; i += 10)
            llist.addFirst(100);
        llist.addLast(200);
        llist.addFirst(300);

        System.out.println("元素個數=" + llist.size());
        System.out.print("LinkedList的元素:");

        for (int i = 0; i < llist.size(); i++)
            System.out.print(llist.get(i) + " ");
        System.out.print("\n刪除最後一個元素");
        System.out.println(llist.removeLast() + "...");

        System.out.println("第一個元素=" + llist.getFirst());
        System.out.println("最後一個元素=" + llist.getLast());
        System.out.println("元素值200的索引值=" + llist.indexOf(200));
    }
}
