package classObjectMethod;

class Animals {
	
	void behave() {
		System.out.println("I am animal i behave like an animal");
	}
	
}
class Cat extends Animals{
	void legs() {
		System.out.println("I have four legs");
	}
	@Override
	void behave() {
		System.out.println("I behave like Cat");
	}
}

public class methodOverriding {

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.behave();
		obj.legs();

	}

}
