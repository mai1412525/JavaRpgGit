package play;
public class Speak_text extends Thread {
	private int number;
	boolean preese;
	String name;
	Speak speak = new Speak();
	public void setNameSelect(String name) {
	this.name = name;
	}
	
	 public void run() {
		
	}
	 
	 void preese() {
		
	}
	 
	 void waitProcessing() {
		 
	 }
	 public boolean getPreese() {
		 return preese;
	 }
}

class Epi0 extends Speak_text{
	@Override
	public void run() {
		preese = true;
		speak.S("Spaceキーを押すと次の会話に進みます。", 30);
		speak.S("女子生徒A「なんか最近怖いよねー」", 30);
		speak.S("女子生徒B「なにがー？」", 30);
		speak.S("女子生徒A「あれだよ、あれうわさ」", 30);
		speak.S("女子生徒B「なにそれぇ」", 100);
		speak.S("開発中...", 100);
		speak.S("ここからマップ移動が可能です", 100);
		preese = false;
			}
	@Override
	void preese() {
		speak.preese();
	}
}

class Epi1 extends Speak_text{
	public void run() {	
		speak.S("Epi1", 30);
		speak.S("123456789",1000);
			}
	@Override
	void preese() {
		speak.preese();
	}
	void synchoronized(){
		
	}
}

