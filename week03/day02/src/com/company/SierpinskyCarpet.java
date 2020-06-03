import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {


    public static void mainDraw(Graphics graphics) {
        int size = WIDTH / 4;
        int x =  (HEIGHT / 3);
        int y = (WIDTH / 3);

        fillSquare(graphics,x, y, size);
    }

    public static void fillSquare(Graphics graphics, int x, int y, int size) {
        if (size < 2) {
            return;
        }
        graphics.fillRect(x,y,size,size);
// Recursion
      fillSquare (graphics,size / 2, (size / 2), size/3);
      fillSquare (graphics,  size / 2  ,HEIGHT - size   , size /3);
      fillSquare (graphics, WIDTH - size, (size / 2), size/3   );
      fillSquare ( graphics,WIDTH - size, HEIGHT - size  , size/3);
        fillSquare(graphics,WIDTH - size, y + size / 3, size / 3);
        fillSquare(graphics,size / 2, y + size / 3, size / 3);
        fillSquare(graphics,x + size / 3, HEIGHT - size, size / 3);
        fillSquare(graphics,x + size / 3, (size / 2), size / 3);



    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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