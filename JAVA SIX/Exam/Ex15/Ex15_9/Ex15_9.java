package Exam.Ex15.Ex15_9;

// Pig 類別實現 Runnable 介面，表示小豬的行動
class Pig implements Runnable {
    public void run() {
        System.out.println("小豬看到大野狼在爬煙囪");
        System.out.println("就在壁爐上煮了一鍋水");
        try {
            // 每隔 2 分鐘打印一次，共 10 分鐘
            for (int i = 2; i <= 10; i += 2) {
                Thread.sleep(2000); // 每次休眠 2 分鐘
                System.out.println(i + " 分鐘");
            }
            System.out.println("一鍋煮沸的熱水煮好了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Wolf 類別實現 Runnable 介面，表示大野狼的行動
class Wolf implements Runnable {
    public void run() {
        System.out.println("大野狼對著第三隻小豬的房子吹氣");
        System.out.println("他不停地吹氣又吹氣");
        System.out.println("還是不能把房子吹倒");
        System.out.println("大野狼非常的生氣");
        System.out.println("牠決定要從煙囪爬進小豬的家裡");
        try {
            // 每隔 3 分鐘打印一次，共 15 分鐘
            for (int i = 3; i <= 15; i += 3) {
                Thread.sleep(3000); // 每次休眠 3 分鐘
                System.out.println(i + " 分鐘");
                System.out.println("大野狼爬得更高了");
            }
            System.out.println("大野狼從煙囪掉了下來");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// 主類別 Ex15_9
public class Ex15_9 {
    public static void main(String[] args) {
        Pig pigTask = new Pig();
        Wolf wolfTask = new Wolf();

        Thread pigThread = new Thread(pigTask);
        Thread wolfThread = new Thread(wolfTask);

        // 啟動 Pig 和 Wolf 執行緒
        pigThread.start();
        wolfThread.start();

        try {
            // 等待 Pig 執行緒完成
            pigThread.join();
            // 等待 Wolf 執行緒完成
            wolfThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 打印故事結尾
        System.out.println("大野狼掉進鍋裡淹死了");
    }
}
