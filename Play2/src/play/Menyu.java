package play;

public class Menyu {
	mot moti = new mot();
	String[] menyu = {"持ち物","ステータス","セーブ","閉じる"};			//1
	int[] mmenyu = {2,3,0,-1};
	String[]motiall = {"紙切れ",""};
	String[] motimono;			                     //2
	int[] motialls = {0,1};
	int[] motimonos;
	String[] sute = {"琴音","紗月","もどる"};			//3
	int[] ssute = {0,0,1};
	
	int flg = -1;			//どのメニューか
	int sentaku = 0;			//選択肢のカーソル
	int kiri = 0;
	int setu = 0;			//説明が開いているかどうか
	
	String[] getmoti() {
		int j = 0;
		int a = 0;
		int[]momoti;
		momoti = moti.getmoti();
		for(int i = 0; i < momoti.length; i++) {
			if(momoti[i] == 1) {
				a++;
			}
		}
		motimono = new String[a + 1];
		for(int i = 0; i < momoti.length - 1; i++) {
			if(momoti[i] == 1) {
				motimono[j] = motiall[i];
				j++;
			}
		}
		motimono[j] = "とじる";
		return motimono;
	}
	int[] getmotis() {
		motimonos = new int[motimono.length];
		for(int i = 0; i < motimonos.length; i++) {
			motimonos[i] = 0;
		}
		motimonos[motimonos.length - 1] = 1;
		return motimonos;
	}
	String[] getsentakusi() {
		if(flg == 1) {
			return menyu;
		}
		else if(flg == 2) {
			return getmoti() ;
		}
		else if(flg == 3) {
			return sute;
		}
		return null;
	}
	int[] getsstentakusi() {
		if(flg == 1) {
			return mmenyu;
		}
		else if(flg == 2) {
			return getmotis();
		}
		else if(flg == 3) {
			return ssute;
		}
		return null;
	}
	void disp() {
		if(flg == -1) {
			flg = 1;
		}
		String[]data = getsentakusi();
		for(int n = 0; n < data.length; n++) {
			if(n == sentaku) {
				System.out.println("●" + data[n]);
			}
			else {
				System.out.println("　" + data[n]);
			}
		}
	}
	void vdisp() {
		for(int i = 0;i < 30; i++) {
			System.out.println();
		}
	}
	void psent() {
		if(sentaku < getsentakusi().length - 1) {
			sentaku++;
		}
	}
	void msent() {
		if(sentaku > 0) {
			sentaku--;
		}
	}
	
	int enter() {
		if(flg != -1) {
			if(setu == 0) {
				int w = flg;
				flg = getsstentakusi()[sentaku];
				if(flg == 0) {
					flg = w;
					setu();
					return 0;
				}
				else if(flg == -1) {
					sentaku = 0;
					vdisp();
					return -1;
				}
				else {
					setu = 0;
					sentaku = 0;
				}
			}
			else {
				setu = 0;
			}
		}
		else {
			flg = 1;
			return 1;
		}
		return 1;
	}
	int setua() {
		return setu;
	}
	
	void setu() {
		setu = 1;
		setumei(getsentakusi()[sentaku]);
	}
	
	void setumei(String w) {
		if(w.equals("紙切れ")) {
			System.out.println("[パスワードは'mellow']");
			System.out.println("と書かれている▼");
		}
		else if(w == "琴音") {
			System.out.println("なんでこんなとこに来ちゃったんだろう▼");
		}
		else if(w == "紗月") {
			System.out.println("この状況にわくわくしているようだ▼");
		}
		else if(w == "セーブ") {
			System.out.println("開発中…");
		}
	}
}
