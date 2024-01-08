package sample;

public class L2 {
    public static void main(String args[]) {
        // スレッドのインスタンスを作成して実行
        L thread1 = new L();
        L thread2 = new L();

       thread1.start();
       thread2.start();
    }
}
