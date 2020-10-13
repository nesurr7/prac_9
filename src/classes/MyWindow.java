package classes;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame{
    public static int PANE_LENGTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static int PANE_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    public MyWindow() {
        setTitle("Фигуры");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(PANE_LENGTH, PANE_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        add(new Pane());
    }

    public static void main(String[] args) {
        setDefaultLookAndFeelDecorated(true);
        MyWindow wnd =new MyWindow();
    }

}
