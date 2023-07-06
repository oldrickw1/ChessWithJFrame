import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;
    private Model model;

    public View() {
        config();
        drawBoard();
    }

    private void drawBoard() {


    }

    public void config() {
        this.frame = new JFrame("Ultimate Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(8,8));


        for (int i = 1; i <= 64; i++) {
            JButton btn = new JButton(Integer.toString(i));
            btn.setFocusable(false);
            frame.add(btn);
        }
        frame.setVisible(true);
    }
}
