//Ch12_4.java,package 的使用(三),此檔案存放在pack4a資料夾內
package Ch12.Ch12_4.pack4a;

public class Ch12_4 { // 將Ch12_4類別納入package pack4a當中
    public static void main(String[] args) {
        Ch12.Ch12_4.pack4b.Circle c1 = new Ch12.Ch12_4.pack4b.Circle();
        c1.show();
    }
}
