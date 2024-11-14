//Ex15_14 , 使用Math.random產生10萬筆0~100000的double型態亂數，並存入bdata.txt與qdata.txt
//並使用Bsort跟Qsort分別建立bubbleSort與quickSort，利用氣泡排序法(bubble sort)與快速排序法(quick sort)排序
//，並以多執行緒的方式讓bubbleSort()讀取bdata.txt ， quickSort讀取qdata.txt中的資料，並將排序
//後的結果存入bresul.txt與qresult.txt中。
package Exam.Ex15.Ex15_14;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

class mathData {
    private Random random;

    // 生成bdata.txt，包含50000筆0到10000的亂數
    public void bdata() throws IOException {
        random = new Random();
        FileWriter fw = new FileWriter("Exam/Ex15/Ex15_14/bdata.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 50000; i++) {
            double randomnumber = random.nextDouble() * 10000.0;
            bw.write(String.valueOf(randomnumber));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    // 生成qdata.txt，包含50000筆0到10000的亂數
    public void qdata() throws IOException {
        random = new Random();
        FileWriter fw = new FileWriter("Exam/Ex15/Ex15_14/qdata.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < 50000; i++) {
            double randomnumber1 = random.nextDouble() * 10000.0;
            bw.write(String.valueOf(randomnumber1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

class BSort implements Runnable {
    public void run() {
        try {
            String str;
            ArrayList<Double> list = new ArrayList<>();
            FileReader fr = new FileReader("Exam/Ex15/Ex15_14/bdata.txt");
            BufferedReader br = new BufferedReader(fr);

            // 讀取bdata.txt中的資料並存入ArrayList
            while ((str = br.readLine()) != null) {
                list.add(Double.parseDouble(str.trim()));
            }
            br.close();

            int n = list.size();
            double[] array = new double[n];

            // 將ArrayList轉換為陣列
            for (int i = 0; i < n; i++) {
                array[i] = list.get(i);
            }

            // 氣泡排序法
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        double temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            long startTime = System.nanoTime() / 1000000;
            StringBuilder sb = new StringBuilder();
            BufferedWriter bw = new BufferedWriter(new FileWriter("Exam/Ex15/Ex15_14/bresul.txt"));

            // 將排序後的資料寫入bresul.txt
            for (int z = 0; z < array.length; z++) {
                double tmp = array[z];
                sb.append(tmp).append(System.lineSeparator());
            }
            bw.write(sb.toString());
            bw.flush();
            bw.close();
            long endTime = System.nanoTime() / 1000000;
            System.out.println("bresult.txt寫入花費的時間: " + (endTime - startTime) + " 毫秒");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class QSort implements Runnable {
    public void run() {
        try {
            String str;
            ArrayList<Double> list = new ArrayList<>();
            FileReader fr = new FileReader("Exam/Ex15/Ex15_14/qdata.txt");
            BufferedReader br = new BufferedReader(fr);

            // 讀取qdata.txt中的資料並存入ArrayList
            while ((str = br.readLine()) != null) {
                list.add(Double.parseDouble(str.trim()));
            }
            br.close();

            double[] array = new double[list.size()];

            // 將ArrayList轉換為陣列
            for (int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }

            long startTime = System.nanoTime() / 1000000;

            // 快速排序法
            quickSort(array, 0, array.length - 1);

            BufferedWriter bw = new BufferedWriter(new FileWriter("Exam/Ex15/Ex15_14/qresul.txt"));

            // 將排序後的資料寫入qresul.txt
            for (double v : array) {
                bw.write(String.valueOf(v));
                bw.newLine();
            }
            bw.flush();
            bw.close();
            long endTime = System.nanoTime() / 1000000;
            System.out.println("qresult.txt寫入花費的時間: " + (endTime - startTime) + " 毫秒");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 快速排序法
    private void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // 劃分陣列並返回劃分點
    private int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

public class Ex15_14 {
    public static void main(String[] args) {
        mathData a = new mathData();
        BSort bs = new BSort();
        QSort qs = new QSort();
        Thread bu = new Thread(bs);
        Thread qs1 = new Thread(qs);
        try {
            // 生成隨機資料文件
            a.bdata();
            a.qdata();

            // 啟動多執行緒進行排序並寫入結果文件
            bu.start();
            qs1.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
