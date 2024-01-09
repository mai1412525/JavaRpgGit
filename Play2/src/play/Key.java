package play;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Key {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		KeyTestWindow gw = new KeyTestWindow("テストウィンドウ",0,0);
		gw.setVisible(true);
		
		for(int i = 0; i< 30; i++) {
			System.out.println();
		}
		
		sen sen = new sen();
		sen.taku(0);
	}

}

class KeyTestWindow extends JFrame implements KeyListener {
	String name = "";
	int flg = 0;			//0,sentaku		1,nyuuryoku
	int sentaku = 0;
	int gengo = 0;
	sen sen = new sen();
	public KeyTestWindow(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		//キー入力の有効化
		addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		while(true) {
			System.out.print("");
			int i = 0;
			if(i == 0) {
				
			}
			else {
				break;
			}
		}
		for(int i = 0; i< 30; i++) {
			System.out.println();
		}
		if(flg == 1) {
		switch (e.getKeyCode()) {/*
		case KeyEvent.VK_:
			name += "";
			break;*/
		case KeyEvent.VK_MINUS:
			name += "-";
			break;
		case KeyEvent.VK_A:
			name += "a";
			break;
		case KeyEvent.VK_B:
			name += "b";
			break;
		case KeyEvent.VK_C:
			name += "c";
			break;
		case KeyEvent.VK_D:
			name += "d";
			break;
		case KeyEvent.VK_E:
			name += "e";
			break;
		case KeyEvent.VK_F:
			name += "f";
			break;
		case KeyEvent.VK_G:
			name += "g";
			break;
		case KeyEvent.VK_H:
			name += "h";
			break;
		case KeyEvent.VK_I:
			name += "i";
			break;
		case KeyEvent.VK_J:
			name += "j";
			break;
		case KeyEvent.VK_K:
			name += "k";
			break;
		case KeyEvent.VK_L:
			name += "l";
			break;
		case KeyEvent.VK_M:
			name += "m";
			break;
		case KeyEvent.VK_N:
			name += "n";
			break;
		case KeyEvent.VK_O:
			name += "o";
			break;
		case KeyEvent.VK_P:
			name += "p";
			break;
		case KeyEvent.VK_Q:
			name += "q";
			break;
		case KeyEvent.VK_R:
			name += "r";
			break;
		case KeyEvent.VK_S:
			name += "s";
			break;
		case KeyEvent.VK_T:
			name += "t";
			break;
		case KeyEvent.VK_U:
			name += "u";
			break;
		case KeyEvent.VK_V:
			name += "v";
			break;
		case KeyEvent.VK_W:
			name += "w";
			break;
		case KeyEvent.VK_X:
			name += "x";
			break;
		case KeyEvent.VK_Y:
			name += "y";
			break;
		case KeyEvent.VK_Z:
			name += "z";
			break;
		case KeyEvent.VK_0:
			name += "0";
			break;
		case KeyEvent.VK_1:
			name += "1";
			break;
		case KeyEvent.VK_2:
			name += "2";
			break;
		case KeyEvent.VK_3:
			name += "3";
			break;
		case KeyEvent.VK_4:
			name += "4";
			break;
		case KeyEvent.VK_5:
			name += "5";
			break;
		case KeyEvent.VK_6:
			name += "6";
			break;
		case KeyEvent.VK_7:
			name += "7";
			break;
		case KeyEvent.VK_8:
			name += "8";
			break;
		case KeyEvent.VK_9:
			name += "9";
			break;
		case KeyEvent.VK_BACK_SPACE:
			if(name.length() > 0) {
				name = name.substring(0, name.length() - 1);
			}
			break;
		case KeyEvent.VK_ENTER:
			tu tu = new tu();
			for(int i = 0; i< 20; i++) {
				System.out.println();
			}
			tu.jk(name);
			flg = 2;
			return;
		case KeyEvent.VK_ESCAPE:
			flg = 0;
			name = "";
			sen sen = new sen();
			sen.taku(0);
			break;
		}
		}
		else if(flg == 0) {
			int j = 0;
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				if(sentaku > 0) {
					sentaku--;
				}
				sen.taku(sentaku);
				j = 1;
				break;
			case KeyEvent.VK_DOWN:
				if(sentaku < 1) {
					sentaku++;
				}
				sen.taku(sentaku);
				j = 1;
				break;
			case KeyEvent.VK_ENTER:
				if(sentaku == 0) {
					gengo = 0;
				}
				else if(sentaku == 1) {
					gengo = 1;
				}
				flg = 1;
				j = 1;
				return;
			}
			if(j == 0) {
				sen.taku(sentaku);
			}
		}
		if(gengo == 1) {
			syorisou sub = new syorisou();
			//System.out.println("w = " + w);
			if(name.endsWith("a") == true || name.endsWith("i") == true|| name.endsWith("u") == true|| name.endsWith("e") == true|| name.endsWith("o") == true) {
				if(name.length() > 2) {
					name = sub.tu(name);
					name = sub.sanmoji(name);
				}
				if(name.length() > 1) {
					name = sub.nimoji(name);
				}
				name = sub.boin(name);
			}
			String w = null;
			if(name.length() > 1) {
				w = name.substring(name.length() - 2,name.length() - 1);
			}
			if(name.length() > 1) {
				if(name.substring(name.length()- 2).equals("nn")) {
					name = sub.nn(name);
				}
				else if(w.equals("n")){
					
					name = sub.n(name);
				}
			}
		}
		if(flg == 1) {
			int kai = 20;
			int w = name.length() / kai;
			String[] ww = new String[w + 1];
			for(int i = 0; i < w + 1; i++) {
				if(i == w) {
					ww[i] = name.substring(i * kai, name.length());
				}
				else {
					ww[i] = name.substring(i * kai,i * kai + kai);
				}
			}
			for(int i = 0; i < ww.length; i++) {
				System.out.println(ww[i]);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
class tu{
	void jk(String name) {
		System.out.println(name + " って変な名前だな");
	}
}
class sen{
	String[] taku = {"a","あ"};
	void taku(int sentaku) {
		System.out.println("どっちで入力する？");
		for(int i = 0; i < taku.length; i++) {
			if(i == sentaku) {
				System.out.println("●" + taku[i]);
			}
			else {
				System.out.println("　" + taku[i]);
			}
		}
	}
}
class syorisou{
	String nn(String name) {
		name = name.substring(0,name.length() - 2);
		name += "ん";
		return name;
	}
	String n(String name) {
		String w = name.substring(name.length() - 1);
		name = name.substring(0,name.length() - 2);
		name += "ん";
		name += w;
		return name;
	}
	boolean han(String name) {
		boolean i = false;
		char c = name.charAt(name.length() - 2);
		if(!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
			i = true;
		}
		return i;
	}
	String boin(String name) {
		switch(name.substring(name.length() - 1)) {
		case "a":
			name = name.substring(0,name.length() - 1);
			name += "あ";
			break;
		case "i":
			name = name.substring(0,name.length() - 1);
			name += "い";
			break;
		case "u":
			name = name.substring(0,name.length() - 1);
			name += "う";
			break;
		case "e":
			name = name.substring(0,name.length() - 1);
			name += "え";
			break;
		case "o":
			name = name.substring(0,name.length() - 1);
			name += "お";
			break;
		}
		return name;
	}
	String tu(String name) {
		if(han(name) == false) {
		if(name.charAt(name.length() - 3) == name.charAt(name.length() - 2)) {
			String w = name.substring(name.length() - 2);
			name = name.substring(0,name.length() - 3);
			name += "っ";
			name += w;
		}
		}
		return name;
	}
	String sanmoji(String name) {
		switch(name.substring(name.length() - 3)) {/*
		case "":
			name = name.substring(0,name.length() - 3);
			name += "";
			break;*/
		case "xya":
			name = name.substring(0,name.length() - 3);
			name += "ゃ";
			break;
		case "lya":
			name = name.substring(0,name.length() - 3);
			name += "ゃ";
			break;
		case "xyu":
			name = name.substring(0,name.length() - 3);
			name += "ゅ";
			break;
		case "lyu":
			name = name.substring(0,name.length() - 3);
			name += "ゅ";
			break;
		case "xyo":
			name = name.substring(0,name.length() - 3);
			name += "ょ";
			break;
		case "lyo":
			name = name.substring(0,name.length() - 3);
			name += "ょ";
			break;
		case "chi":
			name = name.substring(0,name.length() - 3);
			name += "ち";
			break;
		case "kya":
			name = name.substring(0,name.length() - 3);
			name += "きゃ";
			break;
		case "kyu":
			name = name.substring(0,name.length() - 3);
			name += "きゅ";
			break;
		case "kyo":
			name = name.substring(0,name.length() - 3);
			name += "きょ";
			break;
		case "sya":
			name = name.substring(0,name.length() - 3);
			name += "しゃ";
			break;
		case "sha":
			name = name.substring(0,name.length() - 3);
			name += "しゃ";
			break;
		case "syu":
			name = name.substring(0,name.length() - 3);
			name += "しゅ";
			break;
		case "shu":
			name = name.substring(0,name.length() - 3);
			name += "しゅ";
			break;
		case "syo":
			name = name.substring(0,name.length() - 3);
			name += "しょ";
			break;
		case "sho":
			name = name.substring(0,name.length() - 3);
			name += "しょ";
			break;
		case "tya":
			name = name.substring(0,name.length() - 3);
			name += "ちゃ";
			break;
		case "cha":
			name = name.substring(0,name.length() - 3);
			name += "ちゃ";
			break;
		case "tyu":
			name = name.substring(0,name.length() - 3);
			name += "ちゅ";
			break;
		case "chu":
			name = name.substring(0,name.length() - 3);
			name += "ちゅ";
			break;
		case "tyo":
			name = name.substring(0,name.length() - 3);
			name += "ちょ";
			break;
		case "cho":
			name = name.substring(0,name.length() - 3);
			name += "ちょ";
			break;
		case "nya":
			name = name.substring(0,name.length() - 3);
			name += "にゃ";
			break;
		case "nyu":
			name = name.substring(0,name.length() - 3);
			name += "にゅ";
			break;
		case "nyo":
			name = name.substring(0,name.length() - 3);
			name += "にょ";
			break;
		case "hya":
			name = name.substring(0,name.length() - 3);
			name += "ひゃ";
			break;
		case "hyu":
			name = name.substring(0,name.length() - 3);
			name += "ひゅ";
			break;
		case "hyo":
			name = name.substring(0,name.length() - 3);
			name += "ひょ";
			break;
		case "mya":
			name = name.substring(0,name.length() - 3);
			name += "みゃ";
			break;
		case "myu":
			name = name.substring(0,name.length() - 3);
			name += "みゅ";
			break;
		case "myo":
			name = name.substring(0,name.length() - 3);
			name += "みょ";
			break;
		case "rya":
			name = name.substring(0,name.length() - 3);
			name += "りゅ";
			break;
		case "ryo":
			name = name.substring(0,name.length() - 3);
			name += "りょ";
			break;
		case "gya":
			name = name.substring(0,name.length() - 3);
			name += "ぎゃ";
			break;
		case "gyu":
			name = name.substring(0,name.length() - 3);
			name += "ぎゅ";
			break;
		case "gyo":
			name = name.substring(0,name.length() - 3);
			name += "ぎょ";
			break;
		case "zya":
			name = name.substring(0,name.length() - 3);
			name += "じゃ";
			break;
		case "zyu":
			name = name.substring(0,name.length() - 3);
			name += "じゅ";
			break;
		case "zyo":
			name = name.substring(0,name.length() - 3);
			name += "じょ";
			break;
		case "dya":
			name = name.substring(0,name.length() - 3);
			name += "ぢゃ";
			break;
		case "dhi":
			name = name.substring(0,name.length() - 3);
			name += "でぃ";
			break;
		case "dhu":
			name = name.substring(0,name.length() - 3);
			name += "でゅ";
			break;
		case "dwu":
			name = name.substring(0,name.length() - 3);
			name += "どぅ";
			break;
		case "bya":
			name = name.substring(0,name.length() - 3);
			name += "びゃ";
			break;
		case "byu":
			name = name.substring(0,name.length() - 3);
			name += "びゅ";
			break;
		case "byo":
			name = name.substring(0,name.length() - 3);
			name += "びょ";
			break;
		case "pya":
			name = name.substring(0,name.length() - 3);
			name += "ぴゃ";
			break;
		case "pyu":
			name = name.substring(0,name.length() - 3);
			name += "ぴゅ";
			break;
		case "pyo":
			name = name.substring(0,name.length() - 3);
			name += "ぴょ";
			break;
		case "wha":
			name = name.substring(0,name.length() - 3);
			name += "うぁ";
			break;
		case "who":
			name = name.substring(0,name.length() - 3);
			name += "うぉ";
			break;
		case "sye":
			name = name.substring(0,name.length() - 3);
			name += "しぇ";
			break;
		case "she":
			name = name.substring(0,name.length() - 3);
			name += "しぇ";
			break;
		case "tye":
			name = name.substring(0,name.length() - 3);
			name += "ちぇ";
			break;
		case "che":
			name = name.substring(0,name.length() - 3);
			name += "ちぇ";
			break;
		case "tsa":
			name = name.substring(0,name.length() - 3);
			name += "つぁ";
			break;
		case "tse":
			name = name.substring(0,name.length() - 3);
			name += "つぇ";
			break;
		case "tso":
			name = name.substring(0,name.length() - 3);
			name += "つぉ";
			break;
		case "thi":
			name = name.substring(0,name.length() - 3);
			name += "てぃ";
			break;
		case "twu":
			name = name.substring(0,name.length() - 3);
			name += "とぅ";
			break;
		}
		return name;
	}
	String nimoji(String name) {
		switch(name.substring(name.length() - 2)) {/*
		case "":
			name = name.substring(0,name.length() - 2);
			name += "";
			break;*/
		case "xa":
			name = name.substring(0,name.length() - 2);
			name += "ぁ";
			break;
		case "la":
			name = name.substring(0,name.length() - 2);
			name += "ぁ";
			break;
		case "xi":
			name = name.substring(0,name.length() - 2);
			name += "ぃ";
			break;
		case "li":
			name = name.substring(0,name.length() - 2);
			name += "ぃ";
			break;
		case "xu":
			name = name.substring(0,name.length() - 2);
			name += "ぅ";
			break;
		case "lu":
			name = name.substring(0,name.length() - 2);
			name += "ぅ";
			break;
		case "xe":
			name = name.substring(0,name.length() - 2);
			name += "ぇ";
			break;
		case "le":
			name = name.substring(0,name.length() - 2);
			name += "ぇ";
			break;
		case "xo":
			name = name.substring(0,name.length() - 2);
			name += "ぉ";
			break;
		case "lo":
			name = name.substring(0,name.length() - 2);
			name += "ぉ";
			break;
		case "ka":
			name = name.substring(0,name.length() - 2);
			name += "か";
			break;
		case "ki":
			name = name.substring(0,name.length() - 2);
			name += "き";
			break;
		case "ku":
			name = name.substring(0,name.length() - 2);
			name += "く";
			break;
		case "ke":
			name = name.substring(0,name.length() - 2);
			name += "け";
			break;
		case "ko":
			name = name.substring(0,name.length() - 2);
			name += "こ";
			break;
		case "sa":
			name = name.substring(0,name.length() - 2);
			name += "さ";
			break;
		case "si":
			name = name.substring(0,name.length() - 2);
			name += "し";
			break;
		case "su":
			name = name.substring(0,name.length() - 2);
			name += "す";
			break;
		case "se":
			name = name.substring(0,name.length() - 2);
			name += "せ";
			break;
		case "so":
			name = name.substring(0,name.length() - 2);
			name += "そ";
			break;
		case "ta":
			name = name.substring(0,name.length() - 2);
			name += "た";
			break;
		case "ti":
			name = name.substring(0,name.length() - 2);
			name += "ち";
			break;
		case "tu":
			name = name.substring(0,name.length() - 2);
			name += "つ";
			break;
		case "te":
			name = name.substring(0,name.length() - 2);
			name += "て";
			break;
		case "to":
			name = name.substring(0,name.length() - 2);
			name += "と";
			break;
		case "na":
			name = name.substring(0,name.length() - 2);
			name += "な";
			break;
		case "ni":
			name = name.substring(0,name.length() - 2);
			name += "に";
			break;
		case "nu":
			name = name.substring(0,name.length() - 2);
			name += "ぬ";
			break;
		case "ne":
			name = name.substring(0,name.length() - 2);
			name += "ね";
			break;
		case "no":
			name = name.substring(0,name.length() - 2);
			name += "の";
			break;
		case "ha":
			name = name.substring(0,name.length() - 2);
			name += "は";
			break;
		case "hi":
			name = name.substring(0,name.length() - 2);
			name += "ひ";
			break;
		case "hu":
			name = name.substring(0,name.length() - 2);
			name += "ふ";
			break;
		case "fu":
			name = name.substring(0,name.length() - 2);
			name += "ふ";
			break;
		case "he":
			name = name.substring(0,name.length() - 2);
			name += "へ";
			break;
		case "ho":
			name = name.substring(0,name.length() - 2);
			name += "ほ";
			break;
		case "ma":
			name = name.substring(0,name.length() - 2);
			name += "ま";
			break;
		case "mi":
			name = name.substring(0,name.length() - 2);
			name += "み";
			break;
		case "mu":
			name = name.substring(0,name.length() - 2);
			name += "む";
			break;
		case "me":
			name = name.substring(0,name.length() - 2);
			name += "め";
			break;
		case "mo":
			name = name.substring(0,name.length() - 2);
			name += "も";
			break;
		case "ya":
			name = name.substring(0,name.length() - 2);
			name += "や";
			break;
		case "yu":
			name = name.substring(0,name.length() - 2);
			name += "ゆ";
			break;
		case "yo":
			name = name.substring(0,name.length() - 2);
			name += "よ";
			break;
		case "ra":
			name = name.substring(0,name.length() - 2);
			name += "ら";
			break;
		case "ri":
			name = name.substring(0,name.length() - 2);
			name += "り";
			break;
		case "ru":
			name = name.substring(0,name.length() - 2);
			name += "る";
			break;
		case "re":
			name = name.substring(0,name.length() - 2);
			name += "れ";
			break;
		case "ro":
			name = name.substring(0,name.length() - 2);
			name += "ろ";
			break;
		case "wa":
			name = name.substring(0,name.length() - 2);
			name += "わ";
			break;
		case "wo":
			name = name.substring(0,name.length() - 2);
			name += "を";
			break;
		case "ga":
			name = name.substring(0,name.length() - 2);
			name += "が";
			break;
		case "gi":
			name = name.substring(0,name.length() - 2);
			name += "ぎ";
			break;
		case "gu":
			name = name.substring(0,name.length() - 2);
			name += "ぐ";
			break;
		case "ge":
			name = name.substring(0,name.length() - 2);
			name += "げ";
			break;
		case "go":
			name = name.substring(0,name.length() - 2);
			name += "ご";
			break;
		case "za":
			name = name.substring(0,name.length() - 2);
			name += "ざ";
			break;
		case "zi":
			name = name.substring(0,name.length() - 2);
			name += "じ";
			break;
		case "ji":
			name = name.substring(0,name.length() - 2);
			name += "じ";
			break;
		case "zu":
			name = name.substring(0,name.length() - 2);
			name += "ず";
			break;
		case "ze":
			name = name.substring(0,name.length() - 2);
			name += "ぜ";
			break;
		case "zo":
			name = name.substring(0,name.length() - 2);
			name += "ぞ";
			break;
		case "da":
			name = name.substring(0,name.length() - 2);
			name += "だ";
			break;
		case "di":
			name = name.substring(0,name.length() - 2);
			name += "ぢ";
			break;
		case "du":
			name = name.substring(0,name.length() - 2);
			name += "づ";
			break;
		case "de":
			name = name.substring(0,name.length() - 2);
			name += "で";
			break;
		case "do":
			name = name.substring(0,name.length() - 2);
			name += "ど";
			break;
		case "ba":
			name = name.substring(0,name.length() - 2);
			name += "ば";
			break;
		case "bi":
			name = name.substring(0,name.length() - 2);
			name += "び";
			break;
		case "bu":
			name = name.substring(0,name.length() - 2);
			name += "ぶ";
			break;
		case "be":
			name = name.substring(0,name.length() - 2);
			name += "べ";
			break;
		case "bo":
			name = name.substring(0,name.length() - 2);
			name += "ぼ";
			break;
		case "ja":
			name = name.substring(0,name.length() - 2);
			name += "じゃ";
			break;
		case "ju":
			name = name.substring(0,name.length() - 2);
			name += "じゅ";
			break;
		case "je":
			name = name.substring(0,name.length() - 2);
			name += "じぇ";
			break;
		case "jo":
			name = name.substring(0,name.length() - 2);
			name += "じょ";
			break;
		case "ye":
			name = name.substring(0,name.length() - 2);
			name += "いぇ";
			break;
		case "wi":
			name = name.substring(0,name.length() - 2);
			name += "うぃ";
			break;
		case "we":
			name = name.substring(0,name.length() - 2);
			name += "うぇ";
			break;
		case "fa":
			name = name.substring(0,name.length() - 2);
			name += "ふぁ";
			break;
		case "fi":
			name = name.substring(0,name.length() - 2);
			name += "ふぃ";
			break;
		case "fe":
			name = name.substring(0,name.length() - 2);
			name += "ふぇ";
			break;
		case "fo":
			name = name.substring(0,name.length() - 2);
			name += "ふぉ";
			break;
		}
		return name;
	}
}