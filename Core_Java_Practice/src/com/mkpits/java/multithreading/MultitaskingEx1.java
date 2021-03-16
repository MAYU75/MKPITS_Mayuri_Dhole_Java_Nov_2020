//Java Program of performing single task by multiple threads.

class MultitaskingEx1 extends Thread {
     public void run() {
		 System.out.println("task one");
     }
     public static void main(String args[]) {
		 MultitaskingEx1 t1=new MultitaskingEx1();
      	 MultitaskingEx1 t2=new MultitaskingEx1();
      	 MultitaskingEx1 t3=new MultitaskingEx1();

      	 t1.start();
      	 t2.start();
      	 t3.start();
    }
}
