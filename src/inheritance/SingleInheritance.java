package inheritance;


class Parent {
	void parentMethod() {
		System.out.println("I am Parent Method");
	}
}
class child extends Parent{
	void childMethod() {
		System.out.println("I am child Method");
	}
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		Parent p = new Parent();
		child c = new child();
		c.parentMethod(); 
		p.parentMethod(); 
		c.childMethod();  

	}

}
