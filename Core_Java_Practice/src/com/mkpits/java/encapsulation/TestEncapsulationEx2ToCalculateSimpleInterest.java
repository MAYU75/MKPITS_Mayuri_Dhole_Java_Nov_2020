//Java program to demonstrate Encapsulation and calculate Simple Interest using setter method named SetRateOfInterest.
//This is a simple example of encapsulation that has only one field with its setter and getter methods.

//A Java class to test the encapsulated class.
package com.mk;

class TestEncapsulationEx2ToCalculateSimpleInterest {
    public static void main(String[] args) {
        //creating instance of the encapsulated class
        EncapsulationEx2ToCalculateSimpleInterest s = new EncapsulationEx2ToCalculateSimpleInterest();
        //setting value in the name member
        s.SetRateOfInterest(12.3f);
        float res = s.calinterest(20000, 12);
        System.out.println("Simple Interest " + res);
    }
}
