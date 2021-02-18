//Java program to start the same thread twice.

public class ThreadTwiceEx5 extends Thread {
     public void run() {
		 System.out.println("running...");
     }
     public static void main(String args[]) {
		 ThreadTwiceEx5 t1=new ThreadTwiceEx5();
      	 t1.start();
      	 t1.start();	//Runtime Error. Exception in thread.
     }
}
