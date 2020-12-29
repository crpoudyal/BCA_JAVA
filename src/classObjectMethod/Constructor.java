package classObjectMethod;

//default constructor set all the variables values to zero by default

public class Constructor {
    double p,t,r,si;
    void calculation() {
    	si= (p*t*r)/100;
    	System.out.println("Simple Interest SI= "+si);
    }
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		obj.calculation();

	}

}
