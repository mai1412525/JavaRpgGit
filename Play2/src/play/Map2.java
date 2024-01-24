package play;

import java.util.Random;


import Kadaikennkyu.MapMam;

class Map556 extends MapMam{		//サンプル
	Random rand = new Random();
	int tate = 10;
	int yoko = 30;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {5,6,15,4};						//■の座標[縦][横]
	int[]ki = {3,3, 19,3, 20,3, 18,3};								//木の座標
	int[]zou = {5,15};
	int[]kuti = {-11,3,4, -12,11,12, -13,16,17, -14,24,25, -21,2,3, -31, -41};

	int[]jouhou = {-11,2,-31, -12,2,-32, -13,3,-31, -14,3,-32, -21,1,-41};		//int[]jouhou = {};　でコピペ
	int[]mituketa = new int [3];			//コピペ
	int[][]ivent = new int[tate][yoko];			//コピペ
	int[]tobira = {2,29,3,29};

	String name = "[廊下]";		//部屋の名前
	MapSyori syori = new MapSyori();			//コピペ

	{			//マップイベント
		syori.jouh(ivent, tobira, 1);
	}
	//uiの配列{"口","田","木","机","像","◆","汎"};
	public int[][] map(){			//まっぷでーた
		syori.sotowaku(syougai);	//さいしょに
		syori.jouh(syougai,ki,2);		//（syougai,[配列名],[uiの配列番号]）
		syori.jouh(syougai,kuromasu,1);
		syori.jouh(syougai,zou,4);
		syori.kuti(syougai, kuti);	//さいご

		return syougai;
	}
	public int[] getmapjouhou(int id) {		//↓コピペ
		syori.mapjouhou(id, jouhou, mituketa);
		return mituketa;
	}
	public String getname() {
		return name;
	}
	public int[][] ivent(){
		return ivent;
	}
	public void oru(int ii,int t) {
		for(int i = 0; i < ivent.length; i++) {
			for(int j = 0; j < ivent[1].length; j++) {
				if(ivent[i][j] == ii) {
					ivent[i][j] = t;
				}
			}
		}
	}
}
class rikashitu extends MapMam{
	int tate = 42;
	int yoko = 42;
	int[][]syougai = new int[tate][yoko];
	int[]kuromasu = {

	}
}
