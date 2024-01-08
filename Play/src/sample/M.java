package sample;

import java.util.concurrent.CountDownLatch;

class SpaceObserver extends Thread {
    private volatile int space = 0;
    private final CountDownLatch latch;

    public SpaceObserver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        // 他のクラスの space 変数が1になるのを待機
        while (space != 1) {
            // 何もしないで待機
        }

        // space が1になったことを通知
        System.out.println("space が 1 になりました！");
        latch.countDown();
    }

    public void setSpace(int value) {
        this.space = value;
    }
}

public class M {
    private static final CountDownLatch latch = new CountDownLatch(1);

    public static void main(String[] args) {
        SpaceObserver observer = new SpaceObserver(latch);

        // スレッドを開始
        observer.start();

        // 他のクラスの space 変数が1になるまでの処理
        // 例として、10秒後に space 変数を1に設定すると仮定
        try {
            Thread.sleep(1000); // 10秒待機
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 他のクラスで space 変数を1に設定
        observer.setSpace(1);

        // space が1になるまで待機
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ここに次の処理を追加
        System.out.println("次の処理を実行します");
        SpaceObserver observer1 = new SpaceObserver(latch);

        // スレッドを開始
        observer1.start();

        // 他のクラスの space 変数が1になるまでの処理
        // 例として、10秒後に space 変数を1に設定すると仮定
        try {
            Thread.sleep(1000); // 10秒待機
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 他のクラスで space 変数を1に設定
        observer1.setSpace(1);

        // space が1になるまで待機
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("次の次の処理が開始されました");    }
}
