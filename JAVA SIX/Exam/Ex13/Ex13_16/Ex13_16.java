//Ex13_16 可從鍵盤輸入字串,若字串之值為"520" ,則拋出Exception520
package Exam.Ex13.Ex13_16;

import java.util.Scanner;

class Exception520 extends Exception {
    public Exception520(String message) {
        super(message);
    }
}

public class Ex13_16 {
    public static void main(String[] args) throws Exception520 {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入數字:");
        String s = scn.nextLine();
        try {
            if (s.equals("520")) {
                throw new Exception520("這是由字串520所引起的例外");
            } else {
                System.out.println(s);
            }
        } catch (Exception520 e) {
            System.out.println(e);
        } finally {
            scn.close();
        }
    }
}
