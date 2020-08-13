import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    static int MAX_LEVEL = 5;

    public static void mainDraw(Graphics graphics) {
        int height = HEIGHT / 2;
        int topX = (WIDTH / 2) + 100;
        int topY = 0;

        drawTriangle(graphics, height, topX, topY, 0);
    }

    private static void drawTriangle(Graphics graphics, int height, int topX, int topY, int level) {
        if (level > MAX_LEVEL) {
            return;
        }

        // double to int, 0.99 -> 0

        int rightX = (int) Math.round(topX + height * Math.tan(Math.toRadians(30)));
        int rightY = topY + height;

        int leftX = (int) Math.round(topX - height * Math.tan(Math.toRadians(30)));
        int leftY = topY + height;

        graphics.drawLine(topX, topY, rightX, rightY);
        graphics.drawLine(rightX, rightY, leftX, leftY);
        graphics.drawLine(leftX, leftY, topX, topY);

        // Apply recursion
        drawTriangle(graphics, height / 2, rightX, topY, level + 1);
        drawTriangle(graphics, height / 2, topX, topY + height, level + 1);
        drawTriangle(graphics, height / 2, leftX, topY, level + 1);
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