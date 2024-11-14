package Ch3.Ch3_12;

public class Ch3_12 {
    public static void main(String[] args) {

        byte bt = 65;
        int num = -65;
        float ft = 3.14f;
        double db = 567.1234;

        System.out.printf("bt=%c\n", bt);
        System.out.printf("bt=%+05d , int=%+05d\n", bt, num);
        System.out.printf("oct=%o , hex =%x\n", bt, bt);
        System.out.printf("ft=%7.4f\n", ft);
        System.out.printf("db=%f\n", db);
    }
}
