//Java program of Swing to demonstrate JTable with ListSelectionListener.

package src.com.mkpits.java.swingexamples;

import javax.swing.*;
import javax.swing.event.*;

public class SwingExToDemonstrateJTableWithListSelectionListener {
    public static void main(String[] a) {
        JFrame f = new JFrame("Table Example");
        String data[][] = {{"01", "Mayuri", "45000"},
                {"02", "Aboli", "34000"},
                {"03", "Sharvari", "50000"}};
        String column[] = {"ID", "NAME", "SALARY"};
        final JTable jt = new JTable(data, column);
        jt.setCellSelectionEnabled(true);
        ListSelectionModel select = jt.getSelectionModel();
        select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        select.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String Data = null;
                int[] row = jt.getSelectedRows();
                int[] columns = jt.getSelectedColumns();
                for (int i = 0; i < row.length; i++) {
                    for (int j = 0; j < columns.length; j++) {
                        Data = (String) jt.getValueAt(row[i], columns[j]);
                    }
                }
                System.out.println("Table element selected is: " + Data);
            }
        });
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
