package play;


public class Title {
	int load = 0;
	Speak speak = new Speak();
	
	void end() {
		speak.S("アプリを終了させます",30);
		System.exit(0);
	}
	void loaddisplay() {
		speak.S("開発中", 30);
		//speak.S("セーブしたときに表示されたコードを打ってください", 30);
	}
	void load(Key key) {
		load = Integer.valueOf(key.getname());
		System.out.println("load");
		  
	}

}
