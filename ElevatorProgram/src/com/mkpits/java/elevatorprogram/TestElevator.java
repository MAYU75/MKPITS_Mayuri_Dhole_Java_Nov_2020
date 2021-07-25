package com.mkpits.java.elevatorprogram;

//Mini project to create elevator and demonstrate its working

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestElevator extends JLabel {
    private static final long serialVersionUID = 1L;

    static final int BLINKING_RATE = 1000; // in ms

    boolean blinkingOn = false;
    static long count = 0;
    boolean blinkingOff = false;

    public TestElevator(String text) {
        super(text);
        timer = new Timer(BLINKING_RATE, new ElevatorUp(this));
        timer.setInitialDelay(0);
        timer.start();
    }

    public static JLabel j1, L31, L32, L33;
    public static Timer timer;
    public static JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    public static int destination_floor;
    public static int current_floor;

    public TestElevator() {

    }

    // --- for testing
    private static void ElevatorDesign() {

        JFrame frame = new JFrame("Elevator");

        JPanel jp = new JPanel();
        jp.setBounds(10, 20, 200, 400);
        jp.setBackground(Color.gray);
        jp.setLayout(null);

        JPanel jp21 = new JPanel();
        jp21.setBounds(10, 10, 180, 80);
        jp21.setBackground(Color.lightGray);
        jp21.setLayout(null);

        j1 = new JLabel("5");
        j1.setBounds(70, 10, 150, 100);
        jp21.add(j1);

        jp.add(jp21);

        JPanel jp212 = new JPanel();
        jp212.setBounds(10, 100, 180, 80);
        jp212.setLayout(null);

        final TestElevator bl = new TestElevator("UP");

        final TestElevator bl1 = new TestElevator("DOWN");

        bl.setBounds(70, 120, 150, 100);
        bl.setBackground(Color.black);
        jp.add(bl);

        bl1.setBounds(100, 120, 150, 100);
        bl1.setBackground(Color.black);
        jp.add(bl1);

        JPanel jp2 = new JPanel();
        jp2.setBounds(10, 220, 180, 80);
        jp2.setBackground(Color.lightGray);
        jp2.setLayout(null);

        L31 = new JLabel("FAN");
        L31.setBounds(25, 5, 130, 15);

        L32 = new JLabel("LIGHT");
        L32.setBounds(25, 25, 130, 15);

        L33 = new JLabel("DOOR");
        L33.setBounds(25, 45, 130, 15);

        jp2.add(L31);
        jp2.add(L32);
        jp2.add(L33);

        jp.add(jp2);

        JPanel jpp = new JPanel();
        jpp.setBounds(300, 20, 250, 400);
        jpp.setLayout(null);

        /*  Button for 1st floor */

        b1 = new JButton("1");
        b1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        destination_floor = 1;
                        current_floor = Integer.parseInt(j1.getText());
                        if (current_floor > destination_floor) {
                            timer.start();
                            bl1.blinkingOn = !bl1.blinkingOn;
                            new ElevatorDown(bl1);

                        } else {
                            j1.setText(" ");
                        }
                    }

                });
        b1.setBounds(1, 50, 100, 50);
        jpp.add(b1);

        /*  Button for 2nd floor */

        b2 = new JButton("2");
        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        destination_floor = 2;
                        current_floor = Integer.parseInt(j1.getText());
                        if (current_floor > destination_floor) {
                            timer.start();
                            bl1.blinkingOn = !bl1.blinkingOn;
                            new ElevatorDown(bl1);

                        } else if (current_floor < destination_floor) {
                            timer.start();
                            bl.blinkingOn = !bl.blinkingOn;
                            new ElevatorUp(bl);

                        }
                    }
                });
        b2.setBounds(111, 50, 100, 50);
        jpp.add(b2);

        /*  Button for 3rd floor */

        b3 = new JButton("3");
        b3.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        destination_floor = 3;
                        current_floor = Integer.parseInt(j1.getText());
                        //System.out.println("Current floor " + current_floor);
                        if (current_floor > destination_floor) {
                            timer.start();
                            bl1.blinkingOn = !bl1.blinkingOn;
                            new ElevatorDown(bl1);

                        } else if (current_floor < destination_floor) {
                            timer.start();
                            bl.blinkingOn = !bl.blinkingOn;
                            new ElevatorUp(bl);


                        }
                    }
                });
        b3.setBounds(1, 120, 100, 50);
        jpp.add(b3);

        /*  Button for 4th floor */
        b4 = new JButton("4");
        b4.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        destination_floor = 4;
                        current_floor = Integer.parseInt(j1.getText());
                        if (current_floor > destination_floor) {
                            timer.start();
                            bl1.blinkingOn = !bl1.blinkingOn;
                            new ElevatorDown(bl1);

                        } else if (current_floor < destination_floor) {
                            timer.start();
                            bl.blinkingOn = !bl.blinkingOn;
                            new ElevatorUp(bl);

                        }
                    }
                });
        b4.setBounds(111, 120, 100, 50);
        jpp.add(b4);

        /*  Button for 5th floor */
        b5 = new JButton("5");
        b5.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        destination_floor = 5;
                        current_floor = Integer.parseInt(j1.getText());
                        if (current_floor > destination_floor) {
                            timer.start();
                            bl1.blinkingOn = !bl1.blinkingOn;
                            new ElevatorDown(bl1);

                        } else if (current_floor < destination_floor) {
                            timer.start();
                            bl.blinkingOn = !bl.blinkingOn;
                            new ElevatorUp(bl);

                        }
                    }
                });
        b5.setBounds(1, 190, 100, 50);
        jpp.add(b5);

        /*  Button for 6th floor */
        b6 = new JButton("6");
        b6.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        destination_floor = 6;
                        current_floor = Integer.parseInt(j1.getText());
                        if (current_floor < destination_floor) {
                            timer.start();
                            bl.blinkingOn = !bl.blinkingOn;
                            new ElevatorUp(bl);

                        } else {
                            j1.setText(" ");
                        }
                    }
                });
        b6.setBounds(111, 190, 100, 50);
        jpp.add(b6);

        /*  Button for fan */
        b7 = new JButton("F");
        b7.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        String f = L31.getText();
                        if(f.equals("FAN") || f.equals("FAN OFF")) {
                            new FanOn();
                        } else {
                            new FanOff();
                        }
                        // bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b7.setBounds(1, 260, 100, 50);
        jpp.add(b7);

        /* Button for Light */
        b8 = new JButton("L");
        b8.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        String l = L32.getText();
                        if(l.equals("LIGHT") || l.equals("LIGHT OFF")) {
                            new LightOn();
                        }else {
                            new LightOff();
                        }
                        // bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b8.setBounds(1, 330, 100, 50);
        jpp.add(b8);
        //jp.add(b);

        /* Button for door open */
        b9 = new JButton("O");
        b9.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        new DoorOpen();
                    }
                });
        b9.setBounds(111, 260, 100, 50);
        jpp.add(b9);

        /* Button for door close */
        b10 = new JButton("C");
        b10.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        new DoorClose();
                    }
                });
        b10.setBounds(111, 330, 100, 50);
        jpp.add(b10);

        frame.add(jp);
        frame.add(jpp);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(600, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ElevatorDesign();
            }
        });
    }
}


