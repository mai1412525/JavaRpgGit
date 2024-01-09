package sample;

public class V3{
	boolean key = false;
	void speak(int i) {
		System.out.println(i);
		rp();
	}
	void rp() {			//キーが押されるまでループ
		synchronized(this) {
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
