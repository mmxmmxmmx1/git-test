//Ch16_9_1, 用HashSet做一個跟Ch16_9一樣的for-each loop
package Ch16.Ch16_9;

import java.util.*;

public class Ch16_9_1 {
    public static void main(String[] args) {

        HashSet<String> Hset = new HashSet<String>();
        Hset.add("Monkey");
        Hset.add("Bunny");
        Hset.add("Puppy");
        Hset.add("Kitty");

        System.out.print("HashSet內容: ");
        for (String i : Hset) {
            System.out.print(i + ".");
        }
    }
}
