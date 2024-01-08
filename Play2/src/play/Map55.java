package play;

import java.util.Random;

public class Map55 {
	Random rand = new Random();
	int tate = 10;
	int yoko = 30;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {5,6,15,4};						//■の座標[縦][横]
	int[]ki = {3,3,19,3,20,3,18,3};								//木の座標
	int[]zou = {5,15};
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
