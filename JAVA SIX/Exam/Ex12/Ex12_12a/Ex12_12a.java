//Ex12_12a , Factor 類別
package Exam.Ex12.Ex12_12a;

import Exam.Ex12.Ex12_12b.Sum;

class Factor {
    public int fac(int n) {
        if (n >= 1) {
            return n * fac(n - 1);
        } else {
            return 1;
        }
    }
}

public class Ex12_12a {
    public static void main(String[] args) {
        Factor f = new Factor();
        System.out.println("factor(5)=" + f.fac(5));
        Sum s = new Sum();
        System.out.println("Sum(5)=" + s.add(10));
    }
}
