package play;
public class Speak {
	boolean keyWait = false;
	boolean key = false;
	boolean skip = false;
	public void S(String moji, int speed) {

		String[] strArray = new String[moji.length()];
		for(int i=0;i<moji.length();i++) {
			strArray[i]=String.valueOf(moji.charAt(i));
		}
		for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]);
			try {
				if(skip ==  true) {
					speed = 1;
				}
				Thread.sleep(speed);
				keyWait =  false;
			// speed間だけ処理を止める
			} catch (InterruptedException e) {
			}
		}

		System.out.println("▼                                                          ");
		keyWait = true;
		rp();


	}
		void rp() {
			if(keyWait==true && skip == false) {
				synchronized(this) {
					try {
						wait();
					} catch (InterruptedException e){
					}
					return;
				}
			}
		}
		synchronized void preese() {
			notify();
		}
		public void setskip(boolean skip) {//スキップオンにする
			this.skip = skip;
		}
}