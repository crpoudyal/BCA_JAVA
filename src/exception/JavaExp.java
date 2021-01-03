package exception;

//It will generate exception i.e Arithmetic Exception
public class JavaExp {

	public static void main(String[] args) {
	try {
		int a=10/0;
		System.out.println(a);
	}
	catch(Exception e){
		System.out.println(e);
		
	}
	System.out.println("Rest of the lines...");

	}

}
