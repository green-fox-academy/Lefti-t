
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.


        graphics.setColor(Color.RED);
        graphics.fillRect(WIDTH/2 - 160 ,HEIGHT / 2 - 160, 320, 320);

        graphics.setColor(Color.yellow);
        graphics.fillRect(WIDTH/2 - 137 ,HEIGHT / 2 - 137, 275, 275);

        graphics.setColor(Color.blue);
        graphics.fillRect(WIDTH/2 - 105 ,HEIGHT / 2 - 105, 215, 215);

        graphics.setColor(Color.red);
        graphics.fillRect(WIDTH/2 - 75 ,HEIGHT / 2 - 75, 150, 150);


        graphics.setColor(Color.yellow);
        graphics.fillRect(WIDTH/2 - 50 ,HEIGHT / 2 - 50, 100, 100);

        graphics.setColor(Color.blue);
        graphics.fillRect(WIDTH/2 - 37 ,HEIGHT / 2 - 37, 75, 75);

        graphics.setColor(Color.red);
        graphics.fillRect(WIDTH/2 - 25 ,HEIGHT / 2 - 25, 50, 50);

        graphics.setColor(Color.yellow);
        graphics.fillRect(WIDTH/2 - 12 ,HEIGHT / 2 - 12, 25, 25);


        graphics.setColor(Color.blue);
        graphics.fillRect(WIDTH/2 - 5 ,HEIGHT / 2 - 5, 10, 10);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}