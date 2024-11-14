package test;

public class test9 {
    public static void main(String[] args) {
        float[][] temp = { { 18.2f, 17.3f, 15.0f, 13.4f },
                { 23.8f, 25.1f, 20.6f, 17.8f },
                { 20.6f, 21.5f, 18.4f, 15.7f } };
        System.out.println("temp的內容為:");
        printTemperatures(temp);
        printAverageTemperatureByDay(temp);
        printAverageTemperatureByTimePeriod(temp);
    }

    private static void printTemperatures(float[][] temperatures) {
        for (float[] row : temperatures) {
            for (float temp : row) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    private static void printAverageTemperatureByDay(float[][] temperatures) {
        int numDays = temperatures[0].length;
        for (int day = 0; day < numDays; day++) {
            float sum = 0;
            for (float[] week : temperatures) {
                sum += week[day];
            }
            System.out.printf("\n星期%d平均溫度:%.2f", day + 1, sum / temperatures.length);
        }
    }

    private static void printAverageTemperatureByTimePeriod(float[][] temperatures) {
        for (int period = 0; period < temperatures.length; period++) {
            float sum = 0;
            for (float temp : temperatures[period]) {
                sum += temp;
            }
            System.out.printf("\n時段%d的平均氣溫:%.2f", period + 1, sum / temperatures[period].length);
        }
    }
}
