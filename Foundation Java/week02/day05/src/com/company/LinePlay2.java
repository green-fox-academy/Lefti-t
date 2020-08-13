
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay2 {
    public static void mainDraw(Graphics graphics) {
        int div = 2;

        int x1 = 40 /div;
        int x2 = 20/ div;
        int y1 = 40/ div;
        int y2 = 20/ div;

        for (int i = 0; i < 4; i++) {

            draw(x1, y1, x2, y2, graphics);


        }
    }


    public static void draw(int x1,int y1, int x2, int y2, Graphics graphics) {

        int div = 2;


        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, 320, 320);

        for (int i = 0; i < 15; i++) {
            graphics.setColor(Color.blue);
            graphics.drawLine(x1, 0, WIDTH / div, y2);
            graphics.setColor(Color.green);
            graphics.drawLine(0, y1, x2, HEIGHT / div);



            x1 += 20 / div;
            y1 += 20 / div;
            x2 += 20 / div;
            y2 += 20 / div;
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