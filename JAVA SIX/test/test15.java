//建立引數建構子Data的學生姓名與英文數學成績並存入student.txt檔案，並用show()函數印出來
package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Data {
    private String name;
    private int english;
    private int math;

    public Data(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void writeData(Data stu) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("test/student.txt", true));
        bw.write(stu.name + "," + stu.english + "," + stu.math + "\n");
        bw.flush();
        bw.close();
    }

    public void show() {
        System.out.println("學生姓名：" + name);
        System.out.println("英文成績：" + english);
        System.out.println("數學成績：" + math);
        System.out.println("平均成績：" + (double) (english + math) / 2);
    }

}

public class test15 {
    public static void readData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test/student.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(",");
            String name = arr[0];
            int english = Integer.parseInt(arr[1]);
            int math = Integer.parseInt(arr[2]);
            Data stu = new Data(name, english, math);
            stu.show();
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        Data stu1 = new Data("Ariel", 92, 85);
        Data stu2 = new Data("Fiona", 67, 89);
        stu1.writeData(stu1);
        stu2.writeData(stu2);
        readData();
    }
}
