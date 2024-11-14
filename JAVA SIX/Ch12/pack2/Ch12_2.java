package Ch12.pack2;

class Circle {
    public void show() {
        System.out.println("show() called");
    }
}

public class Ch12_2 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.show();
    }
}
