import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame frame;

    public GUI() {
        config();
        drawBackground();
    }

    private void drawBackground() {
        frame.getContentPane().setBackground(Color.lightGray);
    }

    public void config() {
        this.frame = new JFrame();
        // this exits the program when closing the GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Ultimate Chess");
        frame.setSize(400, 300);
        frame.setVisible(true);
            }
}
