package sample;

public class Hairetu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] m = { { 87, 78, 91 },{ 86, 67 },{ 78 } ,{33},{49},{99,0 ,33}};
		System.out.println(m[1].length);
		int n = 0;
		
		for(int i = 0; i < 3; i++) {
			if(m[i].length > 1) {
				n += m[i][1];
			}
		}
		System.out.println(n);
		
		System.out.println(m.length);
	}

}
