// Ex16_8 List介面 , 印出ArrayList 的內容
package Exam.Ex16.Ex16_8;

import java.util.ArrayList; // 匯入 ArrayList 類別

public class Ex16_8 {
    public static void main(String[] args) {
        // 建立一個 ArrayList 物件，用於儲存字串類型的元素
        ArrayList<String> alist = new ArrayList<>();

        // 向 ArrayList 中添加不同的句子
        alist.add("Homer sometimes nods."); // 添加 "Homer sometimes nods."
        alist.add("Beauty is in the eye of beholder."); // 添加 "Beauty is in the eye of beholder."
        alist.add("Example is better than precept."); // 添加 "Example is better than precept."
        alist.add("Learn to walk before you run."); // 添加 "Learn to walk before you run."
        alist.add("Make hay while the sun shines."); // 添加 "Make hay while the sun shines."

        // 使用增強的 for 迴圈（for-each）遍歷 ArrayList 中的每一個元素
        for (String word : alist) {
            System.out.println(word); // 印出當前元素的內容
        }
    }
}
