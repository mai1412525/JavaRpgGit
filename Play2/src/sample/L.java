package sample;

class L extends Thread {
    public void run() {
        // スレッドで実行する処理
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }

}


