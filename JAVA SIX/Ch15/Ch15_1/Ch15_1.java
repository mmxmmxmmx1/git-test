//Ch15_1 ,單一執行緒的範例  ,使用數字極大的for來展示單執行緒時會拖慢多久
package Ch15.Ch15_1;

class CTest {
    private String id;

    public CTest(String str) {
        id = str;
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10000; j++) {
                System.out.println(id + " is running....");
            }
        }
    }
}

public class Ch15_1 {
    public static void main(String[] args) {
        CTest dog = new CTest("doggy");
        CTest cat = new CTest("kitty");
        dog.run();
        cat.run();
    }
}