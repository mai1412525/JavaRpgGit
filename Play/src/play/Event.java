package play;

public class Event extends Thread {
	String name;
	int number=99;//選択肢の番号を一時保存
	int Ekirikae=0;//kirikaeの変数管理
	String[] flag2 = new String[10];//フラグ管理
	int space=0;
	int wait;
	int speak;
	
	select select = new select();
	Speak_text Epi = new Speak_text();
	
	public void prorogu() {
	System.out.println("Loading...");
	Speak.space=99;
	Ekirikae = 2;
	Epi.name();
	Ekirikae = 1;
	select.setSelect("いいえ,はい","この名前でいいですか?");
	System.out.println("あなたの名前を教えてください");
	Ekirikae = 2;
	Epi.Epi0(); 

		
	   	
	

	}
	public void mate() {
		while(wait!=0) {
			
		}
	}
	
	public void setSelectNumber (int num) {
		this.number = num;
		select.dispSelect(number);
		System.out.println(num+"を出力");
	}
	public int getEvent() {
		return Ekirikae;
	}
	public void setSpeak(int num) {
		space = 0;
		space = num;
		System.out.println(space+"ここきてる？");
	}
	public void selectDecision() {
		number = select.getNumber();
		System.out.println("あなたは"+number+"を押しました。");
	}
	public void run() {
		while(true) {
			if(Ekirikae==2) {
				if(space==1) {
					Speak.space = 1;
					System.out.println("スペース押された");
				}
			}
			System.out.print("");
		}
	}
	
	
	
	



}

