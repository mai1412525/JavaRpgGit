package play;


class tek extends Thread{
	boolean flg = false;
	static int kirikae = 0;
	synchronized public void run() {
		sub sub = new sub();
		flg = false;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				return;
			}
			flg = true;
			sub.syu();
			if(kirikae == 0) {
				sub.dispz();
			}
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					return;
				}
				if(kirikae == 0) {
					sub.tekiidou();
				}
			}
			
	}
	boolean flg() {
		return flg;
	}
	void kiri(int kiri) {
		kirikae = kiri;
	}
}
