//Java program to demonstrate Encapsulation and calculate Simple Interest using setter method named SetRateOfInterest.
//This is a simple example of encapsulation that has only one field with its setter and getter methods.

package com.mk;

public class EncapsulationEx2ToCalculateSimpleInterest {
    //private data member
    private float roi;
    //setter method for name

    public void SetRateOfInterest(float roi) {
        this.roi = roi;
    }

    public float calinterest(float pa, int nom) {
        float pi = pa * roi * nom;
        return pi;
    }

}
