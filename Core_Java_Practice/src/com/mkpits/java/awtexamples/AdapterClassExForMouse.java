//Java program to demonstrate how to handle mouse event using Adapter class.

package src.com.mkpits.java.awtexamples;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;

public class AdapterClassExForMouse extends Frame {
    public AdapterClassExForMouse() {
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        AdapterClassExForMouse ad = new AdapterClassExForMouse();
    }
}

class MyMouseAdapter extends MouseAdapter {
    AdapterClassExForMouse adapterdemo;

    public MyMouseAdapter(AdapterClassExForMouse adapterdemo) {
        this.adapterdemo = adapterdemo;
    }

    //handle mouseclicked event
    public void mouseClicked(MouseEvent me) {
        System.out.println("mouse clicked" + me.getX() + "," + me.getY());
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter {
    AdapterClassExForMouse adapterdemo;

    public MyMouseMotionAdapter(AdapterClassExForMouse adapterdemo) {
        this.adapterdemo = adapterdemo;
    }

    //handle mouse dragged
    public void mouseDragged(MouseEvent me) {
        System.out.println("mouse dragged");
    }

}
