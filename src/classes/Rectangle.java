package classes;

import java.awt.*;

public class Rectangle extends Shape {
    Rectangle(Color color,int x,int y , int length , int height) {
        super(color ,x,y,length ,height);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillRect(0, 0, length, height);
    }
}
