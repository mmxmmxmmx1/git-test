package Exam.Ex14.Ex14_11;

import java.io.*;
import java.util.Random;

public class Ex14_11 {
    public void writerData() throws IOException {
        Random sum = new Random();
        for (int i = 0; i < 100; i++) {
            int random = (sum.nextInt(26));
            char ch = (char) ('a' + random);
            FileOutputStream fo = new FileOutputStream("Exam/Ex14/Ex14_11/rand99.txt", true);
            fo.write(ch);
            fo.flush();
            fo.close();
        }
    }

    public void cnt() throws IOException {
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;
        FileInputStream fi = new FileInputStream("Exam/Ex14/Ex14_11/rand99.txt");
        byte ba[] = new byte[fi.available()];
        fi.read(ba);
        for (int i = 0; i < ba.length; i++) {
            if (ba[i] == 'a')
                sum1 += 1;
            if (ba[i] == 'e')
                sum2 += 1;
            if (ba[i] == 'i')
                sum3 += 1;
            if (ba[i] == 'o')
                sum4 += 1;
            if (ba[i] == 'u')
                sum5 += 1;
            fi.close();
        }
        System.out.println("a出現了:" + sum1);
        System.out.println("e出現了:" + sum2);
        System.out.println("i出現了:" + sum3);
        System.out.println("o出現了:" + sum4);
        System.out.println("u出現了:" + sum5);
    }

    public static void main(String[] args) throws IOException {
        try {
            Ex14_11 ex = new Ex14_11();
            ex.writerData();
            ex.cnt();

        } catch (IOException e) {
            e.getMessage();
        }
    }
}