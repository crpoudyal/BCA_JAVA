package inheritance;

class World{
	void wMethod() {
		System.out.println("I am world class Method");
	}	
	
}
class Nepal extends World{
	void nMethod() {
		System.out.println("I belogs to world and I am Nepal");
	}
	
}
class Kathmandu extends Nepal {
	void kMethod() {
		System.out.println("I belogs to Nepal and I am capital of Nepal");
	
	}
}




public class Multilevelinheritance {

	public static void main(String[] args) {
		
       Kathmandu k = new Kathmandu();
       k.wMethod();
       k.nMethod();
       k.kMethod();
	}

}
