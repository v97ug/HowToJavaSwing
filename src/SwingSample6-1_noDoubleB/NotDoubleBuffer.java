import javax.swing.*;
import java.awt.*;

public class NotDoubleBuffer {
    public static void main(String[] args) {
        NotDoubleBuffer notDoubleBuffer = new NotDoubleBuffer();
    }

    public NotDoubleBuffer() {
        JFrame frame = new JFrame("title2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

        MyJPanel myJPanel = new MyJPanel();
        frame.getContentPane().add(myJPanel);

        myJPanel.setBounds(0, 0, 300, 300); // 学内環境だと必要
        myJPanel.game();
    }

    class MyJPanel extends JPanel {
        Graphics g;

        public void game() {
            g = getGraphics();

            int x = 0;

            while(true){
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, 300, 300);
                g.setColor(Color.CYAN);
                g.fillRect(x, 0, 100, 100);

                x++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
