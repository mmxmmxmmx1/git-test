//Ex16_5 增加字串且找出小於Speech的字串元素
package Exam.Ex16.Ex16_5;

import java.util.TreeSet;

public class Ex16_5 {
    public static void main(String[] args) {
        TreeSet<String> test = new TreeSet<>();
        test.add("Speech is silver, silence is golden.");
        test.add("Two heads are better than one.");
        test.add("East or west, home is best.");
        test.add("It is never too late to learn.");
        System.out.println("所有元素內容=" + test);
        System.out.println("第一個元素=" + test.first());
        System.out.println("最後一個元素=" + test.last());
        System.out.println("元素中小於字串\"Speech的元素=\"" + test.headSet("Speech"));
    }
}
