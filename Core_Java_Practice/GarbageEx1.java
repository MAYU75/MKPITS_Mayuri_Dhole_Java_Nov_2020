//Java program Example of garbage collection in java.

public class GarbageEx1 {
    public void finalize() {
		System.out.println("object is garbage collected");
	}
    public static void main(String args[]) {
    	GarbageEx1 s1=new GarbageEx1();
      	GarbageEx1 s2=new GarbageEx1();
      	s1=null;
      	s2=null;
      	System.gc();
    }
}
