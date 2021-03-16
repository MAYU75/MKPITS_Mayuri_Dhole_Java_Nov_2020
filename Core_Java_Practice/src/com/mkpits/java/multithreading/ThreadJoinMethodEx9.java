//Java program to use join method for thread.
//Example of join(long miliseconds) method.

class ThreadJoinMethodEx9 extends Thread{
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
    	ThreadJoinMethodEx9 t1=new ThreadJoinMethodEx9();
    	ThreadJoinMethodEx9 t2=new ThreadJoinMethodEx9();
    	ThreadJoinMethodEx9 t3=new ThreadJoinMethodEx9();
    	t1.start();
     	try {
      		t1.join(1500);	//when t1 completes its task for 1500 miliseconds(3 times)
      		//then t2 and t3 starts executing.
     	}catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
     	t3.start();
   }
}
