//Ch12_9 , String 類別使用範例
package Ch12.Ch12_9;

public class Ch12_9 {
    public static void main(String[] args) {
        String s1 = "Easier said than done.";
        System.out.println("length=" + s1.length());
        System.out.println("charAt(8)=" + s1.charAt(8));
        System.out.println("sub string=" + s1.substring(7));
        System.out.println("start with \"th \"=" + s1.startsWith("th"));
        System.out.println("upper case=" + s1.toUpperCase());
    }
}
