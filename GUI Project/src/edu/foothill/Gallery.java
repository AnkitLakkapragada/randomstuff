package edu.foothill;

import java.awt.*;
import javax.swing.*;

public class Gallery extends JFrame {


	public static void main(String[] args) {
		ControlsFrame controls = new ControlsFrame("Gallery");
		
		
		// Make sure the entire application exits when the ControlsFrame is closed.
		controls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controls.setSize(500, 250);
		controls.getContentPane().setLayout(null);
		
		controls.setVisible(true);
	}

}
