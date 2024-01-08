package sample;

public class K {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] jkl= {{0,0,0},{0,0,0},{0,0,0}};
		int[][] jko= {{2,2,2},{2,2,2},{2,2,2}};
		
		asdf jk = new asdf();
		jk.fd(jkl);
		jk.fd(jko);
		
		for(int t = 0; t < jkl.length; t++) {
			for(int n = 0; n < jkl[t].length; n++) {
				System.out.print(jkl[t][n]);
			}
			System.out.println();
		}
		for(int t = 0; t < jko.length; t++) {
			for(int n = 0; n < jko[t].length; n++) {
				System.out.print(jko[t][n]);
			}
			System.out.println();
		}
	}

}

class asdf{
	void fd(int[][]jkl) {
		jkl[1][1] = 1;
	}
}