//Java program for writing a common data to 4 files File2.txt, File3.txt, File4.txt and File5.txt
// using chararraywriter class.

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterExToWriteACommonDataTo4Files {
    public static void main(String[] args) throws Exception {
        CharArrayWriter out = new CharArrayWriter();
        out.write("Welcome to mkpits");
        FileWriter f1 = new FileWriter("D:\\File2.txt");
        FileWriter f2 = new FileWriter("D:\\File3.txt");
        FileWriter f3 = new FileWriter("D:\\File4.txt");
        FileWriter f4 = new FileWriter("D:\\File5.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.println("Success...");
    }
}
