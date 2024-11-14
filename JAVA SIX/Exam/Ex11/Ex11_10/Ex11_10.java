//第11章 習題題Ex11_10,Data的繼承
package Exam.Ex11.Ex11_10;

// 定義介面 Data
interface Data {
    public void best(); // 判斷哪一科成績較好

    public void failed(); // 判斷哪一科成績低於 60 分
}

// 定義介面 Test，繼承自 Data
interface Test extends Data {
    public void showData(); // 顯示學生的資料及成績

    public void average(); // 計算數學和英文的平均成績
}

// 定義類別 Stu，實作介面 Test
class Stu implements Test {
    protected String name; // 學生姓名
    protected int math; // 數學成績
    protected int english; // 英文成績

    // 建構子，用於初始化學生資料
    public Stu(String n, int m, int e) {
        name = n;
        math = m;
        english = e;
    }

    // 實作 best 方法，判斷哪一科成績較好
    public void best() {
        if (english > math) {
            System.out.println(name + " 的英文比數學好");
        } else {
            System.out.println(name + " 的數學比英文好");
        }
    }

    // 實作 failed 方法，判斷哪一科成績低於 60 分
    public void failed() {
        if (english < 60) {
            System.out.println(name + " 的英文當掉了");
        }
        if (math < 60) {
            System.out.println(name + " 的數學當掉了");
        }
    }

    // 實作 average 方法，計算數學和英文的平均成績
    public void average() {
        System.out.println("平均成績: " + (math + english) / 2);
    }

    // 實作 showData 方法，顯示學生的資料及成績
    public void showData() {
        System.out.println("姓名: " + name);
        System.out.println("數學成績: " + math);
        System.out.println("英文成績: " + english);
    }

    // 新增 show 方法，依次呼叫 showData、average、best 和 failed 方法
    public void show() {
        showData();
        average();
        best();
        failed();
    }
}

// 定義主類別 Ex11_10
public class Ex11_10 {
    // 主方法，程式的進入點
    public static void main(String[] args) {
        Stu s = new Stu("Judy", 58, 91); // 建立 Stu 類別的實例並初始化資料
        s.show(); // 呼叫 show 方法顯示資料
    }
}