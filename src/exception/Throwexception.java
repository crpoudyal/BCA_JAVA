package exception;
class Exc{
	void exc1() {
		System.out.println("class with no exception");
	}
}
public class Throwexception {
	 static void throwExceptions(int a) {
		if(a<20) {
			throw new ArithmeticException("not valid");
		}else {
				System.out.println("Exception doesn't occur");
		}
	}
	
	public static void main(String[] args) {
		Exc e = new Exc();
		e.exc1();
		
		throwExceptions(2);
		System.out.println("All codes below exception when exception does't occur");
		
	}

}
