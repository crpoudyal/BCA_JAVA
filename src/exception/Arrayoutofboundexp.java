package exception;
//ArrayIndexOutOfBoundsException
public class Arrayoutofboundexp {

	public static void main(String[] args) {
		try {
			String i[] = new String[5];
			i[1]="mango";
			i[3]="orange";
			i[6]="exception";
			
			System.out.println("Array length is "+i.length);
			for(int a=0;a<(i.length);a++) {
				System.out.println(i[a]);
			}
		}catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("ArrayIndexOutOfBoundsException");
		}

	}

}
