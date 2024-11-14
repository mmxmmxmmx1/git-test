//第九章 習題 9-18 NameCard
package Exam.Ex9.Ex9_18;

// 名片類別
class NameCard {
    private String name; // 姓名
    private String address; // 地址
    private Phone data; // 電話資料

    // 建構子，初始化姓名和地址
    public NameCard(String na, String ad) {
        this.name = na;
        this.address = ad;
        this.data = new Phone(); // 初始化電話資料
    }

    // 內部類別 Phone，包含電話和手機
    public class Phone {
        private String tel; // 電話
        private String mobile; // 手機
    }

    // 設置電話和手機的方法
    public void setPhone(String te, String mob) {
        this.data.tel = te;
        this.data.mobile = mob;
    }

    // 顯示名片資訊的方法
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Tel: " + data.tel);
        System.out.println("Mobile: " + data.mobile);
    }
}

// 主類別 Ex9_18
public class Ex9_18 {
    public static void main(String[] args) {
        // 創建 NameCard 物件，名為 Tom，地址為 123 City
        NameCard tom = new NameCard("Tom", "123 City");
        // 設置 Tom 的電話和手機號碼
        tom.setPhone("345-7612", "0971-666000");
        // 顯示 Tom 的名片資訊
        tom.show();
    }
}