//Java program of Swing to demonstrate JEditorPane.

package src.com.mkpits.java.swingexamples;

import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class SwingExToDemonstrateJEditorPane {
    JFrame myFrame = null;

    public static void main(String[] args) {
        (new SwingExToDemonstrateJEditorPane()).test();
    }

    private void test() {
        myFrame = new JFrame("JEditorPane Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400, 200);
        JEditorPane myPane = new JEditorPane();
        myPane.setContentType("text/plain");
        myPane.setText("Health is a state of physical, mental and social well-being in which disease and infirmity are absent."
                + " Generally, the context in which an individual lives is of great importance for both his health status and quality of life."
                + " It is increasingly recognized that health is maintained and improved not only through the advancement and application of health science, "
                + "but also through the efforts and intelligent lifestyle choices of the individual and society. ");
        myFrame.setContentPane(myPane);
        myFrame.setVisible(true);
    }
}
