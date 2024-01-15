package play;

public class Event extends Thread {
	String name;
	int number=99;//選択肢の番号を一時保存
	int Ekirikae=0;//kirikaeの変数管理
	String[] flag2 = new String[10];//フラグ管理

	select select = new select();
	Speak_text[] Epi =  {new Epi0(), new Epi1() ,new Epi2(),new Epi3() ,new Epi4()};


	public int getEvent() {
		return Ekirikae;
	}
	public void setkirikae(int i) {
		Ekirikae = i;
	}

	public void run() {//並列処理
		Ekirikae = 2;
		Epi[0].run();
		Epi[1].run();
		Ekirikae = 1;
		select.setSelect("はい,いいえ","テスト");
		Ekirikae = 2;
		if(number == 0) {
			Epi[2].run();
		}
		else if(number == 1) {
			Epi[3].run();
		}
		Epi[4].run();
		Ekirikae = 0;

		}



	void rp() {//すべての処理が終わるまでループ
		for(int i=0;i<Epi.length;) {
			if(Epi[i].getPreese() == false) {
				break;
			}
			else {
				synchronized(this) {
					try {
						wait();
					}
					catch (InterruptedException e) {
					}
					return;
				}
			}
		}

	}
	//Speak(会話)
	public void setSpeak() {//Event処理をすすめる
		for(int i = 0; i<Epi.length;i++) {
			Epi[i].preese();
		}

	}
	//Select(選択肢)
	public void setSelectNumber (int num) {
		this.number = num;
		select.dispSelect(number);
		//System.out.println(num+"を出力");
	}

	public void selectDecision() {
		number = select.getNumber();
		//System.out.println("あなたは"+number+"を押しました。");
		select.selectPreese();
	}



}

