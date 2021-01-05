package thread;

class Thread1 extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Running Thread1 class "+i+" times");
		}
		System.out.println("Stop thread1");
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Running Thread2 class "+i+" times");
		}
		System.out.println("Stop thread2");
	}
}

public class Threadextend extends Thread{

	public static void main(String[] args) {
		Thread1 t1= new Thread1();
		Thread2 t2= new Thread2();
		t1.start();
		t2.start();

	}

}
