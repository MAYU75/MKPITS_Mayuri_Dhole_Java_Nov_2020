//Java program to use join method for thread.

class ThreadJoinMethodEx8 extends Thread {
     public void run() {
     	for(int i=1;i<=15;i++) {
       		try {
        		Thread.sleep(500);
       		}catch(Exception e) {
				System.out.println(e);
			}
      		System.out.println("My running thread " + i);
      	}
    }
    public static void main(String args[]) {
     	ThreadJoinMethodEx8 t1=new ThreadJoinMethodEx8();
     	ThreadJoinMethodEx8 t2=new ThreadJoinMethodEx8();
     	ThreadJoinMethodEx8 t3=new ThreadJoinMethodEx8();
     	t1.start();
     	try {
      		t1.join();	//when t1 completes its task then t2 and t3 starts executing.
     	}catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
     	t3.start();
   }
}
