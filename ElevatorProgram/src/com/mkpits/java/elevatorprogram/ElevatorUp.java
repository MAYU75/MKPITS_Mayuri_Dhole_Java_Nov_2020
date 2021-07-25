package com.mkpits.java.elevatorprogram;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElevatorUp extends TestElevator implements ActionListener {
    private TestElevator bl;
    private Color bg;
    private Color fg;
    private boolean isForeground = true;
    //public static Timer timer;

    public ElevatorUp(TestElevator bl) {
        super();
        this.bl = bl;
        fg = bl.getForeground();
        bg = bl.getBackground();
    }

    public void actionPerformed(ActionEvent e) {
        int cnt = 1;

        if (bl.blinkingOn) {
            if (isForeground) {
                bl.setForeground(fg);

                for (long ccnt = 0; ccnt <= cnt; ccnt = ccnt + 1000) {
                    count = count + 1000;
                    System.out.println("Count " + count);
                    System.out.println("Destination floor " + destination_floor);
                    System.out.println("Current floor " + current_floor);

                    b9.setEnabled(false);

                    switch (current_floor) {
                        case 5:
                            System.out.println("Count inside switch " + count);
                            if (count == 10000) {
                                j1.setText("6");
                                b9.setEnabled(true);
                                timer.stop();
                            }
                            break;
                        case 4:
                            if (count == 10000 && destination_floor == 5) {
                                j1.setText("5");
                               // b9.setEnabled(true);
                                timer.stop();
                            } else if (count == 10000 && destination_floor == 6) {
                                j1.setText("5");
                                //b9.setEnabled(true);
                            } else if (count == 20000 && destination_floor == 6) {
                                j1.setText("6");
                                //b9.setEnabled(true);
                                timer.stop();
                            }
                            break;
                        case 3:
                            if (count == 10000 && destination_floor == 4) {
                                j1.setText("4");
                                timer.stop();
                            } else if (count == 10000 && (destination_floor == 5 || destination_floor == 6)) {
                                j1.setText("4");
                            } else if (count == 20000 && (destination_floor == 5 || destination_floor == 6)) {
                                j1.setText("5");
                            } else if (count == 30000 && destination_floor == 6) {
                                j1.setText("6");
                                timer.stop();
                            } /*else if(count > 20000) {
                                // j1.setText( "count " + count);
                                System.out.println("Count for stop " + count);
                                timer.stop();
                            } */
                            break;
                        case 2:
                            if (count == 10000 && (destination_floor == 3 || destination_floor == 4 || destination_floor == 5 || destination_floor == 6)) {
                                j1.setText("3");
                            } else if (count == 20000 && (destination_floor == 4 || destination_floor == 5 || destination_floor == 6)) {
                                j1.setText("4");
                            } else if (count == 30000 && (destination_floor == 5 || destination_floor == 6)) {
                                j1.setText("5");
                            } else if (count == 40000 && destination_floor == 6) {
                                j1.setText("6");
                                // j1.setText( "count " + count);
                                timer.stop();
                            }
                            break;
                        case 1:
                            if (count == 10000 && (destination_floor == 2 || destination_floor == 3 || destination_floor == 4 || destination_floor == 5 || destination_floor == 6)) {
                                j1.setText("2");
                                //timer.stop();
                            } else if (count == 20000 && (destination_floor == 3 || destination_floor == 4 || destination_floor == 5 || destination_floor == 6)) {
                                j1.setText("3");
                                //timer.stop();
                            } else if (count == 30000 && (destination_floor == 4 || destination_floor == 5 || destination_floor == 6)) {
                                j1.setText("4");
                                //timer.stop();
                            } else if (count == 40000 && (destination_floor == 5 || destination_floor == 6)) {
                                j1.setText("5");
                                //timer.stop();
                            } else if (count == 50000 && destination_floor == 6) {
                                j1.setText("6");
                                timer.stop();
                            } /* else if (count > 50000){
                                // j1.setText( "count " + count);
                                timer.stop();
                            } */
                            break;
                    }

                }
            } else {
                bl.setForeground(bg);
            }
            isForeground = !isForeground;
        } else {

            if (isForeground) {
                bl.setForeground(fg);
                isForeground = false;
            }
        }
    }

}
