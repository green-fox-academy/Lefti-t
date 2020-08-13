
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {



        int x1 = 40;
        int x2 = 20;
        int y1 = 40;
        int y2 = 20;

        graphics.setColor(Color.white);
        graphics.fillRect(0,0,320,320);

        for (int i = 0; i < 15; i++) {
            graphics.setColor(Color.blue);
            graphics.drawLine(x1, 0, WIDTH ,y2);
            graphics.setColor(Color.green);
            graphics.drawLine(0, y1, x2 ,HEIGHT);


            x1 += 20;
            y1 += 20;
            x2 += 20;
            y2 += 20;
        }
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