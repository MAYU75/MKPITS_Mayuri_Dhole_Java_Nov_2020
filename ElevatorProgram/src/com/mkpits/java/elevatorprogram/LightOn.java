package com.mkpits.java.elevatorprogram;

public class LightOn extends TestElevator {
    public LightOn() {
        String light = L32.getText();
        if (light.equals("LIGHT OFF") || light.equals("LIGHT")) {
            L32.setText("LIGHT ON");
        }
    }
}
