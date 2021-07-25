package com.mkpits.java.elevatorprogram;

public class DoorOpen extends TestElevator {
    public DoorOpen(){
        String door = L33.getText();
        if (door.equals("DOOR") || door.equals("DOOR CLOSE")) {
            L33.setText("DOOR OPEN");
        }
    }
}
