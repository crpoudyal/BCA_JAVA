package inheritance;



class Myparent {
	void property() {
		System.out.println("I have parent property");

	}
	
}
class Mychild extends Myparent{

	void myProperty() {
		System.out.println("I can take the property of my parent also..and myself child");
	}
}
class Grandchild extends Myparent {
	void myProperty() {
		System.out.println("I can take the property of my parent also..and myself grandchild");
	}
	
}

public class Hierarchicalinheritance {
	int a ,b,c,s=0;

	public static void main(String[] args) {
		Grandchild obj = new Grandchild();
		obj.property();
		obj.myProperty();
		

	}

}
