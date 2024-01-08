package play;
public class Speak extends Thread{
	static int space=0;
	int space2;
	public void S(String moji, int speed) {

		String[] strArray = new String[moji.length()];
		for(int i=0;i<moji.length();i++) {
			strArray[i]=String.valueOf(moji.charAt(i));
		}
		for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]);
			try {
				Thread.sleep(speed);
			// speed間だけ処理を止める
			} catch (InterruptedException e) {
			}
		}
	
		System.out.println("▼");
	}
	public void run() {
		while(space != 1 && space != 99) {
			System.out.print("");
		}
		
	}
	
}