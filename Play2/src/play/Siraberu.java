package play;

class Siraberu extends sub{
	int siraberu(int jikiya,int jikixa) {
	if(itiji[jikiya][jikixa] == 3) {						//一歩前が調べるイベントがあるとき
		int ne = rand.nextInt(3);
		if(ne == 0) {
			System.out.println("カッターで切り付けられたぼろぼろの机だ▼");
		}
		else if(ne == 1) {
			System.out.println("ただの机だ▼");
		}
		else if(ne == 2) {
			System.out.println("きちんと整理された綺麗な机だ▼");
		}
		return 2;
	}
	else if(itiji[jikiya][jikixa] == 5) {
		if(syoji.getmoti()[0] == 0) {
			System.out.println("鍵がかかった扉だ▼");
		}
		else if(syoji.getmoti()[0] == 1) {
			System.out.println("鍵を使いますか？▼");
			kirikae = 2;
		}
		return 2;
	}
	else if(itiji[jikiya][jikixa] == 6) {
		if(syoji.motiflg[0] == 1) {
			System.out.println("鍵がある。拾いますか？▼");
			String[] i= {"はい","いいえ"};
			sentaku.sentaku(0,i);
			kirikae = 1;
			
		}
	}
	
	return 0;
	
}}
