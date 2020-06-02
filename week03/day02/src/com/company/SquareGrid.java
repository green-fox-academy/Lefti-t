import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {


    public static void mainDraw(Graphics graphics) {
        int size = WIDTH / 2;
        int x = (HEIGHT / 4) ;
        int y = (WIDTH / 4) ;

        Graphics2D g2d = (Graphics2D) graphics;
        drawSquare(g2d,x, y, size,0);
    }

    public static void drawSquare(Graphics2D graphics, int x, int y, int size,int level) {
        if (level > 3) {
            return;
        }
        BasicStroke stroke = new BasicStroke(size/15);
        graphics.setStroke(stroke);


        graphics.drawRect(x,y,size,size);

// Recursion
        drawSquare(graphics,x- size / 4, y - size / 4, size /2 ,level +1);
        drawSquare(graphics,x + size - size /4   , y - size / 4, size /2 ,level +1);
        drawSquare(graphics,x- size / 4, y + size - size / 4, size /2 ,level +1);
        drawSquare(graphics,x + size - size / 4, y + size - size / 4, size /2 ,level +1);

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