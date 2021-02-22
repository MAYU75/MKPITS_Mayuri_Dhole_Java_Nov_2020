//Java program to shutdown windows system in Java

public class RuntimeClassEx2 {
     public static void main(String args[])throws Exception {
		 Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
     }
}
