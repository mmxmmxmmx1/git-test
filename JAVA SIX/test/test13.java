package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArgumentOutOfBound extends Exception {
    public ArgumentOutOfBound(String message) {
        super(message);
    }
}

public class test13 {
    public static void mySqrt(int n) throws ArgumentOutOfBound {
        if (n <= 0) {
            throw new ArgumentOutOfBound("n小於等於0");
        } else {
            double x = Math.sqrt(n);
            System.out.println(x);
        }
    }

    public static void main(String[] args) throws ArgumentOutOfBound, IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入數字:");
        try {
            int x = Integer.parseInt(read.readLine());
            mySqrt(x);
        } catch (ArgumentOutOfBound e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("您輸入的不是一個整數");
        }
    }
}
