package play;

public class Kyousitu1 {

	int tate = 10;
	int yoko = 15;
	int[][]syougai = new int[tate][yoko];				//マスごとのデータ
	int[] kuromasu = {};						//■の座標
	int[]ki = {};								//木の座標
	
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