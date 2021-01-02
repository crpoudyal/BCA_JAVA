package interfaces;


interface i {
	void inter();
	
}
interface i1{
	void interf1();
	
}
class Global{
	void global1() {
		System.out.println("I am from Global class");
	}
}
class Super extends Global implements i,i1{
	public void inter() {
		System.out.println("I am inside interface");
		
	}
	public void interf1() {
		System.out.println("I am inside interface 1");
	}
	
}

public class Multipleinheritance {

	public static void main(String[] args) {
		Super s= new Super();
		s.inter();
		s.interf1();
		s.global1();
	}

}
