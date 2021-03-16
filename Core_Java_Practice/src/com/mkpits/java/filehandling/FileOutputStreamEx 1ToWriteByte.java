//Java program to write capital A in a file named myfile.txt using FileOutputStream class.

package src.com.mkpits.java.filehandling;

import java.io.FileOutputStream;

class FileOutputStreamEx1ToWriteByte {
    public static void main(String[] args) {
        try {
            FileOutputStream fout= new FileOutputStream("E:\\myfile.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
