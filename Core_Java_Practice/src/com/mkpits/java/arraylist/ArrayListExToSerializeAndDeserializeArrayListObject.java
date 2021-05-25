//Java program to demonstrate how to serialize and deserialize ArrayList object.

package src.com.mkpits.java.arraylist;

import java.io.*;
import java.util.*;

public class ArrayListExToSerializeAndDeserializeArrayListObject {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Mayuri");
        al.add("Sharvari");
        al.add("Aboli");

        try {
            //Serialization
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();
            //Deserialization
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list = (ArrayList) ois.readObject();
            System.out.println(list);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
