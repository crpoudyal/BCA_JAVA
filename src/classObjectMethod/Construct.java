package classObjectMethod;

//user define constructor where we can set variables values at the time of object creation

public class Construct {
	double si,p,t,r;
	Construct(){
		p=10000;
		t=3;
		r=7.9;
	}
	void calculate() {
		si=(p*t*r)/100;
		System.out.println("Simple Interest SI= "+si);
	}

	public static void main(String[] args) {
		Construct obj = new Construct();
		obj.calculate();

	}

}
