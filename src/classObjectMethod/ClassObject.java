package classObjectMethod;

public class ClassObject {
	
	int age =21;
    String name ="Chudaraj Poudyal";
    String address = "Kathmandu";

	public static void main(String[] args) {
		
		ClassObject obj = new ClassObject();
		
	 System.out.println("My name is "+obj.name+". I am "+obj.age+" years old.I live in"
			 +obj.address+" city.");
	}

}
