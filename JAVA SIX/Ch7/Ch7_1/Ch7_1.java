package Ch7.Ch7_1;

public class Ch7_1 {
    public static void main(String[] args) {
        star();
        System.out.println("Wonderful tonight");
        star();
    }

    public static void star() {
        for (int i = 0; i < 18; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}
