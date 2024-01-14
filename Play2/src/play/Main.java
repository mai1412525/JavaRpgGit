package play;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

class TestWindow extends JFrame implements KeyListener {

	TestWindow(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);

		//キー入力の有効化
		addKeyListener(this);
		/*sub.syougai();
		sub.tekiidou();*/
		Event.start();
	}
	int Mkirikae = 0;
	boolean select = false;//選択肢が何回も並列実行をしないようにするため用
	sub sub = new sub();
	Event Event = new Event();




@Override
public void keyTyped(KeyEvent e) {
	// TODO 自動生成されたメソッド・スタブ

}

@Override
public void keyPressed(KeyEvent e) {
	int i = 0;
	sub.syougai();
	
	// TODO 自動生成されたメソッド・スタブ
	//0がマップ、1が選択肢、2が会話文
	Mkirikae = Event.getEvent();
	if(Mkirikae==1 && select == false) {
		//Event.start();
		select = true;
		System.out.print("切り替わった");
	}
	//System.out.println("今のMain切り替え"+Mkirikae);
	switch (e.getKeyCode()) {
	case KeyEvent.VK_UP:
		if(Mkirikae == 0) {
			
			sub.idou(5);
			sub.dispz();
		}                                        
		else if(Mkirikae == 1) {
			if(i > 0) {
				i--;
			}
			kaigyou();
			Event.setSelectNumber(i);


			//senta.sentaku(i, takusi);
		}
		break;

	case KeyEvent.VK_DOWN:
		if(Mkirikae == 0) {
			sub.idou(2);
		}
		else if(Mkirikae == 1) {
				i++;
			kaigyou();
			Event.setSelectNumber(i);
		}
		break;

	case KeyEvent.VK_RIGHT:
		if(Mkirikae == 0) {
			sub.idou(3);
		}
		break;

	case KeyEvent.VK_LEFT:
		if(Mkirikae == 0) {
			sub.idou(1);
		}
		break;

	case KeyEvent.VK_SPACE:
		if(Mkirikae == 1) {
			System.out.println("選択肢決定押された");
			//Event.speakPreese();
			Event.selectDecision();
		}
		if(Mkirikae == 2) {
			//System.out.println("会話文決定された");
			Event.setSpeak();
		}
			/*if(takusi[i] == "はい") {
				syoji.setmotiflg(0);

			sub.tansaku(6,3);
			kirikae = 0;
			sub.setkirikae(kirikae);
			syoji.setmoti(0);
			sub.dispz();
		}*/
		break;
	}

}

void kaigyou() {
	for(int i=0;i<20;i++) {
		System.out.println("");
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO 自動生成されたメソッド・スタブ

}

}

