package exception;
//NullPpointerException
public class Nullpointerexc {

	public static void main(String[] args) {
	try {
		String s = null;
		System.out.println(s.length());
		System.out.println(s);
	}catch(Exception e){
		System.out.println(e);
		System.out.println("Rest lines...");
	    }
	}

}
