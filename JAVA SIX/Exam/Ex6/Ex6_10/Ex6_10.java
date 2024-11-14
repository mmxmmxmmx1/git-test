//第六章 練習 6-10 陣列chr內的小寫字轉換成大寫
//自己的寫法，但這寫法會連[] , 一併顯示出來，如果要不顯是可以看Ex6_10_1.java
package Exam.Ex6.Ex6_10;

import java.util.Arrays;

public class Ex6_10 {
    public static void main(String[] args) {
        char ch[] = { 'H', 'e', 'l', 'l', 'o' };
        String arrtoStr = Arrays.toString(ch);
        String up = arrtoStr.toUpperCase();
        char[] arr = up.toCharArray();
        System.out.println(arr);
    }
}
