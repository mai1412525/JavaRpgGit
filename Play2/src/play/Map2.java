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
class rikajunbishitu extends MapMam{
	int tate = 14;
	int yoko = 15;
	int[][]syougai = new int[tate][yoko];
	int[]kuromasu = {3,3,4,3,5,3,6,3,7,3,8,3,9,3,4,5,4,6,4,7,4,8,4,9,3,11,4,11,5,11,6,11,7,11,8,11,9,11,7,6,7,7,7,8,8,6,8,7,8,8,
			9,6,9,7,9,8,11,2,11,3,12,2,12,3,11,11,11,12,12,11,12,12};
	int[]kuti = {-31,6,7,8};
	int[]jouhou = {};

	int[]mituketa = new int[3];
	int[][]ivent = new int[tate][yoko];
	int[]ikidomari = {13,6,13,7,13,8};
	int[]mokei = {1,13};

	String name = "理科室準備室";
	MapSyori syori = new MapSyori();
	
	{
		syori.jouh(ivent,ikidomari,-1);
		syori.jouh(ivent,mokei,1);
	}

	public int[][] map(){
		syori.sotowaku(syougai);
		syori.jouh(syougai,kuromasu,1);
		syori.kuti(syougai, kuti);
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
class rouka_joubu extends MapMam{
	int tate = 8;
	int yoko = 90;
	int[][]syougai = new int[tate][yoko];
	int[]kuromasu = {};
	int[]kuti = {-41,3,4,-12,1,2,-13,11,12,-14,26,27,-15,42,43,-16,59,60,-17,75,76,-21,4,5,-31,11,12,-32,22,23,-33,43,44,-34,61,62,-35,1,2,3,4,5,6,7,-35,71,72,73,74,75,76,77};
	int[]jouhou = {};
	int[]mituketa = new int[3];
	int[][]ivent = new int[tate][yoko];
	String name = "廊下";
	MapSyori syori = new MapSyori();

	public int[][] map(){
		syori.sotowaku(syougai);
		syori.jouh(syougai,kuromasu,1);
		syori.kuti(syougai, kuti);
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
