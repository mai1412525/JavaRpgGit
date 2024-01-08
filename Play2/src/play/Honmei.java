package play;

public class Honmei {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		TestWindow gw = new TestWindow("テストウィンドウ",0,0);
		gw.setVisible(true);  
		
		//speak.Speak();
		/*sub sub = new sub();
		for(int n = 0; n < 30; n++) {
			System.out.println();
		}
		sub.syougai();*/
	}

}

class syoji{
	int[]moti = {0};
	int[]motiflg = {1};
	int[] getmoti() {
		return moti;
	}
	int[]getmotiflg(){
		return motiflg;
	}
	void setmotiflg(int i) {
		motiflg[i] = 0;
	}
	void setmoti(int i) {
		moti[i] = 1;
	}
}