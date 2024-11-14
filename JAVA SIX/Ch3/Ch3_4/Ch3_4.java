//列印出byte.short.int.long.float.double.boolen的最小跟最大數值。
package Ch3.Ch3_4;
public class Ch3_4 {
        public static void main(String[] args) {
                System.out.printf("Byte_MIN_VALUE:%d ， Byte_MAX_VALUE:%d",
                                Byte.MIN_VALUE, Byte.MAX_VALUE);
                System.out.printf("\nShort_MIN_VALUE:%d ， Short_MAX_VALUE:%d",
                                Short.MIN_VALUE, Short.MAX_VALUE);
                System.out.printf("\nInt_MIN_VALUE:%d ， Int_MAX_VALUE:%d",
                                Integer.MIN_VALUE, Integer.MAX_VALUE);
                System.out.printf("\nLong_MIN_VALUE:%d ， Long_MAX_VALUE:%d",
                                Long.MIN_VALUE, Long.MAX_VALUE);
                System.out.printf("\nFloat_MIN_VALUE:%f ， Float_MAX_VALUE:%f",
                                Float.MIN_VALUE, Float.MAX_VALUE);
                System.out.printf("\nDouble_MIN_VALUE:%f ， Double_MAX_VALUE:%f",
                                Double.MIN_VALUE, Double.MAX_VALUE);
                System.out.printf("\nBoolen.False:%b ， Boolen.True:%b",
                                Boolean.FALSE, Boolean.TRUE);
        }
}
