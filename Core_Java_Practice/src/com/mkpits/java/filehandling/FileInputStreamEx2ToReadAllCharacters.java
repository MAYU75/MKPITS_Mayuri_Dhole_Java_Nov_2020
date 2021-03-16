//Java program to read all characters from a file using FileInputStream class.

package src.com.mkpits.java.filehandling;

import java.io.FileInputStream;

class FileStreamEx2ToReadAllCharacters {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\myfile1.txt");
            int alphabetvalue = 0;
            while ((alphabetvalue = fin.read()) != -1) {
                System.out.print((char) alphabetvalue);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
