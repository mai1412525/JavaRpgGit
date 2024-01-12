package play;

import java.util.Random;

public class sub {
	Random rand = new Random();
	//tekima slep = new tekima();
	///thread thread = new Thread()
	//jkl jkl = new jkl();
	tek[] sleep = {new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek(),new tek()};
	static int slep = 0;

	static int map = 0;
	static int mmap = 0;
	static int heya = 0;

	static int[][]itiji;
	static String[][]ui;
	static int[][]ivent;

	MapMam[] mapman = {new Map55(),new Map56(),new Kyousitu1(),new Kyousitu2()};

	Map56 mapma = new Map56();
	
	MapEvent event = new MapEvent();
	MapEventUi evui = new MapEventUi();
	int iv;
	
	mot moti = new mot();
	
	static int tekiy = -1,tekix = -1;
	static int teekix = -10,teekiy = -10;
	int timez = 3;			//敵がマップ移動する回数　time = timez;
	int time = -1;
	String[] uiui = {"口","田","木","机","像","◆","汎"};
	String[] iventui = {"扉"};


	
	public void syougai() {
		itiji = mapman[map].map();
		ui = new String[itiji.length][itiji[1].length];
		ivent = mapman[map].ivent();
	}
	void mapna() {
		System.out.println(mapman[map].getname());
	}
static int jikiy = 1,jikix = 1;

	synchronized public void dispz() {				//4代目
		for(int n = 0; n < 100; n++) {
			System.out.println();
		}
		for(int n = 0;n < itiji.length; n++) {
			for(int j = 0; j < itiji[n].length; j++) {				///こけしさんのを使う
				if(itiji[n][j] >= 0) {
					ui[n][j] = uiui[itiji[n][j]];
				}
				else {
					ui[n][j] = uiui[0];
				}
				if(jikiy == n && jikix == j) {
					ui[n][j] = "〇";
				}
				if(tekiy == n && tekix == j) {
					ui[n][j] = "敵";
				}
				if(map == 1) {
					if(mapma.getana()[n][j] == 1) {
						ui[n][j] = "〇";
					}
				}
				if(ivent[n][j] != 0) {
					int w = evui.EventUi(map,ivent[n][j]);
					if(w != 999) {
						ui[n][j] = iventui[w];
					}
				}
			}
		}
		mapna();
		for(int n = 0;n < ui.length; n++) {
			for(int j = 0; j < ui[n].length; j++) {
				System.out.print(ui[n][j]);
			}
			System.out.println();
		}
		
		/*for(int n = 0;n < ui.length; n++) {			//デバック用
			for(int j = 0; j < ui[n].length; j++) {
				System.out.print(mapman[map].ivent()[n][j]);
			}
			System.out.println();
		}*/

		
		/*syoji.de();
		for(int i = 0; i < moti.getmoti().length; i++) {
			System.out.println(moti.getmoti()[i]);
		}
		System.out.println(mapman[map].ivent()[3][9]);*/
	}

