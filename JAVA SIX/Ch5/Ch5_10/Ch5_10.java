package Ch5.Ch5_10;

public class Ch5_10 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <=10; i++) {
            if (i % 3 == 0)
                break;        //設定為continue則會繼續執行到<=11為止
            System.out.println("i=" + i);
        }
        System.out.println("when loop interrupted, i=" + i);
    }
}
