package Ch8_3;

class Rectangle {
    int width;
    int height;

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }
}

public class Ch8_3 {
    public static void main(String[] args) {
        Rectangle r1;
        r1 = new Rectangle();

        r1.width = 20;
        r1.height = 15;
        System.out.println("area=" + r1.area());
        System.out.println("perimeter=" + r1.perimeter());
    }
}
