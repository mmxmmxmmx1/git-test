// 第九章 習題 9-19 學生資料data的定義
package Exam.Ex9.Ex9_19;

// 定義 Data 類別
class Data {
    // 定義私有成員變數 name 用來存放學生姓名
    private String name;
    // 定義私有成員變數 score 用來存放 Test 類別的實例
    private Test score;

    // Data 類別的建構子，用來初始化 name 和 score
    public Data(String na, int eng, int ma) {
        name = na; // 設定學生姓名
        this.score = new Test(eng, ma); // 使用英語和數學成績來初始化 Test 類別
    }

    // 定義 Test 類別為 Data 的內部類別
    public class Test {
        // 定義公有成員變數 english 和 math 用來存放學生的成績
        public int english;
        public int math;

        // Test 類別的建構子，用來初始化 english 和 math 成績
        public Test(int eng, int ma) {
            this.english = eng; // 設定英語成績
            this.math = ma; // 設定數學成績
        }

        // 定義 avg() 方法來計算平均成績
        public double avg() {
            return (double) (this.english + this.math) / 2; // 計算並返回平均成績
        }
    }

    // 定義 show() 方法來顯示學生的資料和平均成績
    public void show() {
        System.out.println("Name: " + name); // 顯示學生姓名
        System.out.println("English: " + this.score.english); // 顯示英語成績
        System.out.println("Math: " + this.score.math); // 顯示數學成績
        System.out.println("Average: " + this.score.avg()); // 顯示平均成績
    }
}

// 定義主類別 Ex9_19
public class Ex9_19 {
    // 主方法，程式的入口
    public static void main(String[] args) {
        // 創建 Data 類別的實例並初始化
        Data stu = new Data("Annie", 85, 92);
        // 調用 show() 方法來顯示學生的資料和平均成績
        stu.show();
    }
}
