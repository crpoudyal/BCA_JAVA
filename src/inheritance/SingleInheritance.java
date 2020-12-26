package inheritance;


class parent {
	void parentMethod() {
		System.out.println("I am Parent Method");
	}
}
class child extends parent{
	void childMethod() {
		System.out.println("I am child Method");
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		parent p = new parent();
		child c = new child();
		c.parentMethod(); 
		p.parentMethod(); 
		c.childMethod();  

	}

}
