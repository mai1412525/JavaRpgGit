package play;


public class select extends Thread {	
	String[] moji_join;
	String title;
	int mai = 0;
	int mellow = 1;
	int raruku = 0;
    int select_number;//Mainで使う用
    public static int select_final;//Eventに送る用
    public void setSelect(String moji,String title) {//設定
    	String[] moji_Split = moji.split(",");
    	String[] moji_join = new String[moji_Split.length*2];
    	moji_join = new String[moji_Split.length*2];
    	for (int i = 0; i < moji_Split.length; i++) {
    		moji_join[i * 2] = "▶";
    		moji_join[i * 2 + 1] = moji_Split[i];
    	}
    	/* for(int i = 0;i<MOJI_JOIN.length;i++) {
    		moji_join[i] = MOJI_JOIN[i];
    	}*/
    	this.moji_join = moji_join;
    	this.title = title;
    	dispSelect(0);//選択肢表示
    }

	public void dispSelect(int sentaku) {//表示
		select_number = sentaku;
		System.out.println(title);
		if(moji_join.length>1 && sentaku < moji_join.length/2 ) {
			for(int i=0;i<moji_join.length/2;i++) {
				if(sentaku==i) {
				System.out.print(moji_join[i*2]);
				}
				else {
					System.out.print(" ");
				}
				System.out.println(moji_join[i*2+1]);
			}
		}
	}
	public void run() {
		
	}
	public int getNumber() {
		return select_number;
	}
}
void jkl() {
	asdfg
}