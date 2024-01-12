package play;

public class Event extends Thread {
	String name;
	int number=99;//選択肢の番号を一時保存
	int Ekirikae=0;//kirikaeの変数管理
	String[] flag2 = new String[10];//フラグ管理

	select select = new select();
	Speak_text Epi = new Speak_text();

	public void prorogu() {
		Ekirikae = 2;
		Epi.start();
		
	}

	public void setSelectNumber (int num) {
		this.number = num;
		select.dispSelect(number);
		System.out.println(num+"を出力");
	}
	public int getEvent() {
		return Ekirikae;
	}
	public void selectDecision() {
		number = select.getNumber();
		notify();//処理スタート
		System.out.println("あなたは"+number+"を押しました。");
	}
	public void run() {//並列処理
			System.out.print("");
	}
	void rp() {//すべての処理が終わるまでループ
		synchronized(this) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
			return;
		}
	}
	synchronized void preese() {
		notify();
	}
	public void setSpeak() {//Event処理をすすめる
		Epi.preese();
	}

}

