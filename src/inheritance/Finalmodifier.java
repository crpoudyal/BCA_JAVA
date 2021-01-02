package inheritance;


//the final modifier class cannot be inheritated
final class A{
	 void display() {
		System.out.println("I am A class with Final access modifier keywords");
	}
	
}
//class B extends A{
//	
//}


public class Finalmodifier {

	public static void main(String[] args) {
		A obj = new A();
		obj.display();
	}

}
