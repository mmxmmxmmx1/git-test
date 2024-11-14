//第六章 習題 6-12 銷售量  chatgpt的寫法
package Exam.Ex6.Ex6_12;

public class Ex6_12 {
    public static void main(String[] args) {
        // 設定產品單價
        int[] prices = { 12, 16, 10, 14, 15 }; // 按照 A, B, C, D, E 的順序

        // 銷售數據，每行代表一個銷售員的銷售數量對於每個產品
        int[][] sales = {
                { 33, 32, 56, 45, 33 },
                { 77, 33, 68, 45, 23 },
                { 43, 55, 43, 67, 65 }
        };

        // (a) 每一個銷售員的銷售總金額
        int[] salespersonTotal = new int[sales.length];
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < prices.length; j++) {
                salespersonTotal[i] += sales[i][j] * prices[j];
            }
            System.out.println("銷售員 " + (i + 1) + " 銷售總金額: $" + salespersonTotal[i]);
        }

        // (b) 每一項產品的銷售總金額
        int[] productTotal = new int[prices.length];
        for (int j = 0; j < prices.length; j++) {
            for (int i = 0; i < sales.length; i++) {
                productTotal[j] += sales[i][j] * prices[j];
            }
            System.out.println("產品 " + (char) ('A' + j) + " 銷售總金額: $" + productTotal[j]);
        }

        // (c) 最好業績的銷售員
        int maxSalesIndex = 0;
        for (int i = 1; i < salespersonTotal.length; i++) {
            if (salespersonTotal[i] > salespersonTotal[maxSalesIndex]) {
                maxSalesIndex = i;
            }
        }
        System.out.println("有最好業績的銷售員 " + (maxSalesIndex + 1) + " 銷售總金額: $" + salespersonTotal[maxSalesIndex]);

        // (d) 銷售總金額為最多的產品
        int maxProductIndex = 0;
        for (int j = 1; j < productTotal.length; j++) {
            if (productTotal[j] > productTotal[maxProductIndex]) {
                maxProductIndex = j;
            }
        }
        System.out.println(
                "銷售最多的產品是 " + (char) ('A' + maxProductIndex) + " 銷售總金額是: $" + productTotal[maxProductIndex]);
    }
}
