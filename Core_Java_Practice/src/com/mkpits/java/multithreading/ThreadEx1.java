//Java program to create a thread by extending thread class

class ThreadEx1 extends Thread {
	public void run() {
		System.out.println("my thread is running ");
	}
	public static void main(String[] arg) {
		ThreadEx1 th=new ThreadEx1();
		th.start();
	}
}
