//Java program to create thread by implementing runnable interface.

class ThreadEx2 implements Runnable {
	public void run() {
		System.out.println("My thread is running.");
	}
	public static void main(String[] args) {
		ThreadEx2 th = new ThreadEx2();
		Thread t = new Thread(th);
		t.start();
	}
}