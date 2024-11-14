package Ch16.Ch16_8;

import java.util.*;

public class Ch16_8_mod {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();

        tmap.put(94001, "Fiona");
        tmap.put(94003, "Ariel");
        tmap.put(94002, "Ryan");
        tmap.put(94004, "Jack");

        System.out.println("元素個數=" + tmap.size());
        System.out.println("TreeMap元素=" + tmap);

        // 直接使用 firstKey() 和 lastKey() 而不需要存入變數
        System.out.println("第0個元素: " + tmap.firstKey() + ", " + tmap.get(tmap.firstKey()));
        System.out.println("最後一個元素：" + tmap.lastKey() + ", " + tmap.get(tmap.lastKey()));

        // 直接在方法中使用 k1 和 k2
        System.out.println("介於94001和94003之間的TreeMap=" + tmap.subMap(94001, 94003));
        System.out.println("大於等於94003的TreeMap=" + tmap.tailMap(94003));
    }
}
