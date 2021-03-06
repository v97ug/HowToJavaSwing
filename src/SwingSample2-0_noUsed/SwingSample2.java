import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingSample2 {

	public static void main(String[] args) {
		SwingSample2 sample2 = new SwingSample2();
	}

	public SwingSample2() {
		JFrame frame = new JFrame("title2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);

		MyJPanel myJPanel = new MyJPanel();
		frame.getContentPane().add(myJPanel);

		myJPanel.setBounds(0, 0, 300, 300); // 学内環境だと必要
	}

	class MyJPanel extends JPanel {

		@Override
		public void paintComponent(Graphics g) {
			g.setColor(Color.BLUE);
			g.fillOval(0, 0, 100, 100);
			
			g.setColor(Color.YELLOW);
			g.drawOval(100, 0,100 , 100);
			
			g.setColor(Color.RED);
			g.drawOval(200, 0,100 , 100);
			
			g.setColor(Color.BLACK);
			g.drawRect(0, 0, 300, 100);
			
			g.setColor(Color.GREEN);
			g.drawLine(150, 100, 150, 300);
			
			g.setColor(Color.YELLOW);
			g.fillArc(200, 200, 100, 100, 30, 300);
		}
	}
}
