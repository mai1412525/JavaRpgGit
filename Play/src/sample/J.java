package sample;

public class J {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int f = 0;
		for(int n = 0; n < 19; n++) {
			jko t = new jko();
			t.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println();
			t.interrupt();
			f = 1;
		}
	}

}

class jko extends Thread{
	int i = 0;
	public void run() {
		while(i < 10) {
		try {
			Thread.sleep(500);
			i++;
		} catch (InterruptedException e) {
			return;
		}
		System.out.println(i);
		}
	}
}