package sample;

import java.util.concurrent.CountDownLatch;

class SpaceObserver2 extends Thread {
    private volatile int space = 0;
    private final CountDownLatch latch;

    public SpaceObserver2(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        // spaceが1になるまで待機
        while (space != 1) {
            // 何もしないで待機
        }

        // spaceが1になったことを通知
        System.out.println("spaceが1になりました！");
        latch.countDown();
    }

    public void setSpace(int value) {
        this.space = value;
    }
}

public class N {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            // 新しいCountDownLatchを用意
            CountDownLatch latch = new CountDownLatch(1);

            SpaceObserver2 observer = new SpaceObserver2(latch);

            // スレッドを開始
            observer.start();

            // 他のクラスのspace変数が1になるまでの処理
            // 例として、10秒後にspace変数を1に設定すると仮定
            try {
                Thread.sleep(10000); // 10秒待機
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 他のクラスでspace変数を1に設定
            observer.setSpace(1);

            // spaceが1になるまで待機
            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 次の処理を実行
            System.out.println("次の処理を実行します");
        }
    }
}
