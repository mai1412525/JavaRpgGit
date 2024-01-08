package sample;

public class H {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		slep a = new slep();
		a.start();
	}

}

class slep extends Thread{
	static int n = 0;
	public void au(int i) {
		n = i;
	}
	public void run(){
		au a = new au();
		a.start();
		while(n == 0) {
			n = a.ai();
			System.out.println(n);
		}
		System.out.println("a");
	}
}

class au extends Thread{
	static int y = 0;
	public int ai() {
		return y;
	}
	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		y = 9;
	}
}