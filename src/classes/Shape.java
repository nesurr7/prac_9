package classes;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {

    //Свойства
    protected Color color;
    protected int x, y;
    protected int height, length;
    /////////////
    Shape(Color color, int x, int y, int length, int height) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.length = length;
        this.height = height;
        setBounds(x,y,length,height);
    }
}