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
		sub.syougai();
		Event.start();
		Event.select.setSelect("はじめる,ロード,終わる","すくうもの",2);
	}
	int Mkirikae = 0;
	int i = 0;
	int m = 0;
	MainEvent main = new MainEvent();
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
		Mkirikae = Event.getEvent();//0がマップ、1が選択肢、2が会話文、3が名前入力、4が調べる、5がパスワード、6がメニュー、７がタイトル
		m = Event.getMaxNumber();
		//System.out.println("今のMain切り替え"+Mkirikae + "i "  + Event.getMaxNumber());
		if(MainEvent.item[1]==1 && MainEvent.epiSave[0]==0) {//Episodeここでアイテムフラグ検知
			Event.no();
			MainEvent.epiSave[0]=1;
		}
		
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
		if(Mkirikae == 7) { //タイトル表示
			int w = Event.select.getTitleNumber();
			Event.setkirikae(w);
			if(w == 0) {
				Event.no();
			}
			else if(w == 1) {
				Event.setkirikae(5);
				title.loaddisplay();
				
					int a = key.key(e);
					Event.setkirikae(a);
					System.out.print(a);    
					if(a == 3) {//returnでkirikaeが変更される
						System.out.println("ロード成功？");
						//Event.no();
						Event.setkey(key);
						pass.reset();
				}
					return;

			}
			else if(w == 2) {
				title.end();
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
					}
					else if(Mkirikae == 1) {
						if(m > 0) {
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
						if(m>i) {
							i++;
						}

						kaigyou();
						Event.setSelectNumber(i);
					}
					else if(Mkirikae == 6) {
						menyu.psent();
						sub.dispz();
						menyu.disp();
					}
					else if(Mkirikae == 7) {
						if(i<m) {
							i++;
						}
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
						Event.no();
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
					else if(Mkirikae == 0){
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
					else if(Mkirikae == 6){
						int i = menyu.enter();
						if(i != 0) {
							sub.dispz();
						}
						if(i == 1) {
							Mkirikae = 6;
						}
						else if(i == -1) {
							Mkirikae = 0;
							sub.dispz();
						}
						if(i != 0 && i != -1) {
							menyu.disp();
						}
						Event.setkirikae(Mkirikae);
					}
					else if(Mkirikae == 7) {
						Event.selectDecision();
						Event.select.getTitleNumber();
						

					}
					break;
					case KeyEvent.VK_ESCAPE:
						if(Mkirikae == 2) {
							System.out.println("スキップします");
							Event.skip();
						}
					break;
			}
			tek.kiri(Mkirikae);
			//System.out.println(Mkirikae);
			//System.out.println(Event.getEvent());
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

