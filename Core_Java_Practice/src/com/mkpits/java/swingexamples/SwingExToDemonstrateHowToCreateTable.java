//Java program of Swing to demonstrate how to create Table.

package src.com.mkpits.java.swingexamples;

import javax.swing.*;

public class SwingExToDemonstrateHowToCreateTable {
    JFrame f;

    SwingExToDemonstrateHowToCreateTable() {
        f = new JFrame();
        String data[][] = {{"01", "Mayuri", "250000"},
                {"02", "Aboli", "80000"},
                {"03", "Sharvari", "70000"}};
        String column[] = {"ID", "NAME", "SALARY"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingExToDemonstrateHowToCreateTable();
    }
}
