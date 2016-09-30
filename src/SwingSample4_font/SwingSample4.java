import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingSample4 {
	public static void main(String[] args) {
		SwingSample4 sample4 = new SwingSample4();
	}
	
	public SwingSample4() {
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
			g.setColor(Color.GREEN);
			g.setFont(new Font("Arial", Font.BOLD, 30));
			g.drawString("Hello, world!", 100, 100);
		}
	}
}
