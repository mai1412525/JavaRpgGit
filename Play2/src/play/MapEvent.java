package play;

class mot{
	static int[]moti = {0,0};
	
	void moti(int item,int henka) {
		moti[item] = henka;
	}
	int[] getmoti() {
		return moti;
	}
}
public class MapEvent {
	mot moti = new mot();
	int ev(int map,int tag){
		if(map == 0) {
			if(tag == 1) {
				System.out.println("鍵がかかっている");
				System.out.println("パスワードを入力してください");
				return 998;
				}
		}
		if(map == 2) {
			if(tag == 1) {
				System.out.println("紙切れを拾った▼");
				moti.moti(0,1);
				return 1;
			}
		}
		return 999;
	}
	int pass(int map,int tag,String name) {
		if(map == 0) {
			if(tag == 1) {
				if(name.equals("mellow")) {
					System.out.println("扉が開いた");
					return 1;
				}
				else {
					System.out.println("パスワードが違います▼");
					return 0;
				}
			}
		}
		return 999;
	}
}
