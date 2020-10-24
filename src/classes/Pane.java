package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Pane extends JPanel {
    int PANE_LENGTH = MyWindow.PANE_LENGTH;
    int PANE_HEIGHT = MyWindow.PANE_HEIGHT;
    ArrayList<Shape> myShapes = new ArrayList<>();
    private JButton button = new JButton("Repaint");

    public Color randomColor() {
        int type = ((int) (Math.random() * 175)) % 7;
        return switch (type) {
            case 1 -> Color.red;
            case 2 -> Color.green;
            case 3 -> Color.BLUE;
            case 4 -> Color.CYAN;
            case 5 -> Color.MAGENTA;
            case 6 -> Color.YELLOW;
            default -> Color.pink;
        };
    }

    public int generatePosX() {
        return ((int) (Math.random() * (PANE_LENGTH)) % (PANE_LENGTH - 100));

    }

    public int generatePosY() {
        return ((int) (Math.random() * (PANE_HEIGHT)) % (PANE_HEIGHT - 100));

    }

    public Shape generate() {
        int type = (((int) (Math.random() * 100)) % 4);
        switch (type) {
            case 0 -> {
                return new Oval(randomColor(), generatePosX(), generatePosY(), 50, 100);
            }
            case 1 -> {
                return new Rectangle(randomColor(), generatePosX(), generatePosY(), 100, 50);
            }
            case 2 -> {
                return new Oval(randomColor(), generatePosX(), generatePosY(), 50, 50);
            }
            case 3 -> {
                return new Rectangle(randomColor(), generatePosX(), generatePosY(), 50, 50);
            }
        }
        return null;
    }

    public Pane() {
        setLayout(null);
        addShapes();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myShapes.clear();
                remove(button);
                addShapes();
                repaint();
            }
        });
        button.setBounds((PANE_LENGTH / 2) - 50, (PANE_HEIGHT / 2) - 20, 100, 40);
        add(button);
    }

    public void addShapes() {
        for (int i = 0; i < 20; i++) {
            Shape shape = generate();
            myShapes.add(shape);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Shape shape : myShapes) {
            shape.paintComponents(g);
        }

    }
}
