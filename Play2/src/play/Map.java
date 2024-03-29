package play;

import java.util.Random;

class Map55 extends MapMam{
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
	int[][]ivent = new int[tate][yoko];			//コピペ
	int[]tobira = {2,29,3,29};
	int[]ikidomari = {0,3,0,4,0,11,0,12,0,16,0,17,0,24,0,25};

	//boolean han = true;			//コピペ
	String name = "[廊下]";
	MapSyori syori = new MapSyori();			//コピペ

	{			//マップイベント
		syori.jouh(ivent, tobira, 1);
		syori.jouh(ivent,ikidomari,-1);
	}
	public int[][] map(){			//まっぷでーた
		syori.sotowaku(syougai);	//さいしょに
		syori.jouh(syougai,ki,2);
		syori.jouh(syougai,kuromasu,1);
		syori.jouh(syougai,zou,4);
		syori.kuti(syougai, kuti);

		return syougai;
	}
	public int[] getmapjouhou(int id) {
		syori.mapjouhou(id, jouhou, mituketa);
		return mituketa;
	}
	//public boolean gethantei() {
		//return han;
	//}
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

class Map56 extends MapMam {

	int tate = 20;
	int yoko = 20;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {};						//■の座標
	int[]ki = {};								//木の座標
	int[]tukue = {4,4,6,6,8,8,10,10};			//tukue
	int[]kutisita1 = {3,4};
	int[]kutisita2 = {11,12};
	int[]jouhou = {-41,0,-21};
	int[]kutihidari = {3,4};

	int[]kuti = {-11,-21, -31, -41,3,4};
	int[]mituketa = new int [3];
	int[][]ivent = new int[tate][yoko];
	int[][]ana = syougai;
	{
	ana[5][6] = 1;
	}

	boolean han = true;
	String name = "体育館";
	MapSyori syori = new MapSyori();

