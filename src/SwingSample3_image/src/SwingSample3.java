import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingSample3 {

	public static void main(String[] args) {
		SwingSample3 swingSample3 = new SwingSample3();
	}

	public SwingSample3() {
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
			try {
				Image image = ImageIO.read(new File("image/huukei.jpg"));
				g.drawImage(image, 0, 0, this);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
