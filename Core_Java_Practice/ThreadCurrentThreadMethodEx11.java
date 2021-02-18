//Java program to demonstrate currentThread() method.
//The currentThread() method returns a reference to the
//currently executing thread object.

class ThreadCurrentThreadMethodEx11 extends Thread {
     public void run() {
     	System.out.println(Thread.currentThread().getName());
     }
     public static void main(String args[]) {
     	ThreadCurrentThreadMethodEx11 t1=new ThreadCurrentThreadMethodEx11();
     	ThreadCurrentThreadMethodEx11 t2=new ThreadCurrentThreadMethodEx11();
	 	t1.start();
     	t2.start();
     }
}
