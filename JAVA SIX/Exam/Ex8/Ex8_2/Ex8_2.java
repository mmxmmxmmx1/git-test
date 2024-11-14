//第八章 習題 8-2 設類別Cbbb
package Exam.Ex8.Ex8_2;

class Cbbb {
    double x;
    double y;
}

public class Ex8_2 {
    public static void main(String[] args) {
        Cbbb obj1, obj2, avg;
        obj1 = new Cbbb();
        avg = new Cbbb();
        obj2 = new Cbbb();
        obj1.x = 5.2;
        obj1.y = 3.9;

        obj2.x = 6.5;
        obj2.y = 4.6;

        avg.x = ((obj1.x + obj2.x) / 2);
        avg.y = ((obj1.y + obj2.y) / 2);
        
        System.out.println("obj1的值:" + obj1.x + " " + obj1.y);
        System.out.println("obj2的值:" + obj2.x + " " + obj2.y);
        System.out.println("abg.x的平均值:" + avg.x + "， y的平均值: " + avg.y);
    }
}
