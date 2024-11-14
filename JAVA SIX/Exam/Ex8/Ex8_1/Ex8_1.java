//第八章 習題 8-1 設類別Caaa
package Exam.Ex8.Ex8_1;

class Caaa {
    int a;
    int b;
    int c;
}

public class Ex8_1 {
    public static void main(String[] args) {
        Caaa obj;
        obj = new Caaa();
        obj.a = (5);
        obj.b = (3);
        obj.c = (obj.a * obj.b);
        System.out.println("a的值為:" + obj.a + "， b的值為:" + obj.b + 
        "， c的值為:" + obj.c);

    }
}
