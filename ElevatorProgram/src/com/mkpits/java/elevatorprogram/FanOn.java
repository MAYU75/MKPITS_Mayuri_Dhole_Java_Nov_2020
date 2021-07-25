package com.mkpits.java.elevatorprogram;

public class FanOn extends TestElevator {
    public FanOn(){
        String fan = L31.getText();
        if (fan.equals("FAN OFF") || fan.equals("FAN")) {
            L31.setText("FAN ON");
        }
    }
}
