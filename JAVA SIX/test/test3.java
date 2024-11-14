package test;

public class test3 {
    public static void main(String[] args) {
        int num = 1;
        if (num == 0) {
            System.out.println("num = " + num);
        }
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.printf("\n%d是大於0的偶數", num);
            } else {
                System.out.println("num是大於0的奇數" + num);
            }
        }
    }
}