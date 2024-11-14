//Ex13_12 , Ex13_13  
package Exam.Ex13.Ex13_12;

// 自定義例外類別，用於表示點在圓外
class OutException extends Exception {
}

// 自定義例外類別，用於表示點在圓內
class InException extends Exception {
}

// 自定義例外類別，用於表示點在圓心上
class CenterException extends Exception {
}

// Circle類別，用於表示一個圓及其相關的操作
class Circle {
    // 半徑預設為10.0
    private double radius = 10.0;
    // 圓心與點的座標
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    // 點與圓心的距離
    double dist;

    // Circle類別的建構子，接受四個參數表示點和圓心的座標
    public Circle(double a, double b, double c, double d) {
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
    }

    // 檢查點的位置
    public void check() {
        // 計算點與圓心之間的距離
        dist = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        try {
            // 如果點的座標與圓心相同，拋出CenterException
            if (x1 == x2 && y1 == y2)
                throw new CenterException();
            // 如果點在圓內，拋出InException
            else if (dist <= radius)
                throw new InException();
            // 如果點在圓外，拋出OutException
            else if (dist > radius)
                throw new OutException();
        }
        // 捕捉CenterException並輸出相應訊息
        catch (CenterException e) {
            System.out.print("(" + x1 + "," + y1 + ")");
            System.out.print("在半徑" + radius);
            System.out.println(",圓心(" + x2 + "," + y2 + ")的圓心上");
        }
        // 捕捉OutException並輸出相應訊息
        catch (OutException e) {
            System.out.print("(" + x1 + "," + y1 + ")");
            System.out.print("不在半徑" + radius);
            System.out.println(",圓心(" + x2 + "," + y2 + ")的圓內");
        }
        // 捕捉InException並輸出相應訊息
        catch (InException e) {
            System.out.print("(" + x1 + "," + y1 + ")");
            System.out.print("在半徑" + radius);
            System.out.println(",圓心(" + x2 + "," + y2 + ")的圓內");
        }
    }
}

// Ex13_12類別，包含main方法來測試Circle類別
public class Ex13_12 {
    public static void main(String args[]) {
        // 建立一個Circle物件，並檢查點的位置
        Circle c1 = new Circle(5.8, 2.1, 0.2, 9.5);
        c1.check();
    }
}
