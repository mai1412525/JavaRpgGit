package play;

import java.util.Random;

class Map55 {
	Random rand = new Random();
	int tate = 10;
	int yoko = 30;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {5,6,15,4};						//■の座標[縦][横]
	int[]ki = {3,3,19,3,20,3,18,3};								//木の座標
	int[]zou = {5,15};
	int[]tobira = {2,syougai[0].length - 1, 3,syougai[0].length - 1};
	int[]kuti = {-11,3,4, -12,11,12, -13,16,17, -14,24,25, -21,2,3, -31, -41};

	int[]jouhou = {-11,45,-31, -12,45,-32, -13,145,-31, -14,145,-32, -21,56,-41};
	int[]mituketa = new int [3];
	boolean han = true;
	String name = "廊下";
	MapSyori syori = new MapSyori();


	public int[][] map55(){
		syori.sotowaku(syougai);
		syori.jouh(syougai,ki,2);
		syori.jouh(syougai,kuromasu,1);
		syori.jouh(syougai,zou,4);
		syori.kuti(syougai, kuti);
		syori.jouh(syougai, tobira, 5);

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
}

class Map56 {

	int tate = 20;
	int yoko = 20;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {};						//■の座標
	int[]ki = {};								//木の座標
	int[]tukue = {4,4,6,6,8,8,10,10};			//tukue
	int[]kutisita1 = {3,4};
	int[]kutisita2 = {11,12};
	int[]jouhou = {-41,55,-21};
	int[]kutihidari = {3,4};

	int[]kuti = {-11,-21, -31, -41,3,4};
	int[]mituketa = new int [3];
	boolean han = true;
	String name = "体育館";
	MapSyori syori = new MapSyori();

	public int[][] map56(){
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
}

class Kyousitu1 {

	int tate = 10;
	int yoko = 15;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {};						//■の座標
	int[]ki = {};								//木の座標
	int[]tukukagi = {3,3};

	int[]kuti = {-11, -21, -31,3,4, -32,11,12, -41};
	int[]jouhou = {-31,55,-11, -32,55,-12};
	int[]mituketa = new int [3];
	int[]tukue = {3,3,3,6,3,9,6,3,6,6,6,9};
	boolean han = false;
	String name = "1-1";
	MapSyori syori = new MapSyori();


	public int[][] map56(){
		syori.sotowaku(syougai);
		syori.jouh(syougai, ki,2);
		syori.jouh(syougai, kuromasu,1);
		syori.jouh(syougai, tukue,3);
		syori.jouh(syougai,tukukagi,6);
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
}

class Kyousitu2 {

	int tate = 10;
	int yoko = 15;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {};						//■の座標
	int[]ki = {3,3};								//木の座標

	int[]kuti = {-11, -21, -31,3,4, -32,11,12, -41};
	int[]jouhou = {-31,55,-13, -32,55,-14};
	int[]tukue = {};
	int[]mituketa = new int [3];
	boolean han = false;
	String name = "1-2";
	MapSyori syori = new MapSyori();

	public int[][] map56(){
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
	int[]kuti = {-11,1,2,3,4,5,6,7,8};

}