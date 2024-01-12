package play;

import java.awt.event.KeyEvent;


public class password {
	String name = "";
	int key(KeyEvent e) {

	switch(e.getKeyCode()) {
	case KeyEvent.VK_MINUS:
		name += "-";
		break;
	case KeyEvent.VK_A:
		name += "a";
		break;
	case KeyEvent.VK_B:
		name += "b";
		break;
	case KeyEvent.VK_C:
		name += "c";
		break;
	case KeyEvent.VK_D:
		name += "d";
		break;
	case KeyEvent.VK_E:
		name += "e";
		break;
	case KeyEvent.VK_F:
		name += "f";
		break;
	case KeyEvent.VK_G:
		name += "g";
		break;
	case KeyEvent.VK_H:
		name += "h";
		break;
	case KeyEvent.VK_I:
		name += "i";
		break;
	case KeyEvent.VK_J:
		name += "j";
		break;
	case KeyEvent.VK_K:
		name += "k";
		break;
	case KeyEvent.VK_L:
		name += "l";
		break;
	case KeyEvent.VK_M:
		name += "m";
		break;
	case KeyEvent.VK_N:
		name += "n";
		break;
	case KeyEvent.VK_O:
		name += "o";
		break;
	case KeyEvent.VK_P:
		name += "p";
		break;
	case KeyEvent.VK_Q:
		name += "q";
		break;
	case KeyEvent.VK_R:
		name += "r";
		break;
	case KeyEvent.VK_S:
		name += "s";
		break;
	case KeyEvent.VK_T:
		name += "t";
		break;
	case KeyEvent.VK_U:
		name += "u";
		break;
	case KeyEvent.VK_V:
		name += "v";
		break;
	case KeyEvent.VK_W:
		name += "w";
		break;
	case KeyEvent.VK_X:
		name += "x";
		break;
	case KeyEvent.VK_Y:
		name += "y";
		break;
	case KeyEvent.VK_Z:
		name += "z";
		break;
	case KeyEvent.VK_1:
		name += "1";
		break;
	case KeyEvent.VK_2:
		name += "2";
		break;
	case KeyEvent.VK_3:
		name += "3";
		break;
	case KeyEvent.VK_4:
		name += "4";
		break;
	case KeyEvent.VK_5:
		name += "5";
		break;
	case KeyEvent.VK_6:
		name += "6";
		break;
	case KeyEvent.VK_7:
		name += "7";
		break;
	case KeyEvent.VK_8:
		name += "8";
		break;
	case KeyEvent.VK_9:
		name += "9";
		break;
	case KeyEvent.VK_BACK_SPACE:
		if(name.length() > 0) {
			name = name.substring(0, name.length() - 1);
		}
		break;
	case KeyEvent.VK_SPACE:
		return 1;
	}
	return 0;
	}
	String getname() {
		return name;
	}
	void reset() {
		name = name.substring(0,0);
	}
}
