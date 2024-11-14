//第八章 習題 8-3 設類別Cdddd
package Exam.Ex8.Ex8_3;

class Cddd {
    String name;
    double height;
    double weight;

}

public class Ex8_3 {
    public static void main(String[] args) {
        Cddd studen;
        studen = new Cddd();
        studen.name = "Sandy";
        studen.height = 1.665;
        studen.weight = 56.2;
        System.out.println("studen name:" + studen.name + " ，height:" + studen.height + "m" +
                " ，BMI:" + (studen.weight / (studen.height * studen.height)));

    }

}
