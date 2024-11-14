//Ch12_10 , StringBuffer 類別使用的範例
package Ch12.Ch12_10;

public class Ch12_10 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Black & White");

        System.out.println(s1);
        System.out.println("length=" + s1.length());
        System.out.println(s1.replace(0, 5, "cats"));
        System.out.println(s1.replace(7, 12, "dogs"));
        System.out.println(s1.reverse());
        System.out.println(s1);
    }
}
