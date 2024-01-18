package play;

public class Event extends Thread {

	String name;
	int number=99;//選択肢の番号を一時保存
	String[] flag2 = new String[10];//フラグ管理

	int Ekirikae=0;//kirikae(モード)の変数管理
	static int[] flag = new int[8];//フラグ管理
	static int[] item =  new int[15];//アイテム管理

	Event(){//コンストラクタ(ここでEventフラグをすべて0にする)
		for(int i=0;i<flag.length;i++) {
			flag[i]= 0;
		}
		for(int i=0;i<item.length;i++) {
			item[i]= 0;
		}

	}

	
	select select = new select();
	Speak_text oya = new Speak_text();
	Speak_text OyaEpi = new Speak_text();
	Speak_text[] Epi =  {new Epi0(), new Epi1Yes() ,new Epi1No(),new Epi1_2(),new Epi1_2Yes()};


	public int getEvent() {
		return Ekirikae;
	}
	void setkirikae(int w) {
		Ekirikae = w;
	}

	public void run() {//並列処理
		System.out.println("名前を入力してください");
		Ekirikae = 3;
		rp();
		Ekirikae = 2;
		Epi[0].run();
		Ekirikae = 1;
		select.setSelect("本当のことをいう,嘘をつく","「「どうしよう...」」");
		Ekirikae = 2;
		if(number == 0) {
			Epi[1].run();
			flag[0] = 1;//教官問い掛けYes
		}
		else if(number == 1) {
			Epi[2].run();
			flag[0] = 0;//教官問い掛けNo
			item[0]=1;//部室のカギYes
		}
		Ekirikae = 1;
		select.setSelect("二手に分かれる,二手に分かれない","「「分かれたほういいのかな」」");
		Ekirikae = 2;
		if(number == 0) {
			Epi[4].run();
			flag[1] = 1;//二手に分かれるYes
		}
		else if(number == 1) {
			Epi[5].run();
			flag[0] = 0;//二手に分かれないNo
			item[0]=1;//部室のカギYes
		}


		Ekirikae = 0;

	}


	void rp() {//すべての処理が終わるまでループ
		synchronized(this) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
	}
	synchronized void no() {
		notify();
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


	//Key(名前入力)
	void setkey(Key key) {
		OyaEpi.setname(key.getname());
	}

}


