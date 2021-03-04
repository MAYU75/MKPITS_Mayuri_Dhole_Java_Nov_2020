//Java program to demonstrate Encapsulation.
//This is a simple example of encapsulation that has only one field with its setter and getter methods.

//A Java class which is a fully encapsulated class.
// It has a private data member and getter and setter methods.

package com.mk;

public class EncapsulationSimpleEx1 {
    //private data member
    private String name;

    //getter method for name
    public String getName() {
        return name;
    }

    //setter method for name
    public void setName(String name) {
        this.name = name;
    }
}
