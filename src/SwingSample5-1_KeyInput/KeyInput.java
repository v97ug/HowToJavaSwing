import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput {
    public static void main(String[] args) {
        KeyInput keyInput = new KeyInput();
    }

    public KeyInput() {
        JFrame frame = new JFrame("title2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        MyJPanel myJPanel = new MyJPanel();
        frame.getContentPane().add(myJPanel);

        myJPanel.setBounds(0, 0, 300, 300);

        myJPanel.setFocusable(true);
        myJPanel.addKeyListener(myJPanel);
    }

    class MyJPanel extends JPanel implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            Graphics g = getGraphics();

            g.setColor(Color.WHITE);
            g.fillRect(0,0,200,200);

            g.setColor(Color.BLACK);
            g.drawString(e.getKeyChar() + "is pressed", 100, 100);
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
