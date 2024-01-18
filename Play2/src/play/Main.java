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
		sub.syougai();
	}
	int Mkirikae = 0;
	int i = 0;
	boolean select = false;//選択肢が何回も並列実行をしないようにするため用
	sub sub = new sub();
	Key key = new Key();
	Event Event = new Event();
	password pass = new password();
	Menyu menyu = new Menyu();
	Title title = new Title();

	tek tek = new tek();



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
	
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		
		
		// TODO 自動生成されたメソッド・スタブ
		Mkirikae = Event.getEvent();//0がマップ、1が選択肢、2が会話文、3が名前入力、4が調べる、5がパスワード、6がメニュー
		System.out.println("今のMain切り替え"+Mkirikae);
		if(Mkirikae == 0) {
			sub.dispz();
		}
		if(Mkirikae == 5) {
			int w = pass.key(e);
			sub.dispz();
			System.out.println("鍵がかかっている");
			System.out.println("パスワードを入力してください");
			System.out.println(pass.getname());
			if(w == 1) {
				sub.pass(pass.getname());
				Mkirikae = 4;
				Event.setkirikae(Mkirikae);
				pass.reset();
			}
			return;
		}
		if(Mkirikae == 3) {
			int w = key.key(e);
			Event.setkirikae(w);
			if(w == 2) {//returnでkirikaeが変更される
				Event.no();
				Event.setkey(key);
			}
			return;
		}
		if(Mkirikae == 7) {
			int w= Event.select.gettitleNumber();
			Event.select.setSelect("はじめる,セーブ,終わる","ここにタイトル");
			if(w == 0) {
				Event.no();
			}
			else if(w == 1) {
				title.loaddisplay();
				int a = key.key(e);
				Event.setkirikae(w);
				if(a == 2) {//returnでkirikaeが変更される
					Event.no();
					title.load(key);
				}
				return;
			}
			
			
			
		}
		switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				if(Mkirikae == 0) {
					int w = sub.idou(5);
					if(w == 2) {
						Mkirikae = 4;
						Event.setkirikae(Mkirikae);
					}
					else if(w == 3) {
						Mkirikae = 5;
						Event.setkirikae(Mkirikae);
					}
					sub.dispz();
				}                                        
				else if(Mkirikae == 1) {
					if(i > 0) {
						i--;
					}
					kaigyou();
					Event.setSelectNumber(i);

				}
				else if(Mkirikae == 6) {
					menyu.msent();
					sub.dispz();
					menyu.disp();
				}
				
				else if(Mkirikae == 7) {
					if(i > 0) {
						i--;
					}
					kaigyou();
					Event.setSelectNumber(i);
				}
				break;
		
			case KeyEvent.VK_DOWN:
				if(Mkirikae == 0) {
					int w = sub.idou(2);
					if(w == 2) {
						Mkirikae = 4;
						Event.setkirikae(Mkirikae);
					}
					else if(w == 3) {
						Mkirikae = 5;
						Event.setkirikae(Mkirikae);
					}
				}
				else if(Mkirikae == 1) {
					i++;
					kaigyou();
					Event.setSelectNumber(i);
				}
				else if(Mkirikae == 6) {
					menyu.psent();
					sub.dispz();
					menyu.disp();
				}
				else if(Mkirikae == 7) {
					i++;
					System.out.print(i);
					kaigyou();
					Event.setSelectNumber(i);
				}
				break;
		
			case KeyEvent.VK_RIGHT:
				if(Mkirikae == 0) {
					int w = sub.idou(3);
					if(w == 2) {
						Mkirikae = 4;
						Event.setkirikae(Mkirikae);
					}
					else if(w == 3) {
						Mkirikae = 5;
						Event.setkirikae(Mkirikae);
					}
				}
				break;
		
			case KeyEvent.VK_LEFT:
				if(Mkirikae == 0) {
					int w = sub.idou(1);
					if(w == 2) {
						Mkirikae = 4;
						Event.setkirikae(Mkirikae);
					}
					else if(w == 3) {
						Mkirikae = 5;
						Event.setkirikae(Mkirikae);
					}
				}
				break;
		
			case KeyEvent.VK_SPACE:
				if(Mkirikae == 1) {
					//System.out.println("選択肢決定押された");
					Event.selectDecision();
				}
				else if(Mkirikae == 2) {
					//System.out.println("会話文決定された");
					Event.setSpeak();
				}
				else if(Mkirikae == 4) {
					Mkirikae = 0;
					Event.setkirikae(Mkirikae);
					sub.dispz();
				}
				else if(Mkirikae == 0 && menyu.setua() == 0) {
					Mkirikae = 6;
					Event.setkirikae(Mkirikae);
					sub.dispz();
					menyu.disp();
				}
				else {
					int w = menyu.enter();
					if(w != 0) {
						sub.dispz();
					}
					if(w == 1) {
						Mkirikae = 6;
						Event.setkirikae(Mkirikae);
					}
					else if(w == -1) {
						Mkirikae = 0;
						Event.setkirikae(Mkirikae);
						sub.dispz();
					}
					if(w != 0 && w != -1) {
						menyu.disp();
					}
					
				}
				break;
		}
		tek.kiri(Mkirikae);
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

