package classObjectMethod;


class Moterbike{
	int speed = 120;
	void wheel() {
		System.out.println("moterbike: I have two wheel");
	}
}
class car extends Moterbike {
	int speed = 200;
	void wheel() {
		System.out.println("car: I have Four wheel");
	}
	//here we define speed variable with different values but we want parent class 
	//speed value than we can use super keyword to call parent values but by default
	//it will call speed of child class for this example
	void display() {
		super.wheel();
		wheel();
		System.out.println("speed of bike is "+speed);
		System.out.println("speed of moterbike is "+super.speed);
		
	}
}

public class Superkeywords {

	public static void main(String[] args) {
		car c = new car();
		c.display();
		
	}

}
