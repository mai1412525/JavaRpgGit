package play;

import java.util.Random;

class Map556 extends MapMam{		//サンプル
	Random rand = new Random();
	int tate = 10;
	int yoko = 30;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {5,6,15,4};						//■の座標[縦][横]
	int[]ki = {3,3, 19,3, 20,3, 18,3};								//木の座標
	int[]zou = {5,15};
	int[]kuti = {-11,3,4, -12,11,12, -13,16,17, -14,24,25, -21,2,3, -31, -41};

	int[]jouhou = {-11,2,-31, -12,2,-32, -13,3,-31, -14,3,-32, -21,1,-41};
	int[]mituketa = new int [3];			//コピペ
	int[][]ivent = syougai;			//コピペ

	String name = "[廊下]";		//部屋の名前
	MapSyori syori = new MapSyori();			//コピペ


	public int[][] map(){			//まっぷでーた
		syori.sotowaku(syougai);	//さいしょに
		syori.jouh(syougai,ki,2);		//（syougai,[配列名],[uiの配列番号]）
		syori.jouh(syougai,kuromasu,1);
		syori.jouh(syougai,zou,4);
		syori.kuti(syougai, kuti);	//さいご

		return syougai;
	}
	public int[] getmapjouhou(int id) {
		syori.mapjouhou(id, jouhou, mituketa);
		return mituketa;
	}
	public String getname() {
		return name;
	}
	public int[][] ivent(){
		return ivent;
	}
}
