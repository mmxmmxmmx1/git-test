//常用的類別庫 ,用Math .String .浮點轉字串.字串轉int.String反向.字串轉long型態
package Exam.Ex12.Ex12_6;

import java.util.stream.IntStream;

public class Ex12_6 {
    public static void main(String[] args) {
        System.out.println(Math.ceil(5.38));
        String str = "Habit is second nature";
        System.out.println(str.substring(16));
        String num = "262904713";
        System.out.println(Integer.parseInt(num) * 2);
        StringBuffer milk = new StringBuffer("MilK");
        System.out.println(milk.reverse());
        String number = "45874356676541331";
        System.out.println(Long.parseLong(number));
        System.out.println(IntStream.rangeClosed(1, 5).mapToDouble(Math::sqrt).sum());
        System.out.println(Math.atan(1) + Math.acos(0.5));
        System.out.println("Every Dog Has His Day.".toLowerCase());
        System.out.println(Math.sin(Math.PI / 6) + Math.cos(Math.PI / 3));
        System.out.println(Double.toString(67.834));
        System.out.println("Two heads are better than one.".substring(13, 20));
        System.out.println("Rome was not built in a day.".toUpperCase());
    }
}
