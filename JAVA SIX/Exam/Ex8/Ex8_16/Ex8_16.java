//第八章 習題 8-16 設定CData 記錄好友.電子信箱.
package Exam.Ex8.Ex8_16;

class CData {
    private String name; // 姓名
    private String email; // 電子郵件信箱
    private int mm; // 生的月份
    private int dd; // 生的日期
    private int yy; // 生的年份

    // (a) 設定姓名的方法
    void setName(String name) {
        this.name = name;
    }

    // (b) 設定電子郵件信箱的方法
    void setEmail(String email) {
        this.email = email;
    }

    // (c) 設定生日的方法
    void setBirthday(int m, int d, int y) {
        if (checkDate(m, d, y)) {
            this.mm = m;
            this.dd = d;
            this.yy = y;
        } else {
            this.mm = 0;
            this.dd = 0;
            this.yy = 0;
        }
    }

    // (d) 檢查日期是否合法的方法
    boolean checkDate(int m, int d, int y) {
        if (y < 1900 || y > 2099)
            return false;
        if (m < 1 || m > 12)
            return false;
        if (d < 1)
            return false;

        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (m == 2 && isLeapYear(y)) {
            return d <= 29;
        }
        return d <= daysInMonth[m - 1];
    }

    // 檢查是否是閏年
    boolean isLeapYear(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                return y % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // (e) 設定所有資料的方法
    void setAll(String name, String email, int m, int d, int y) {
        setName(name);
        setEmail(email);
        setBirthday(m, d, y);
    }

    // (f) 顯示資料的方法
    void showData() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        if (mm != 0 && dd != 0 && yy != 0) {
            System.out.println("Birthday: " + String.format("%02d/%02d/%04d", mm, dd, yy));
        } else {
            System.out.println("日期格式設定錯誤!");
        }
    }

    public static void main(String[] args) {
        // (h) 建立 tom 物件並設定資料
        CData tom = new CData();
        tom.setName("Tom");
        tom.setEmail("abc@gmail.com");
        tom.setBirthday(6, 18, 2006);
        tom.showData();

        // (i) 建立 mary 物件並設定資料
        CData mary = new CData();
        mary.setAll("Mary", "mary@example.com", 7, 20, 1998);
        mary.showData();
    }
}
