package classObjectMethod;

public class MethodsInJava {
	
	String laptop = "Dell";
	
	
	 void Processor() {
		System.out.println(laptop+" Intel i9 processor");
	}
	 void Cost(int price) {
		 System.out.println("It cost "+price);
	 }
	 void input(int portno,int battary) {
		 System.out.println("It has "+portno+" ports ,with "+battary+" battary support");
	 }

	public static void main(String[] args) {
		MethodsInJava obj = new MethodsInJava();
		obj.Processor();
		obj.Cost(90000);
		obj.input(2, 14000);

	}

}
