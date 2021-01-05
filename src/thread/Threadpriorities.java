package thread;
class ThreadX extends Thread{
	public void run() {
		for(int i=1;i<=2;i++) {
			System.out.println("Thread X running "+i+" times");
		}
		System.out.println("Thread X terminated");
	}
}
class ThreadY extends Thread{
	public void run() {
		for(int i=1;i<=2;i++) {
			System.out.println("Thread Y running "+i+" times");
		    }
		System.out.println("Thread Y terminated");
	   }
		
	}	

public class Threadpriorities {

	public static void main(String[] args) {
		ThreadX t1 = new ThreadX();
		ThreadY t2 = new ThreadY();
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		

	}

}
