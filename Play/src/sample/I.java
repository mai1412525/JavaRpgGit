package sample;

public class I {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		bnm b = new bnm();
		b.start();
		b.a();
	}
}

class bnm extends Thread{
	int a = 1;
	public void run() {
		/*try {
			Thread.sleep(500);
		}catch (InterruptedException e) {
		}*/
		a();
	}
	synchronized void a() {
		try {
			Thread.sleep(500);
		}catch (InterruptedException e) {
		}
		for(int i = 0; i < 15; i++) {
			for(int n = 0; n < 15; n++) {
				if(a == 1) {
				System.out.print("■");
				}
				else {
					System.out.print("□");
				}
			}
			System.out.println();
		}
		a = 0;
	}
}