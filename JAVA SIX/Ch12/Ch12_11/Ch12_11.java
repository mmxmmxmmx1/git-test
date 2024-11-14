//Ch12_11 , Integer class 函數的應用
package Ch12.Ch12_11;

public class Ch12_11 {
    public static void main(String[] args) {
        String s1;
        int inum;

        inum = Integer.parseInt("654") + 3;
        System.out.println(inum);
        s1 = Integer.toString(inum) + "3";
        System.out.println(s1);
    }
}
