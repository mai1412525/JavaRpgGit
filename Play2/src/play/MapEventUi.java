package play;

public class MapEventUi {
	int EventUi(int map,int id) {
		if(map == 0) {
			if(id == 1) {
				return 1;
			}
			else if(id == 2) {
				return 2;
			}
		}
		return 999;
	}
}
