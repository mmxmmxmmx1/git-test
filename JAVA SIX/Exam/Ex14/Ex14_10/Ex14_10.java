//Ex14_10 建構學生成績檔案
package Exam.Ex14.Ex14_10;

import java.io.*;

// 定義一個 Data 類別，用於儲存和處理學生資料
class Data {
    private String name; // 學生姓名
    private int english; // 英文成績
    private int math; // 數學成績

    // 構造方法，用於創建 Data 物件並初始化屬性
    public Data(String str, int e, int m) {
        name = str;
        english = e;
        math = m;
    }

    // 將學生資料寫入檔案的方法
    public void writeData(Data stu) throws IOException {
        // 使用 BufferedWriter 來寫檔，並且以追加模式寫入文件
        BufferedWriter bfw = new BufferedWriter(new FileWriter("Exam/Ex14/Ex14_10/student.txt", true));
        // 將學生的姓名、英文和數學成績用逗號分隔寫入一行
        bfw.write(stu.name + "," + stu.english + "," + stu.math + "\n");
        bfw.close(); // 關閉檔案
    }

    // 顯示學生資料和計算平均分的方法
    public void show() {
        System.out.println("姓名:" + name);
        System.out.println("英文分數:" + english);
        System.out.println("數學分數:" + math);
        System.out.println("平均分數:" + (double) (english + math) / 2);
    }
}

public class Ex14_10 {
    // 讀取檔案中的學生資料並顯示
    public static void readData() throws IOException {
        String str;
        // 使用 BufferedReader 來讀取檔案
        BufferedReader bfr = new BufferedReader(new FileReader("Exam/Ex14/Ex14_10/student.txt"));
        while ((str = bfr.readLine()) != null) {
            // 用逗號分隔每行數據，並創建 Data 物件
            String data[] = str.split(",");
            Data stu = new Data(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
            stu.show(); // 顯示學生資料
        }
        bfr.close(); // 關閉檔案
    }

    public static void main(String[] args) throws IOException {
        // 創建兩個學生資料並寫入檔案
        Data stu1 = new Data("Ariel", 92, 85);
        Data stu2 = new Data("Fiona", 67, 89);
        stu1.writeData(stu1);
        stu2.writeData(stu2);

        // 讀取並顯示檔案中所有學生資料
        readData();
    }
}