package sample;

public class B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int kuku[][] = new int [9][9];
		for(int i = 0;i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
				System.out.print(kuku[i][j]);
			}
			System.out.println();
		}
	}

}
