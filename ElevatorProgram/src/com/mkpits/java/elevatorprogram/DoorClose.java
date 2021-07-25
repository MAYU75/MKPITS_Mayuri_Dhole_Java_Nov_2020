package com.mkpits.java.elevatorprogram;

public class DoorClose extends TestElevator {
    public DoorClose(){
        String door = L33.getText();
        if (door.equals("DOOR OPEN") || door.equals("DOOR")) {
            L33.setText("DOOR CLOSE");
        }
    }
}
