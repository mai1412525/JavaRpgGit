package play;

public class Kyousitu2 {

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
