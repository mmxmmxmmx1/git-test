package test;

public class test5 {
    public static void main(String[] args) {
        int rowCount = 5; // 總共五行
        int number = 0; // 從 0 開始

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j <= i; j++) {
                if (number <= 9) {
                    System.out.print(number);
                } else { // 如果 number 超過 9，轉換為字母並印出
                    System.out.print((char) ('a' + number - 10));
                }
                number++;
            }
            System.out.println();
        }
    }
}
