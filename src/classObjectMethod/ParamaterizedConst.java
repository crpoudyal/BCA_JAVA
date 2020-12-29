package classObjectMethod;


//Paramaterized constructor is contructor with paramater
public class ParamaterizedConst {
	double si,p,t,r;
	ParamaterizedConst(double p,double t,double r){
		this.p=p;
		this.t=t;
		this.r=r;
	}
	void calculate() {
		si= (p*t*r)/100;
		System.out.println("Simple Interest SI= "+si);
	}

	public static void main(String[] args) {
		ParamaterizedConst obj = new ParamaterizedConst(10000,3,7.9);
		obj.calculate();
		
	}

}
