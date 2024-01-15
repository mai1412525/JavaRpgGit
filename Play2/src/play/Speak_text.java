package play;
public abstract class Speak_text{//親クラス
	boolean preese;
	Speak speak = new Speak();
	
	 public abstract void run();
	 abstract void preese();
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
		speak.S("123456789",20);
			}
	@Override
	void preese() {
		speak.preese();
	}
	void synchoronized(){
		
	}
}
class Epi2 extends Speak_text{
	@Override
	public void run() {
		preese = true;
		speak.S("はいがおされました", 30);
		speak.S("わーい", 30);
			}
	@Override
	void preese() {
		speak.preese();
	}
}
class Epi3 extends Speak_text{
	@Override
	public void run() {
		preese = true;
		speak.S("いいえがおされました", 30);
		speak.S("おーのー", 30);
			}
	@Override
	void preese() {
		speak.preese();
	}
}
class Epi4 extends Speak_text{
	@Override
	public void run() {
		preese = true;
		speak.S("Epi4", 30);
		speak.S("とりあえず進もう", 30);
			}
	@Override
	void preese() {
		speak.preese();
	}
}

