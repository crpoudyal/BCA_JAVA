package thread;

class ThreadA implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("ThreadA running "+i+" times");
		}
		System.out.println("ThreadA Terminated");
	}
}
class ThreadB implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("ThreadB running "+i+" times");
			if(i==2) 
				try {
					//sleep(1000);
				}catch(Exception e) {
					System.out.println(e);
				}
		}
		System.out.println("ThreadB Terminated");
	}
}
public class Threading {

	public static void main(String[] args) {
		Thread T1 =new Thread(new ThreadA());
		Thread T2 =new Thread(new ThreadB());
		T1.start();
		T2.start();

	}

}
