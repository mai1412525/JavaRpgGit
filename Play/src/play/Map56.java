package play;

public class Map56 {

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
