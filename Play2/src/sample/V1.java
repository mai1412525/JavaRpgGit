package sample;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class V1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		VTestWindow gw = new VTestWindow("テストウィンドウ",0,0);
		gw.setVisible(true);
	}

}

class VTestWindow extends JFrame implements KeyListener {
	V2 v2 = new V2();
	public VTestWindow(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		
		//キー入力の有効化
		addKeyListener(this);
		v2.start();			//並列処理スタート
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		v2.presse();		//キーが押されたというのを送る（ｖ２経由で）
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}