package interfaces;


  interface intf{
	  int a=10,b=20;
	  void add();
  }
  
  class Calculation implements intf{
	  public void add() {
		  int sum;
		  sum=a+b;
		  System.out.println("Sum is "+sum);
	  }
  }
public class Myinterfaces {
	public static void main(String[] args) {
		Calculation c = new Calculation();
		c.add();
	}

}
