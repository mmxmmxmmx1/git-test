//第九章 習題 9-5 Average
package Exam.Ex9.Ex9_5;

class Average {
    private int[][] arr;
    private double avg;

    Average(int[][] a) {
        arr = a;
    }

    void print_avg() {
        avg = 0;
        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                avg += arr[a][b];
                sum++;
            }
        }
        System.out.println("Average= " + (double) avg / sum);
    }

    void print_arr() {
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr[a].length; b++) {
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }
    }
}

public class Ex9_5 {
    public static void main(String[] args) {
        int[][] a = { { 12, 54, 23 }, { 21, 12, 25 } };
        Average obj = new Average(a);
        obj.print_avg();
        obj.print_arr();

    }
}