	public int[][] map(){
		syori.sotowaku(syougai);
		syori.jouh(syougai, ki,2);
		syori.jouh(syougai, kuromasu,1);
		syori.jouh(syougai, tukue,3);
		syori.kuti(syougai,kuti);

		return syougai;
	}
	public int[] getmapjouhou(int id) {
		syori.mapjouhou(id, jouhou, mituketa);
		return mituketa;
	}
	public boolean gethantei() {
		return han;
	}
	public String getname() {
		return name;
	}
	public int[][] ivent(){
		return ivent;
	}
	public int[][] getana(){
		return ana;
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

class Kyousitu1 extends MapMam {

	int tate = 10;
	int yoko = 15;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {};						//■の座標
	int[]ki = {};								//木の座標

	int[]kuti = {-11, -21, -31,3,4, -32,11,12, -41};
	int[]jouhou = {-31,0,-11, -32,0,-12};
	int[]mituketa = new int [3];
	int[]tukue = {3,3,3,6,3,9,6,3,6,6,6,9};

	int[][]ivent = new int[tate][yoko];
	int[]kami1 = {3,9};

	boolean han = false;
	String name = "1-1";
	MapSyori syori = new MapSyori();

	{
		syori.jouh(ivent,kami1,1);
	}

	public int[][]  map(){
		syori.sotowaku(syougai);
		syori.jouh(syougai, ki,2);
		syori.jouh(syougai, kuromasu,1);
		syori.jouh(syougai, tukue,3);
		syori.kuti(syougai,kuti);

		return syougai;
	}
	public int[] getmapjouhou(int id) {
		syori.mapjouhou(id, jouhou, mituketa);
		return mituketa;
}
	public boolean gethantei() {
		return han;
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

class Kyousitu2 extends MapMam {

	int tate = 10;
	int yoko = 15;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {};						//■の座標
	int[]ki = {3,3};								//木の座標
	int[]tukue = {};

	int[]kuti = {-11, -21, -31,3,4, -32,11,12, -41};
	int[]jouhou = {-31,0,-13, -32,0,-14};

	int[]mituketa = new int [3];
	int[][]ivent = new int[tate][yoko];

	boolean han = false;
	String name = "1-2";
	MapSyori syori = new MapSyori();

	public int[][]  map(){
		syori.sotowaku(syougai);
		syori.jouh(syougai, ki,2);
		syori.jouh(syougai, kuromasu,1);
		syori.jouh(syougai, tukue,3);
		syori.kuti(syougai,kuti);

		return syougai;
	}
	public int[] getmapjouhou(int id) {
		syori.mapjouhou(id, jouhou, mituketa);
		return mituketa;
	}
	public boolean gethantei() {
		return han;
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
class genkan extends MapMam{

	int tate = 22;
	int yoko = 32;
	int[][]syougai = new int[tate][yoko];
	int[] kuromasu = {8,1,8,2,8,3,8,4,9,4,10,4,11,4,12,4,13,4,14,4,15,4,16,4,17,4,17,5,17,6,17,7,17,8,17,9,17,10,
			17,11,17,12,18,12,19,12,20,12,20,19,19,19,18,19,17,19,17,20,17,21,17,22,17,23,17,24,17,25,17,26,17,28,
			16,28,15,28,14,28,13,28,12,28,11,28,10,28,9,28,8,28,8,29,8,30,8,31,
			9,7,10,7,11,7,12,7,13,7,14,7,
			9,10,10,10,11,10,12,10,13,10,14,10,
			9,21,10,21,11,21,12,21,13,21,14,21,
			9,24,10,24,11,24,12,24,13,24,14,24
			};
	int[]kuti = {-41,1,2,3,4,5,6,7, -21,1,2,3,4,5,6,7, -31,13,14,15,16,17,18};

	int[]jouhou = {};
	int[]mituketa = new int [3];			//コピペ
	int[][]ivent = new int[tate][yoko];			//コピペ

	String name = "[玄関]";
	MapSyori syori = new MapSyori();	//こぴぺ

	{

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
class kyousitu_1 extends MapMam {

	int tate = 26;
	int yoko = 24;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {3,9,3,10,3,11,3,12,3,13,3,14,
			4,9,4,10,4,11,4,12,4,13,4,14,
			10,3,10,6,10,9,10,12,10,15,10,18,10,21,
			13,3,13,6,13,9,13,12,13,15,13,18,13,21,
			17,3,17,6,17,9,17,12,17,15,17,18,17,21,
			20,3,20,6,20,9,20,12,20,15,20,18,20,21,
			22,1,22,2,22,3,
			23,1,23,2,23,3,
			24,1,24,3,
			25,1,25,2,25,3};	//■の座標

	int[]kuti = {-21,3,4,23,24};

	int[]jouhou = {};
	int[]mituketa = new int [3];			//コピペ
	int[][]ivent = syougai;			//コピペ

	String name = "[教室1]";
	MapSyori syori = new MapSyori();			//コピペ

	{
	}
	public int[][] map(){				//マップデータ
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
class PC extends MapMam {

	int tate = 16;
	int yoko = 19;
	int[][]syougai = new int[tate][yoko];
	int[] kuromasu = {1,1,1,2,1,3,1,4,1,5,1,6,1,7,1,8,1,9,1,10,1,11,1,12,1,13,1,14,1,15,
					2,1,
					6,4,7,4,8,4,9,4,10,4,11,4,12,4,
					6,3,8,3,
					14,17,14,18,
					15,17,15,18,
					4,9,4,11,4,13,
					5,8,5,9,5,10,5,11,5,12,5,13,5,14,
					6,8,6,9,6,10,6,11,6,12,6,13,6,14,
					7,9,7,11,7,13,
					10,9,10,11,10,13,
					11,8,11,9,11,10,11,11,11,12,11,13,11,14,
					12,8,12,9,12,10,12,11,12,12,12,13,12,14,
					13,9,13,11,13,13};

	int[]kuti = {-11,16,17,18};

	int[]jouhou = {};
	int[]mituketa = new int [3];			//コピペ
	int[][]ivent = syougai;			//コピペ

	String name = "[PC1]";
	MapSyori syori = new MapSyori();			//コピペ

	{
	}
	public int[][] map(){				//マップデータ
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
class book extends MapMam {
	int tate = 19;
	int yoko = 15;
	int[][]syougai = new int[tate][yoko];
	int[] kuromasu = {1,5,2,1,2,2,2,3,2,5,3,1,3,2,3,3,3,4,3,5,
						7,1,8,1,9,1,10,1,11,1,12,1,
						5,5,5,6,5,7,5,8,5,9,
						9,5,10,5,11,5,12,5,13,5,14,5,15,5,16,5,
						9,9,10,9,11,9,12,9,13,9,14,9,15,9,16,9,
						5,14,6,14,7,14,8,14,9,14,10,14,11,14,12,14,13,14,14,14,15,14,16,14
						};

	int[]kuti = {-41,16,17};

	int[]jouhou = {};
	int[]mituketa = new int [3];			//コピペ
	int[][]ivent = syougai;			//コピペ

	String name = "[図書室]";
	MapSyori syori = new MapSyori();			//コピペ

	{
	}
	public int[][] map(){				//マップデータ
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


