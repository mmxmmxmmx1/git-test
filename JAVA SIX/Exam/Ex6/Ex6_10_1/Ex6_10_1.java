//第六章 練習 6-10 參考chatgpt的解法，不會出現[] , 跟空格 ， 這些符號 。
package Exam.Ex6.Ex6_10_1;

public class Ex6_10_1 {
    public static void main(String[] args) {
        char[] ch = { 'H', 'e', 'l', 'l', 'o' };
        
        // 直接在原陣列上將每個字元轉換成大寫
        for (int i = 0; i < ch.length; i++) {
            ch[i] = Character.toUpperCase(ch[i]);
        }
        
        // 輸出轉換後的字元陣列
        for (char c : ch) {
            System.out.print(c); // 這將輸出HELLO
        }
    }
}