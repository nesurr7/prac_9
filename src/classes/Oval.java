package classes;

import java.awt.*;

public class Oval extends Shape {

    Oval(Color color, int x , int y,int length , int height) {
        super(color ,x , y,height,length);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillOval(0, 0, length, height);
    }
}
