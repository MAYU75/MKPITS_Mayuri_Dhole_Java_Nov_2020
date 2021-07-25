package com.mkpits.java.elevatorprogram;

public class LightOff extends TestElevator {
    public LightOff() {
        String light = L32.getText();
        if (light.equals("LIGHT ON") || light.equals("LIGHT")) {
            L32.setText("LIGHT OFF");
        }
    }
}
