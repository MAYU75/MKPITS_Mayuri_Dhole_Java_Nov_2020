//Java program to create 2 threads.

class ThreadEx3 implements Runnable {
	public void run() {
		for(int i=1;i<25;i++) {
		System.out.println("my thread is running " + i);
		}
	}

	public static void main(String[] args) {
		ThreadEx3 th=new ThreadEx3();
		Thread t=new Thread(th);
		t.start();
		Thread t1=new Thread(th);
		t1.start();
	}
}


