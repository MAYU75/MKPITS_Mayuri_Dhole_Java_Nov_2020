package com.mkpits.java.elevatorprogram;

public class FanOff extends TestElevator {
    public FanOff(){
        String fan = L31.getText();
        if (fan.equals("FAN ON") || fan.equals("FAN")) {
            L31.setText("FAN OFF");
        }
    }
}
