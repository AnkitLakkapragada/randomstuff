package edu.foothill;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlsFrame extends JFrame {

	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	JLabel welcome = new JLabel("Choose a poster from the dropdown");
	JLabel text1 = new JLabel("Movie Poster");
	JButton b = new JButton("Set Size");
	JPanel panel = new JPanel();
	JPanel secondPanel = new JPanel();
	String[] movieStrings = { "Tron", "Matrix", "Captain America" , "Titanic", "Star Trek", "Star Wars", "AntMan",
			"Harry Potter", "Anchorman", "Dracula" };
	JComboBox<String> movieList = new JComboBox<String>(movieStrings);

	public ControlsFrame() throws HeadlessException {
		// TODO Auto-generated constructor stub

		panel.setLayout(new BorderLayout());
		secondPanel.setLayout(new BorderLayout());

		panel.add(welcome);
		secondPanel.add(text1, BorderLayout.WEST);
		panel.add(b, BorderLayout.SOUTH);
		movieList.setSelectedIndex(0);
		panel.add(movieList, BorderLayout.SOUTH);

		add(panel, BorderLayout.NORTH);
		add(secondPanel, BorderLayout.PAGE_END);

	}

	public ControlsFrame(GraphicsConfiguration gc) {
		super(gc);

		panel.setLayout(new BorderLayout());
		secondPanel.setLayout(new BorderLayout());

		panel.add(welcome);
		secondPanel.add(text1, BorderLayout.WEST);
		panel.add(b, BorderLayout.SOUTH);
		movieList.setSelectedIndex(0);
		panel.add(movieList, BorderLayout.SOUTH);

		add(panel, BorderLayout.NORTH);
		add(secondPanel, BorderLayout.PAGE_END);
		// TODO Auto-generated constructor stub
	}

	public ControlsFrame(String title) throws HeadlessException {
		super(title);

		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 488, 50);
		getContentPane().add(panel);

		JLabel lblNewLabel = new JLabel("Choose a poster from the dropdown");
		panel.add(lblNewLabel);

		JLabel lblMoviePoster = new JLabel("Movie Poster");
		lblMoviePoster.setBounds(67, 68, 139, 16);
		getContentPane().add(lblMoviePoster);

		movieList.setBounds(21, 96, 167, 27);
		getContentPane().add(movieList);

		JLabel lblWidth = new JLabel("Width:");
		lblWidth.setBounds(187, 87, 41, 16);
		getContentPane().add(lblWidth);

		JLabel lblLength = new JLabel("Length:");
		lblLength.setBounds(329, 87, 61, 16);
		getContentPane().add(lblLength);

		tf1.setBounds(390, 84, 78, 21);
		getContentPane().add(tf1);
		tf1.setColumns(10);

		tf2.setColumns(10);
		tf2.setBounds(239, 84, 78, 21);
		getContentPane().add(tf2);

		JButton btnSetSize = new JButton("Set Size");
		btnSetSize.setBounds(273, 115, 117, 29);
		getContentPane().add(btnSetSize);

		ImageDisplay a = new ImageDisplay();
		a.main(null);

		movieList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String selected = movieList.getSelectedItem().toString();
				a.setImagePath(selected + ".jpg");
				a.jFrame.getContentPane().removeAll();
				a.main(null);

			}

		});
		
		btnSetSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				
					int frameW = Integer.parseInt(tf1.getText());
					int frameH = Integer.parseInt(tf2.getText());
					a.jFrame.setSize(frameH, frameW);
					//a.jFrame.revalidate();
				
				
			}
		});

		// TODO Auto-generated constructor stub
	}

	public ControlsFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);

		panel.setLayout(new BorderLayout());
		secondPanel.setLayout(new BorderLayout());

		panel.add(welcome);
		panel.add(text1);
		panel.add(b);
		movieList.setSelectedIndex(0);
		panel.add(movieList);

		add(panel, BorderLayout.NORTH);
		add(secondPanel, BorderLayout.EAST);
		// TODO Auto-generated constructor stub
	}

}
