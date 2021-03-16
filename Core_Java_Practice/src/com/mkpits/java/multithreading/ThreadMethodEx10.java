//Java program to demonstrate getName(), setName() and getId() methods in Thread class

class ThreadMethodEx10 extends Thread {
	public void run() {
		System.out.println("My thread is running...");
    }
    public static void main(String args[]) {
    	ThreadMethodEx10 t1=new ThreadMethodEx10();
      	ThreadMethodEx10 t2=new ThreadMethodEx10();
      	System.out.println("Name of t1:"+t1.getName());
      	System.out.println("Name of t2:"+t2.getName());
      	System.out.println("id of t1:"+t1.getId());
      	t1.start();
      	t2.start();
      	t1.setName("Sonoo Jaiswal");
      	System.out.println("After changing name of t1:"+t1.getName());
    }
}
