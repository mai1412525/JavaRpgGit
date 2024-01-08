package sample;

public class D {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dog pochi = new Dog();
		
		pochi.dispPet();
		pochi.dispPet("ポチ");
		pochi.dispPet("ポチ",3);
	}

}

class Dog{
	void dispPet() {
		System.out.println("私のペットは犬です");
	}
	void dispPet(String na) {
		System.out.println("私のペットは犬の" + na + "です");
	}
	void dispPet(String name,int age) {
		System.out.println("私のペットは犬の" + name + age + "歳です");
	}
}