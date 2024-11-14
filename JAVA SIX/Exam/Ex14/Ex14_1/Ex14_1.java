//Ex14_1+Ex14_2 輸入knowledge is power 轉成大寫
package Exam.Ex14.Ex14_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf;
        String str;

        buf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input a string: ");
        str = buf.readLine();                   //將輸入的文字指定給字串變數str存取

        System.out.println("string=" + str.toUpperCase());       //印出字串
    }
}
