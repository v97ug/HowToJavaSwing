import java.awt.*;
import javax.swing.*;

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
			g.drawString("Hello, world!", 100, 100);
		}
	}
}


