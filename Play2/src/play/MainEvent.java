package play;

public class MainEvent {
	public static int[] flag = new int[8];//フラグ管理
	public static int[] item =  new int[15];//アイテム管理
	public static int[] epiSave =  new int[100];//Epiソードどこまで終わったか管理
	

MainEvent(){
	for(int i=0;i<flag.length;i++) {
		flag[i]= 0;
	}
	for(int i=0;i<item.length;i++) {
		item[i]= 0;
	}
	for(int i = 0;i<epiSave.length;i++) {
		epiSave[i] = 0;
		}
	}
}
