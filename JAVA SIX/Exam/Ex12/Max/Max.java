package Exam.Ex12.Max;

public class Max {
    private int n1, n2;

    public Max(int a,int b){
        n1=a;
        n2=b;
    }

    public int cmpare() {
        if (n1 > n2)
            return n1;
        else
            return n2;
    }
}
