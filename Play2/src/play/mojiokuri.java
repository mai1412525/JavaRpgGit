package play;

public class mojiokuri{
	void s(String moji) {
		String[] strArray = new String[moji.length()];
		for(int i=0;i<moji.length();i++) {
			strArray[i]=String.valueOf(moji.charAt(i));
		}
		for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("▼");
		rp();
	}
	void rp() {
		synchronized(this) {
			uio uio = new uio();
			uio.start();
			System.out.println("a");
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		return;
	}
	synchronized void presse() {		//キーが押されたときV2経由で処理される
		notify();
	}
}
class uio extends Thread{
	static ObSpace gw = new ObSpace("テストウィンドウ",0,0);
	public synchronized void run() {
		gw.setVisible(true);
	}
	void fa() {
		gw.setVisible(false);
	}
}