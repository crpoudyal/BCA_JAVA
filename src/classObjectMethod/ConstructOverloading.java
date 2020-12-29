package classObjectMethod;

public class ConstructOverloading {
	int a,b,c,s=0;
	ConstructOverloading(int a,int b){
		this.a=a;
		this.b=b;
	}
    ConstructOverloading(int a, int b,int c){
    	this.a=a;
		this.b=b;
		this.c=c;
	}
   void calculate() {
	   s=a+b+c;
	   System.out.println("Sum "+s);
	   
   }
	public static void main(String[] args) {
		ConstructOverloading c =new ConstructOverloading(3,1,1);
		ConstructOverloading co =new ConstructOverloading(3,1);
		c.calculate();
		co.calculate();

	}

}
