import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame;

    public GUI() {
        config();
        drawBackground();
    }

    private void drawBackground() {
        frame.getContentPane().setBackground(new Color(0x123456));

    }

    public void config() {
        this.frame = new JFrame("Ultimate Chess");
        // this exits the program when closing the GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 700);
        frame.setVisible(true);
    }
}
