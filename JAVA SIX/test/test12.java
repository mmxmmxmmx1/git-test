package test;

class NotTriangle extends Exception {
    public NotTriangle(String message) {
        super(message);
    }
}

class EquilateralTriangle extends Exception {
    public EquilateralTriangle(String message) {
        super(message);
    }
}

class NotEquilateralTriangle extends Exception {
    public NotEquilateralTriangle(String message) {
        super(message);
    }
}

public class test12 {
    public static void triangle(int a, int b, int c)
            throws NotTriangle, EquilateralTriangle, NotEquilateralTriangle {
        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            throw new NotTriangle("不構成三角形");
        } else if (a == b && a == c && b == c) {
            throw new EquilateralTriangle("這是正三角形");
        } else {
            throw new NotEquilateralTriangle("這不是三角形");
        }
    }

    public static void main(String[] args) {
        try {
             triangle(3,3,3);
            // triangle(4, 5, 6);
            //triangle(1, 2, 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
