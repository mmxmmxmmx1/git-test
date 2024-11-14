//第11章 習題題Ex11_8,Stu類別與資料成員
package Exam.Ex11.Ex11_8;

interface Data {
    public void showData();
}

interface Test {
    public void showScore();

    public double calcu();
}

class Stu implements Data, Test {
    protected String id;
    protected String name;
    protected int mid;
    protected int fin;
    protected int common;

    public void showData() {
        System.out.println("學號: " + id);
        System.out.println("姓名: " + name);
    }

    public void showScore() {
        System.out.println("平時成績: " + common);
        System.out.println("期中考成績: " + mid);
        System.out.println("期末考成績: " + fin);
        System.out.println("平均成績: " + calcu());
    }

    public Stu(String num, String n, int c, int m, int f) {
        id = num;
        name = n;
        common = c;
        mid = m;
        fin = f;
    }

    public double calcu() {
        return common * 0.4 + mid * 0.3 + fin * 0.3;
    }

    public void show() {
        showData();
        showScore();
    }
}

public class Ex11_8 {
    public static void main(String[] args) {
        Stu stu = new Stu("940001", "Fiona", 90, 92, 85);
        stu.show();
    }
}
