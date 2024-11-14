//第10章 習題Ex10_7 改寫Caaa
package Exam.Ex10.Ex10_7;
class Caaa{
    protected void display(){
     System.out.println("printed from Caaa class");
    }
}
class Cbbb extends Caaa {
    protected void display(){
        System.out.println("printed from Cbbb class");
    }

}
public class Ex10_7 {
    public static void main(String[] args) {
        Caaa bb=new Cbbb();
        bb.display();
    }
}
