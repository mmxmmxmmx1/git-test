//第六章 習題 6-11 每日跟時段平均溫度   自己的寫法，寫得很醜
//tp =time period =時段
package Exam.Ex6.Ex6_11;

public class Ex6_11 {
    public static void main(String[] args) {
        float tp = 0;
        float day = 0;
        float[][] temp = { { 18.2f, 17.3f, 15.0f, 13.4f },
                { 23.8f, 25.1f, 20.6f, 17.8f },
                { 20.6f, 21.5f, 18.4f, 15.7f } };
        System.out.print("temp的內容為:\n");
        for (int i = 0; i < temp.length; i++) {
            for (int a = 0; a < temp[i].length; a++) {

                day = day + temp[i][a];
                System.out.print(temp[i][a] + " ");
            }
            System.out.println();
        }
        day = ((temp[0][0] + temp[1][0] + temp[2][0]) / temp.length);
        System.out.printf("\n星期一平均溫度:%.2f ", day);
        day = ((temp[0][1] + temp[1][1] + temp[2][1]) / temp.length);
        System.out.printf("\n星期二平均溫度:%.2f ", day);
        day = ((temp[0][2] + temp[1][2] + temp[2][2]) / temp.length);
        System.out.printf("\n星期三平均溫度:%.2f ", day);
        day = ((temp[0][3] + temp[1][3] + temp[2][3]) / temp.length);
        System.out.printf("\n星期四平均溫度:%.2f ", day);
        tp = ((temp[0][0] + temp[0][1] + temp[0][2] + temp[0][3]) / temp[0].length);
        System.out.printf("\n時段一的平均氣溫:%.2f", tp);
        tp = ((temp[1][0] + temp[1][1] + temp[1][2] + temp[1][3]) / temp[1].length);
        System.out.printf("\n時段二的平均氣溫:%.2f", tp);
        tp = ((temp[2][0] + temp[2][1] + temp[2][2] + temp[2][3]) / temp[2].length);
        System.out.printf("\n時段三的平均氣溫:%.2f\n", tp);
        day = ((temp[0][1] + temp[1][1] + temp[2][1]) / temp.length);
        System.out.printf("\n平均最高溫是星期二:%.2f，最高溫時段是星期二的時段2: %.2f", day, temp[1][1]);
        day = ((temp[0][3] + temp[1][3] + temp[2][3]) / temp.length);
        System.out.printf("\n平均最低溫是星期四:%.2f，最低溫時段是星期四的時段4: %.2f", day, temp[2][3]);
    }
}