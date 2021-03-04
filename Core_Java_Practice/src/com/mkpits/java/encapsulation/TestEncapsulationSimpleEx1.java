//Java program to demonstrate Encapsulation.
//This is a simple example of encapsulation that has only one field with its setter and getter methods.

//A Java class to test the encapsulated class.
package com.mk;

class TestEncapsulationSimpleEx1 {
    public static void main(String[] args) {
        //creating instance of the encapsulated class
        EncapsulationSimpleEx1 s = new EncapsulationSimpleEx1();
        //setting value in the name member
        s.setName("Mayuri");
        //getting value of the name member
        System.out.println(s.getName());
    }
}
