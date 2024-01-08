package play;

public class Sentaku {
	void sentaku(int i,String[]sentaku){
		for(int k = 0; k < sentaku.length; k++) {
			if(i == k) {
				System.out.println("●" + sentaku[k]);
			}
			else {
				System.out.println("　" + sentaku[k]);
			}
		}
	}
}

