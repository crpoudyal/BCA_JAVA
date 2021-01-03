package exception;
//NumberFormateException
public class Numberformateexc {

	public static void main(String[] args) {
		try {
			String str = "nepal";
			int s =Integer.parseInt(str);
			System.out.println(s);
		}catch(Exception e){
			System.out.println(e);
			
		}
	}

}
