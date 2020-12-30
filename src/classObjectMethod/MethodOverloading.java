package classObjectMethod;

public class MethodOverloading {
	double p,t,r,si;
	 MethodOverloading(){
		 p=10000;
		 r=2.3;
	 }
	 
	 void si(double p,double t,double r) {
		 
		 si=(p*t*r)/100;
		 System.out.println("Simple Interest SI= "+si);
	 }
	 
	 void si() {
		 si=(p*r)/100;
		 System.out.println("Simple Interest SI= "+si);
	 }

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.si(2000, 3, 4.5);
		obj.si();

	}

}
