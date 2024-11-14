//Ch13_4 , 於城市中拋出例外
package Ch13.Ch13_4;

public class Ch13_4 {
    public static void main(String[] args) {
        int a = 4, b = 0;

        try {
            if (b == 0)
                throw new ArithmeticException();            // 拋出例外

            else
                System.out.println(a + "/" + "=" + a / b); // 若無拋出例外,則執行此行
        } catch (ArithmeticException e) {
            System.out.println(e + "throwed");
        }
    }
}
