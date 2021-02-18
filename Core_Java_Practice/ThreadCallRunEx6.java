//Java program to run a thread by directly calling the run method.

class ThreadCallRunEx6 extends Thread {
     public void run() {
		 System.out.println("My thread is running...");
     }
     public static void main(String args[]) {
     	ThreadCallRunEx6 t1=new ThreadCallRunEx6();
      	t1.run();//fine, but does not start a separate call stack
     }
}
