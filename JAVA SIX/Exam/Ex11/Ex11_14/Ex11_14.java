//第11章 習題題Ex11_14,建立Shape.Circle.Triangle.Coin類別用instanceof做判別。
//第11章 習題題Ex11_15,測試null是否繼承Object類別。
package Exam.Ex11.Ex11_14;

// 定義基本類別 Shape
class Shape {
}

// Circle 類別繼承自 Shape 類別
class Circle extends Shape {
}

// Triangle 類別繼承自 Shape 類別
class Triangle extends Shape {
}

// Coin 類別繼承自 Circle 類別，間接繼承自 Shape 類別
class Coin extends Circle {
}

public class Ex11_14 {
    public static void testNull() {
        // 判斷 null 是否為 Object 類別的實例
        System.out.println("null 是 Object 類別的實例?= " + (null instanceof Object));
    }

    public static void main(String[] args) {
        // 創建 Circle 類別的實例 c1
        Circle c1 = new Circle();
        // 創建 Triangle 類別的實例 t1
        Triangle t1 = new Triangle();
        // 創建 Coin 類別的實例 n1
        Coin n1 = new Coin();

        // 判斷 c1 是否為 Coin 類別的實例（或者其子類別的實例）
        // 因為 c1 是 Circle 的實例而不是 Coin 的實例，所以返回 false
        System.out.println("c1 instanceof Coin?= " + (c1 instanceof Coin));

        // 判斷 t1 是否為 Shape 類別的實例（或者其子類別的實例）
        // 因為 t1 是 Triangle 的實例，而 Triangle 繼承自 Shape，所以返回 true
        System.out.println("t1 instanceof Shape?= " + (t1 instanceof Shape));

        // 判斷 n1 是否為 Object 類別的實例
        // 因為所有類別在 Java 中都繼承自 Object，所以返回 true
        System.out.println("n1 instanceof Object?= " + (n1 instanceof Object));
        // 測試 null 是否繼承 Object 類別
        testNull();
    }
}