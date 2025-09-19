import javax.swing.*;
import java.awt.*;

public class Lines extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4)); // Line thickness: 4 pixels

        g2.setColor(Color.RED);
        g2.drawLine(50, 50, 250, 50);

        g2.setColor(Color.GREEN);
        g2.drawLine(50, 80, 250, 80);

        g2.setColor(Color.BLUE);
        g2.drawLine(50, 110, 250, 110);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Three Parallel Lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null); // Center the window
        frame.add(new Lines());
        frame.setVisible(true);
    }
}
