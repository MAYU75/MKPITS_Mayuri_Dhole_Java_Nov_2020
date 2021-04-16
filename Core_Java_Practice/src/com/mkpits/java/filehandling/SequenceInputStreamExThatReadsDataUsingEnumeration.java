package src.com.mkpits.java.filehandling;

import java.io.*;
import java.util.*;

public class SequenceInputStreamExThatReadsDataUsingEnumeration {
    public static void main(String[] args) throws IOException {
        //creating the FileInputStream objects for all the files
        FileInputStream fin = new FileInputStream("E:\\aa.txt");
        FileInputStream fin2 = new FileInputStream("E:\\bb.txt");
        FileInputStream fin3 = new FileInputStream("E:\\cc.txt");
        FileInputStream fin4 = new FileInputStream("E:\\dd.txt");
        //creating Vector object to all the stream
        Vector v = new Vector();
        v.add(fin);
        v.add(fin2);
        v.add(fin3);
        v.add(fin4);
        //creating enumeration object by calling the elements method
        Enumeration e = v.elements();
        //passing the enumeration object in the constructor
        SequenceInputStream bin = new SequenceInputStream(e);
        int i = 0;
        while ((i = bin.read()) != -1) {
            System.out.print((char) i);
        }
        bin.close();
        fin.close();
        fin2.close();
    }

}
