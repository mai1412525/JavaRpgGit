package play;

import java.util.Random;

public class sub {
	Random rand = new Random();

	static int map = 55;
	static int mmap = 0;
	static int heya = 0;

	static int[][]itiji;
	static String[][]ui;

	Map55 map55 = new Map55();
	Map56 map56 = new Map56();
	Kyousitu1 map45 = new Kyousitu1();
	Kyousitu2 map45a = new Kyousitu2();

	static int tekiy = 8,tekix = 8;
	static int teekix = -10,teekiy = -10;
	int teeki = 0;
	int syoumetu = 0;
	int syou = 1;				//syou + 1までマップ移動
	String[] uiui = {"□","■","木","机","像","◆","汎"};


	public void syougai() {
		if(map == 145) {
			itiji = map45a.map56();
			ui = new String[itiji.length][itiji[1].length];
		}
		else {
		if(map == 55) {
			itiji = map55.map55();
			ui = new String[itiji.length][itiji[1].length];
		}
		if(map == 56) {
			itiji = map56.map56();
			ui = new String[itiji.length][itiji[1].length];
		}
		if(map == 45) {
			itiji = map45.map56();
			ui = new String[itiji.length][itiji[1].length];
		}
		}
	}
	void mapna() {
		if(map == 145) {
			System.out.println(map45a.getname());
		}
		if(map == 55) {
			System.out.println(map55.getname());
		}
		if(map == 56) {
			System.out.println(map56.getname());
		}
		if(map == 45) {
			System.out.println(map45.getname());
		}
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
					ui[n][j] = "●";
				}
				if(tekiy == n && tekix == j) {
					ui[n][j] = "敵";
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
		for(int n = 0;n < ui.length; n++) {
			for(int j = 0; j < ui[n].length; j++) {
				System.out.print(itiji[n][j]);
			}
			System.out.println();
		}
	}

	public void tekiidou() {
		/*teki[tekiy][tekix] = null;
		tekix --;
		teki[tekiy][tekix] = "敵";*/
		if(teeki == 1) {
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
		}
		if(teeki == 0) {
			int fd = rand.nextInt(2);
			if(rand.nextInt(2) != 0) {
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
			if(jikiy == tekiy && jikix == tekix) {
				dispz();
				System.out.println("GG");
				System.exit(0);
			}
		}
		else {
			teeki--;
		}
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
		return kirikae;
	}
	int kirikae = 0;
	syoji syoji = new syoji();
	//Sentaku sentaku = new Sentaku();
	
	void idousyori(int jikiya,int jikixa) {					//jikiya,jikixa 一歩前の座標
		if(jikiya == tekiy && jikixa == tekix) {			//敵と重なった時の処理
			dispz();
			System.out.println("GG");
			System.exit(0);
		}
		if(jikiya < 0 || jikixa < 0 || jikiya >= itiji.length || jikixa >= itiji[jikiy].length) {		//マップ移動するとき
			mapidou();
			dispz();
		}
		else if(itiji[jikiya][jikixa] == 3) {						//一歩前が調べるイベントがあるとき
			int ne = rand.nextInt(3);
			if(ne == 0) {
				System.out.println("カッターで切り付けられたぼろぼろの机だ");
			}
			else if(ne == 1) {
				System.out.println("ただの机だ");
			}
			else if(ne == 2) {
				System.out.println("きちんと整理された綺麗な机だ");
			}
		}
		else if(itiji[jikiya][jikixa] == 4) {
			if(tekiy == -1 && tekix == -1) {
				System.out.println("ゴゴゴゴゴゴゴゴ");
				syoumetu = syou - 1;
				tekiy = 8;
				tekix = 8;
				teekiy = tekiy;
				teekix = tekix;
			}
			else {
				System.out.println("ただの石像だ");
			}
		}
		else if(itiji[jikiya][jikixa] == 5) {
			/*if(syoji.getmoti()[0] == 0) {
				System.out.println("鍵がかかった扉だ");
			}
			else if(syoji.getmoti()[0] == 1) {
				System.out.println("鍵を使いますか？");
				String[] i= {"はい","いいえ"};
				sentaku.sentaku(0,i);
				kirikae = 1;
			}*/
		}
		else if(itiji[jikiya][jikixa] == 6) {
			/*if(syoji.motiflg[0] == 1) {
				System.out.println("鍵がある。拾いますか？");
				String[] i= {"はい","いいえ"};
				.sentaku(0,i);
				kirikae = 1;
				
			}*/
		}
		else if(itiji[jikiya][jikixa] > 0) {
			
		}
		else if(itiji[jikiya][jikixa] <= 0){					//普通の移動
			jikiy = jikiya;
			jikix = jikixa;
			tekiidou();
			dispz();
		}
	}
	void mapidou() {
		if(map == 55) {
			wap(map55.getmapjouhou(itiji[jikiy][jikix]),map55.gethantei());
		}
		else if(map == 56) {
			wap(map56.getmapjouhou(itiji[jikiy][jikix]),map56.gethantei());
		}
		else if(map == 45) {
			wap(map45.getmapjouhou(itiji[jikiy][jikix]),map45.gethantei());
		}
		else if(map == 145) {
			wap(map45a.getmapjouhou(itiji[jikiy][jikix]),map45a.gethantei());
		}
	}
	void wap(int[]jou,boolean han) {
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
					teeki = 5;
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

class slep extends Thread{
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
		}*/
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
/*class jikan extends Thread{
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