package play;

public class MapSyori {
	void sotowaku(int[][]syougai){
		for(int n = 0; n < syougai.length ; n ++) {				//端っこに1を入れる
			for(int j = 0; j < syougai[n].length; j++) {
				if(n == 0 || j == 0 || j + 1 == syougai[n].length || n + 1 == syougai.length) {
					syougai[n][j] = 1;
				}
				else {
					syougai[n][j] = 0;
				}
			}
		}
	}
	
	void jouh(int[][]syougai,int[]data,int t) {
		for(int n = 0; n < data.length; n += 2) {				//
			if(syougai.length > data[n] && syougai[data[n]].length > data[n + 1]) {
				syougai[data[n]][data[n + 1]] = t;
			}
		}
	}
	
	void kutijouge(int[][]syougai,int[]data,int tate,int t) {
		for(int n = 0; n < data.length; n++) {					//
			if(syougai[0].length > data[n]) {
				syougai[tate][data[n]] = t;
			}
		}
	}
	
	void kuti(int[][]syougai,int[]kuti) {
		int i = 0;
		for(int n = 0; n < kuti.length; n++) {
			if(kuti[n] < 0) {
				i = kuti[n];
			}
			else {
				if(i <= -40) {
						syougai[kuti[n]][0] = i;
				}
				else if(i <= -30) {
						syougai[syougai.length - 1][kuti[n]] = i;
				}
				else if(i <= -20) {
						syougai[kuti[n]][syougai[0].length - 1] = i;
				}
				else if(i <= -10) {
						syougai[0][kuti[n]] = i;
				}
			}
		}
	}
	
	void mapjouhou(int id,int[]jouhou,int[]mituketa) {
		for(int i = 0; i < jouhou.length; i += 3) {
			if(jouhou[i] == id) {
				for(int n = 0; n < 3; n++) {
					mituketa[n] = jouhou[i + n];
				}
				break;
			}
		}
	}
}
