package play;


public class Title {
	int load = 0;
	
	void end() {
		System.out.println("アプリを終了をします。");
		System.exit(0);
	}
	void loaddisplay() {
		System.out.println("ロードしたときに表示されたコードを入力してください。↓");
		//speak.S("セーブしたときに表示されたコードを打ってください", 30);
	}
	void load(Key key) {
		load = Integer.valueOf(key.getname());
		System.out.println("load");
		  
	}
	

}
