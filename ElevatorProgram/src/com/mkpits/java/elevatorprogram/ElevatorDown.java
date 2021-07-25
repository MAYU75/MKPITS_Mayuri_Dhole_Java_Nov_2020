package com.mkpits.java.elevatorprogram;

import java.awt.Color;
import java.awt.event.*;

public class ElevatorDown extends TestElevator implements ActionListener {
    private TestElevator bl1;
    private Color bg;
    private Color fg;
    private boolean isForeground = true;

    public ElevatorDown(TestElevator bl1) {
        super();
        this.bl1 = bl1;
        fg = bl1.getForeground();
        bg = bl1.getBackground();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int cnt = 1;

        if (bl1.blinkingOn) {
            if (isForeground) {
                bl1.setForeground(fg);

                for (long ccnt = 0; ccnt <= cnt; ccnt = ccnt + 1000) {
                    count = count + 1000;
                    System.out.println("Count " + count);
                    System.out.println("Destination floor " + destination_floor);
                    System.out.println("Current floor " + current_floor);

                    if (current_floor == 6){
                        if (count == 10000 && (destination_floor == 5 || destination_floor == 4 || destination_floor == 3 || destination_floor == 2 || destination_floor == 1)) {
                            j1.setText("5");
                        } else if (count == 20000 && (destination_floor == 4 || destination_floor == 3 || destination_floor == 2 || destination_floor == 1)) {
                            j1.setText("4");
                        } else if (count == 30000 && (destination_floor == 3 || destination_floor == 2 || destination_floor == 1)) {
                            j1.setText("3");
                        } else if (count == 40000 && (destination_floor == 2 || destination_floor == 1)) {
                            j1.setText("2");
                        } else if (count == 50000 && destination_floor == 1) {
                            j1.setText("1");
                            timer.stop();
                        }
                    } else if (current_floor == 5){
                        if (count == 10000 && (destination_floor == 4 || destination_floor == 3 || destination_floor == 2 || destination_floor == 1)) {
                            j1.setText("4");
                        } else if (count == 20000 && (destination_floor == 3 || destination_floor == 2 || destination_floor == 1)) {
                            j1.setText("3");
                        } else if (count == 30000 && (destination_floor == 2 || destination_floor == 1)) {
                            j1.setText("2");
                        } else if (count == 40000 && destination_floor == 1) {
                            j1.setText("1");
                            timer.stop();
                        }
                    } else if (current_floor == 4){
                        if (count == 10000 && (destination_floor == 3 || destination_floor == 2 || destination_floor == 1)) {
                            j1.setText("3");
                        } else if (count == 20000 && (destination_floor == 2 || destination_floor == 1)) {
                            j1.setText("2");
                        } else if (count == 30000 && destination_floor == 1) {
                            j1.setText("1");
                            timer.stop();
                        }
                    } else if (current_floor == 3){
                        if (count == 10000 && (destination_floor == 2 || destination_floor == 1)) {
                            j1.setText("2");
                        } else if (count == 20000 && destination_floor == 1) {
                            j1.setText("1");
                            // j1.setText( "count " + count);
                            timer.stop();
                        }
                    } else if (current_floor == 2){
                        if (count == 10000 && destination_floor == 1) {
                            System.out.println("Reached Destination floor 1.");
                            j1.setText("1");
                            // j1.setText( "count " + count);
                            timer.stop();
                        }
                    }
                    /* switch (current_floor) {
                        case 6:
                            System.out.println("Count inside switch " + count);
                            if (count == 10000) {
                                j1.setText("5");
                            } else if (count == 20000) {
                                j1.setText("4");
                            } else if (count == 30000) {
                                j1.setText("3");
                            } else if (count == 40000) {
                                j1.setText("2");
                            } else if (count == 50000) {
                                j1.setText("1");
                            } else if (count > 50000) {
                                timer.stop();
                            }
                            break;
                        case 5:
                            if (count == 10000) {
                                j1.setText("4");
                            } else if (count == 20000) {
                                j1.setText("3");
                            } else if (count == 30000) {
                                j1.setText("2");
                            } else if (count == 40000) {
                                j1.setText("1");
                            } else if (count > 40000) {
                                timer.stop();
                            }
                            break;
                        case 4:
                            if (count == 10000) {
                                j1.setText("3");
                            } else if (count == 20000) {
                                j1.setText("2");
                            } else if (count == 30000) {
                                j1.setText("1");
                            } else if (count > 30000) {
                                timer.stop();
                            }
                            break;
                        case 3:
                            if (count == 10000) {
                                j1.setText("2");
                            } else if (count == 20000) {
                                j1.setText("1");
                            } else if (count > 20000) {
                                // j1.setText( "count " + count);
                                timer.stop();
                            }
                            break;
                        case 2:
                            if (count == 10000) {
                                System.out.println("Reached Destination floor 1.");
                                j1.setText("1");
                            }
                            if (count == 20000) {
                                // j1.setText( "count " + count);
                                timer.stop();
                            }
                            break;
                        default:System.out.println("Destination floor not reached.");
                    } */


                }
            } else {
                bl1.setForeground(bg);
            }
            isForeground = !isForeground;
        } else {

            if (isForeground) {
                bl1.setForeground(fg);
                isForeground = false;
            }
        }
    }
}
