package inheritance;

class over{
	final void display() {
		System.out.println("I am class Over with display method and final modifier");
	}
}
class ride extends over{
//	void display() {
//		
//	}
//	cannot override display method because of final access modifier
}

public class Finaloverride {

	public static void main(String[] args) {
		ride r= new ride();
		r.display();
	}

}
