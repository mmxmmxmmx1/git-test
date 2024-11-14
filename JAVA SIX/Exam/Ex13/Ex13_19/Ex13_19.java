package Exam.Ex13.Ex13_19;

import java.io.IOException;
import java.util.Scanner;

class ArgumentOutOfBound extends Exception {
    public ArgumentOutOfBound(String message) {
        super(message);
    }
}

public class Ex13_19 {
    public static boolean prime(int n) throws ArgumentOutOfBound, IOException {
        if (n <= 1) {
            throw new ArgumentOutOfBound("小於1或等於1都不是質數");
        }
        if (n == 2) {
            System.out.println(n + " 是質數");
            return true;
        }
        if (n % 2 == 0) {
            System.out.println(n + " 不是質數，因為它是偶數");
            return false;
        }
        for (int i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                System.out.println(n + " 不是質數，因為它可以被 " + i + " 整除");
                return false;
            }
        }
        System.out.println(n + " 是質數");
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個整數:");
        try {
            int x = scn.nextInt();
            prime(x);
        } catch (ArgumentOutOfBound e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("IOException occurred");
        } catch (IOException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scn.close();
    }
}
