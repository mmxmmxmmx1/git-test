//Ex14_13 設計Car model.color.price 並存入mycar.txt，在使用readData函數呼叫void show()把mycar內容顯示出來
package Exam.Ex14.Ex14_13;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Car {
    // 定義 Car 類別的屬性：車款、顏色、價格
    public String module;
    public String color;
    public int price;

    // Car 類的構造器，用於初始化新建 Car 物件時的屬性值
    public Car(String m, String c, int p) {
        module = m;
        color = c;
        price = p;
    }

    // 將車輛資料寫入到文件 "mycar.txt"
    public void writeData(Car car) throws IOException {
        // 使用 FileOutputStream 來寫文件，true 表示以追加模式寫文件
        try (FileOutputStream fo = new FileOutputStream("Exam/Ex14/Ex14_13/mycar.txt", true)) {
            // 將車款、顏色和價格轉為字節數組後寫入文件
            fo.write((car.module + "\n").getBytes());
            fo.write((car.color + "\n").getBytes());
            fo.write(String.valueOf(car.price + "\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace(); // 處理可能的 IOException
        }
    }

    // 顯示車輛資訊
    public void show() {
        System.out.println("車款:" + module);
        System.out.println("顏色:" + color);
        System.out.println("價格:" + price);
    }

    // 從 "mycar.txt" 讀取車輛資料
    public static void readData() throws IOException {
        // 使用 FileInputStream 和 BufferedReader 來讀取文件
        try (FileInputStream fi = new FileInputStream("Exam/Ex14/Ex14_13/mycar.txt")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(fi));
            String module;
            while ((module = br.readLine()) != null) {
                ; // 讀取一行數據但未進行處理
                String color = br.readLine();
                int price = Integer.parseInt(br.readLine());
                Car car = new Car(module, color, price);
                car.show();
            }
        } catch (IOException e) {
            e.printStackTrace(); // 處理可能的 IOException
        }
    }
}

public class Ex14_13 {
    public static void main(String[] args) throws IOException {
        // 創建兩個 Car 物件
        Car c1 = new Car("c 300 Estate", "white", 297);
        Car c2 = new Car("5-Series Sedan M5", "black", 716);

        // 將車輛資訊寫入到文件中
        c1.writeData(c1);
        c2.writeData(c2);
        Car.readData();

        // 讀取並顯示車輛資訊
    }
}
