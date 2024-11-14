//第六章 習題 6-7 陣列內數值反轉
package Exam.Ex6.Ex6_7;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Ex6_7 {
    public static void main(String[] args) {
        Integer[] arr = { 12, 15, 18, 43 };
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.print(Arrays.toString(list.toArray()));
    }
}
