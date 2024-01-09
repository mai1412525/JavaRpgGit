package sample;

public class V2 extends Thread{
	V3 v3 = new V3();
	public void run() {
		v3.speak(1);
		v3.speak(2);
		v3.speak(3);
		v3.speak(4);
	}
	
	void presse() {
		v3.presse();
	}
}