	public void tekiidou() {
		/*if(teeki == 1) {
			if(syoumetu > syou) {
				tekix = -1;
				tekiy = -1;
				return;
			}
			if(teekiy != -10 && teekix != -10) {
				tekiy = teekiy;
				tekix = teekix;
				teekiy = -10;
				teekix = -10;
			}
			syoumetu++;
		}*/
		if(tekiy != -1 && tekix != -1){
			int fd = rand.nextInt(2);
			if(rand.nextInt(2) != 3) {
				int x,y;
				x = tekix - jikix;
				y = tekiy - jikiy;
				int tekimaex = tekix, tekimaey = tekiy;
				if(jikiy == tekiy && jikix == tekix) {

				}
				else {
					if(Math.abs(x) < Math.abs(y)) {				//自機と敵の縦と横の座標をそれぞれ比較し大きいほうに移動する
						if(y >= 0) {				//上
							if(itiji[tekiy - 1][tekix] <= 0) {
								tekiy --;
							}
						}
						else {				//下
							if(itiji[tekiy + 1][tekix] <= 0) {
								tekiy++;
							}
						}
						if(tekimaex == tekix && tekimaey == tekiy) {				//詰まったとき
							if(fd == 0 && tekix + 1< itiji.length) {			//右
								tekix++;
							}
							else if(fd == 1 && tekix - 1>= 0) {			//左
								tekix--;
							}
						}
					}
					else {
						if(x >= 0) {				//左
							if(itiji[tekiy][tekix - 1] <= 0) {
								tekix--;
							}
						}
						else {				//右
							if(itiji[tekiy][tekix + 1] <= 0) {
								tekix++;
							}
						}
						if(tekimaex == tekix && tekimaey == tekiy) {				//詰まったとき
							if(fd == 0 && tekiy - 1>= 0) {			//上
								tekiy --;
							}
							else if(fd == 0 && tekiy + 1 < itiji[1].length) {			//下
								tekiy++;
							}
						}
					}
				}
			}
			if(map == 1) {
				if(mapma.getana()[tekiy][tekix] == 1){
					tekiy = -1;
					tekix = -1;
					System.out.println("敵が穴に落ちた");
				}
			}
			else if(jikiy == tekiy && jikix == tekix) {
				dispz();
				System.out.println("GG");
				System.exit(0);
			}
			dispz();
		}
		/*}
		else {
			teeki--;
		}*/
	}
	void syu() {
		tekiy = teekiy;
		tekix = teekix;
	}
	void setkirikae(int kiri) {
		kirikae = kiri;
	}
	public int idou(int l) {							//4代目
		switch(l) {
		case 1:
			idousyori(jikiy,jikix - 1);
			break;
		case 3:
			idousyori(jikiy,jikix + 1);
			break;
		case 5:
			idousyori(jikiy - 1,jikix);
			break;
		case 2:
			idousyori(jikiy + 1,jikix);
			break;
		}
		//sleep.start();
		//slep.start();
		return sira;
	}
	int kirikae = 0;
	syoji syoji = new syoji();
	static int sira = 0;
	Sentaku sentaku = new Sentaku();
	void idousyori(int jikiya,int jikixa) {					//jikiya,jikixa 一歩前の座標
		sira = 0;
		if(jikiya == tekiy && jikixa == tekix) {			//敵と重なった時の処理
			jikiy = jikiya;
			jikix = jikixa;
			dispz();
			System.out.println("GG");
			System.exit(0);
		}
		if(jikiya < 0 || jikixa < 0 || jikiya >= itiji.length || jikixa >= itiji[jikiy].length) {		//マップ移動するとき
			if(slep > 0) {
				sleep[slep - 1].interrupt();
			}
			if(slep > 0 && sleep[slep - 1].flg() == true) {
				time--;
			}
			if(time >= 0) {
				sleep[slep].start();
				slep++;
			}
			else {
				
			}
			mapidou();
			dispz();
		}
		else if(ivent[jikiya][jikixa] != 0) {
			iv = ivent[jikiya][jikixa];
			int w = event.ev(map,ivent[jikiya][jikixa]);
			if(w != 999) {
				mapman[map].oru(w,0);
				ivent = mapman[map].ivent();
			}
			if(w == 998) {
				sira = 3;
			}
			else {
				sira = 2;
			}
		}
		else if(itiji[jikiya][jikixa] == 4) {
			if(tekiy == -1 && tekix == -1) {
				System.out.println("ゴゴゴゴゴゴゴゴ▼");
				tekiy = 8;
				tekix = 8;
				teekiy = tekiy;
				teekix = tekix;
				sleep[slep].start();
				slep++;
				time = timez;
				//slep.start();
			}
			else {
				System.out.println("ただの石像だ▼");
			}
			sira = 2;
		}
		else if(itiji[jikiya][jikixa] > 0) {
			Siraberu siraberu = new Siraberu();
			sira = siraberu.siraberu(jikiya,jikixa);
		}
		else if(itiji[jikiya][jikixa] <= 0){					//普通の移動
			jikiy = jikiya;
			jikix = jikixa;
			//tekiidou();
			dispz();
		}
		if(sira == 1) {

		}
	}
	void pass(String name) {
		int w = event.pass(map,iv,name);
		if(w == 1) {
			mapman[map].oru(1, 0);
		}
	}
	void mapidou() {
		wap(mapman[map].getmapjouhou(itiji[jikiy][jikix]));
	}
	void wap(int[]jou) {
		map = jou[1];
		/*tekimap tekimap = new tekimap();
		tekimap.hikisu(map,han);
		tekimap.interrupt();
		tekimap.start();*/
		syougai();
		int n,j;
		for(n = 0; n < itiji.length; n++) {
			for(j = 0; j < itiji[n].length; j++) {
				if(itiji[n][j] == jou[2]) {
					jikiy = n;
					jikix = j;
					teekix = j;
					teekiy = n;
					tekix = - 1;
					tekiy = - 1;
					n = 999;
					break;
				}
			}
		}

	}
	void tansaku(int r ,int k) {
		for(int n = 0; n < itiji.length; n++) {
			for(int j = 0; j < itiji[n].length; j++) {
				if(itiji[n][j] == r) {
					itiji[n][j] = k;
				}
			}
		}
	}
}
class tekima extends Thread{
	static boolean sonzai = false;
	static boolean midou = false;
	public void run() {
		sub sub = new sub();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
			}
			if(midou == true) {
				midou = false;
				return;
			}
			sub.dispz();
			System.out.println("a");
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
				}
				if(sonzai == true) {
					sub.tekiidou();
					sub.dispz();
				}
				else {
					return;
				}
			}

	}
	void sonzai(boolean i) {
		sonzai = i;
	}
	void midou(boolean i) {
		midou = i;
	}
}
class jkl extends Thread{
	synchronized public void run() {
		sub sub = new sub();
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		sub.dispz();
	}
}
/*class sleep extends Thread{
	sub sub = new sub();
	synchronized public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
				return;
			}
			sub.tekiidou();
			sub.dispz();
		}
	}

}*/
/*class slep extends Thread{
	static int houkou,map;
	sub sub = new sub();
	String[][]teki;
	int tekiy,tekix;
	boolean han;
	static int maap,i;
	static int fur;

	static void maap(int maap) {
		map = maap;
	}
	public void hikisu (int maap,boolean ha) {
		//houkou = hikisu;
		map = maap;
		han = ha;
	}
	public void hikisu(int maap,String[][]a,int y,int x) {
		//houkou = hikisu;
		map = maap;
		teki = a;
		tekiy = x;
		tekix = y;
	}
	synchronized public void run() {								//排他処理保留、マップ移動と分ける
		/*jikan a = new jikan();								//マップ移動したら敵自動移動処理を止める
		a.start();
		maap = map;
		i = 0;
		while(true) {
			if(map != maap) {
				fur = 1;
				break;
			}
			if(i == 1) {
				fur = 0;
				break;
			}
			i = a.mod();
		}
		if(han == true) {
			maap = map;
			sub.dispz();
			while(han == true) {
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					break;
				}
				if(han != true) {
					break;
				}
					sub.tekiidou();
					sub.dispz();
			}
		}
	}
}
class jikan extends Thread{
	static int mo = 0;
	public void run(){
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
		}
		mo = 1;
	}
	public int mod() {
		return mo;
	}
}

class tekimap extends Thread{
	static int map,maap;
	boolean han;
	sub sub = new sub();
	Thread slep = new slep();

	public void hikisu(int mmap,boolean ha) {
		map = mmap;
		han = ha;
		start();
	}
	synchronized public void run() {
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			return;
		}
		((play.slep) slep).hikisu(map,han);
		slep.start();
		slep.interrupt();

	}
}*/
