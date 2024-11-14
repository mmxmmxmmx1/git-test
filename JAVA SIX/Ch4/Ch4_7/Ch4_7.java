package Ch4.Ch4_7;

public class Ch4_7 {
    public static void main(String[] args) {
        char ch = 'm';
        short s = -5;
        int i = 6;
        float f = 9.7f;
        double d = 1.76;
        System.out.printf("(s*ch)-(d/f)*(i+f)=%7.3f",
                (s * ch) - (d / f) * (i + f));
    }
}
