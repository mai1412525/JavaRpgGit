package play;
public class Speak_text extends Thread {
	String name;
	int space;
	Speak speak = new Speak();
	public void Epi0() {
		speak.S("Spaceキーを押すと次の会話に進みます。", 30);
		speak.S("女子生徒A「なんか最近怖いよねー」", 30);
		speak.S("女子生徒B「なにがー？」", 30);
		speak.S("女子生徒A「あれだよ、あれうわさ」", 30);
		speak.S("女子生徒B「なにそれぇ」", 100);
		speak.S("開発中...", 100);
		speak.S("ここからマップ移動が可能です", 100);

	}
	public void Epi1() {

	}
	public void setNameSelect(String name) {
	this.name = name;
	}
	public void run() {
		Epi0();
	}
	void preese() {
		speak.preese();
	}
}
