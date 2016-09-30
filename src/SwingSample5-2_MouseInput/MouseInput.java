import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by takeyuki on 16/08/03.
 */
public class MouseInput {
    public static void main(String[] args) {
        MouseInput mouseInput = new MouseInput();
    }

    public MouseInput() {
        JFrame frame = new JFrame("title2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        MyJPanel myJPanel = new MyJPanel();
        frame.getContentPane().add(myJPanel);

        myJPanel.setBounds(0, 0, 300, 300);

        myJPanel.addMouseListener(myJPanel);
    }

    class MyJPanel extends JPanel implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            Graphics g = getGraphics();
            g.drawString("Clicked", e.getX(), e.getY());
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
