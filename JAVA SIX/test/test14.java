package test;

import java.util.InputMismatchException;
import java.util.Scanner;

class ArgumentOutOfBound extends Exception {
    public ArgumentOutOfBound(String message) {
        super(message);
    }
}

public class test14 {
    public static boolean prime(int n) throws ArgumentOutOfBound {
        if (n <= 1) {
            throw new ArgumentOutOfBound("整數不能小於或等於1");
        }
        if (n == 2) {
            System.out.println("這是一個質數");
            return true;
        }
        if (n % 2 == 0) {
            System.out.println("這不是一個質數因為它可以被 2 整除");
            return false;
        }
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                System.out.println("這不是一個質數因為它可以被 " + i + " 整除");
                return false;
            }
        }
        System.out.println("這是一個質數");
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入整數來判斷是否為質數:");
        try {
            int x = scn.nextInt();
            prime(x);
        } catch (InputMismatchException e) {
            System.out.println("您輸入的整數有誤");

        } catch (ArgumentOutOfBound e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("您輸入的整數有誤");
        }
        scn.close();
    }
}
