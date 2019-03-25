package edu.foothill;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageDisplay extends JPanel {
	JFrame jFrame = new JFrame();
	public String imagePath = "tron.jpg";
	

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
		this.repaint(); 
		
		
		
	}

	public void paint(Graphics g) {
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage(imagePath);
		g.drawImage(i, 0, 0, this);
	}

	public void main(String[] args) {
		ImageDisplay imageDisplay = new ImageDisplay();
		
		
		imageDisplay.setImagePath(imagePath);
		jFrame.add(imageDisplay);
		jFrame.setSize(600, 900);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
		// Change from the default loading.gif to display a movie poster
		
	}

}
