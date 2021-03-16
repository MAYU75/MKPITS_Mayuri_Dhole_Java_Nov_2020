//Java program to run a thread by directly calling the run method.
//MainThreadStack Problem if you direct call run() method.

class ThreadCallRunEx7 extends Thread {
    public void run() {
      	for(int i=1;i<5;i++) {
        	try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
        	System.out.println("My running thread " + i);
   		}
    }
    public static void main(String args[]) {
    	ThreadCallRunEx7 t1=new ThreadCallRunEx7();
      	ThreadCallRunEx7 t2=new ThreadCallRunEx7();
       	t1.run();
      	t2.run();
      	//there is no context-switching because here t1 and t2
      	//will be treated as normal object not thread object.
    }
}
