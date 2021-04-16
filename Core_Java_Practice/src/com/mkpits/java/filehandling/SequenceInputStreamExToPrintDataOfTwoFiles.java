package src.com.mkpits.java.filehandling;

//Java program for printing the data of two files myfile2.txt and myfile3.txt using
// SequenceInputStream class.

import java.io.*;

class SequenceInputStreamExToPrintDataOfTwoFiles {
    public static void main(String[] args) throws Exception {
        FileInputStream input1 = new FileInputStream("E:\\myfile2.txt");
        FileInputStream input2 = new FileInputStream("E:\\myfile3.txt");
        SequenceInputStream inst = new SequenceInputStream(input1, input2);
        int j;
        while ((j = inst.read()) != -1) {
            System.out.print((char) j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}
