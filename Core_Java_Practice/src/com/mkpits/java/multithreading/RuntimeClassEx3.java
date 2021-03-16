//Java program to restart system in Java

public class RuntimeClassEx3 {
     public static void main(String args[])throws Exception {
     	Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -r -t 0");
     }
}
