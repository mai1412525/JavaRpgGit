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
	static mojiokuri moji = new mojiokuri();
	int ev(int map,int tag){
		/*if(map == 0) {
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
		}*/
		if(map == 0) {
			if(tag == 1) {
				moji.s("人体模型だ");
				moji.s("'泥人形の頭'を手に入れた");
				moti.moti(1,1);
				MainEvent.item[1] = 1;
				return 2;
			}
			if(tag == 2) {
				System.out.println("ただの人体模型だ▼");
				return 2;
			}
		}
		if(tag == -1) {
			System.out.println("今は行く必要はないだろう▼");
			return 999;
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
	void presse() {
		moji.presse();
	}
}
