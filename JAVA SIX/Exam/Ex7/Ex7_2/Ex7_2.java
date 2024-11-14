//第七章 習題 7-2小寫英文字母轉大寫，非小寫英文字母都變成@
package Exam.Ex7.Ex7_2;

public class Ex7_2 {
    public static void main(String[] args) {
        char_to_upper('a');
    }

    public static void char_to_upper(char ch) {
        if (ch >= 'a' && ch <= 'z')
            System.out.println(Character.toUpperCase(ch));
        else
            System.out.print('@');

    }
}