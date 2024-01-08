package sample;

public class E {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  MultiThread mt = new MultiThread();
	        mt.start();

	        for (int i = 0; i < 3; i++) {
	            try {
	                Thread.sleep(1000);
	                System.out.println("スレッド1の" + (i + 1) + "度目の処理");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

}

	class MultiThread extends Thread {
	    public void run() {
	        for (int i = 0; i < 3; i++) {
	            try {
	                wait(1000);
	                System.out.println("スレッド2の" + (i + 1) + "度目の処理");
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    public void ru() {
	    	System.out.println("aaa");
	    }

	}
