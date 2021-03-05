//Java program to demonstrate String class methods length() and charAt(int index).
//charAt(int index) method returns char value for the particular index.
//length() method returns string length

class StringEx4LengthCharAtMethod {
    public static void main(String args[]) {


        String s3 = new String("example");//creating java string by new keyword
        int c = s3.length();
        for (int i = 0; i < c; i++) {
            System.out.println(s3.charAt(i));
        }


    }
}
