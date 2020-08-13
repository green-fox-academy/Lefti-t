
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.


        int x1 = 0;
        int x2 = 320;
        int y1 = 0;
        int y2 = 320;

        for (int i = 0; i < 17; i++) {
            graphics.setColor(Color.red);
            drawLine(i * (x1 + 20), y1, graphics);

            drawLine(x1, i * (y1 + 20), graphics);

            drawLine(i * (x1 + 20), y2, graphics);

            drawLine(x2, i * (y1 + 20), graphics);

        }
    }


    public static void drawLine(int x, int y, Graphics graphics) {


        graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);


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