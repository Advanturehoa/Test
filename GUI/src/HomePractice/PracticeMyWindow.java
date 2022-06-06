package HomePractice;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * Class description: This is our implementation of specialized JFrame
 *
 * @author Hoa Le (855432)
 *
 */

public class PracticeMyWindow extends JFrame {

	//fields
	
	JButton button;
	/**
	 * Initializes the newly created PracticeMyWindow
	 *
	 */
	public PracticeMyWindow() {
		// call super class constructor
		super("Java Program"); // This is a title of the window
		// set a size

		setSize(500, 150);

		// when we close the window terminate the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create a new panel --> call method createPanel

		JPanel panel = createPanel();

		// add the new panel to our frame --> to have a content into the panel
		add(panel);

	}

	private JPanel createPanel() {
		// create new panel
		JPanel panel = new JPanel();

		// choose the layout
		/* panel.setLayout(new BorderLayout()); */

		/*
		 * //add some text --> using JLabel, text show in the window JLabel label = new
		 * JLabel ("This is Java Oriented Object"); panel.add(label); // add label into
		 * the panel
		 */
		// add button
		
		   button = new JButton ("This is button creating from OOP");
		  panel.add(button); // add button to panel
		  
		  
			/*
			 * // create an action listener using an anonymous ActionListener al = new
			 * ActionListener() { public void actionPerformed(ActionEvent e) {
			 * button.setText("I got you"); } };
			 */
			/* button.addActionListener(this); */
		  button.addActionListener(new MyActionListener());// create instance of the inner class
		  
			/*
			 * // add that listener to the button button.addActionListener(al);
			 */
		 
		// add check box
		/*
		 * JCheckBox checkBox1 = new JCheckBox ("Java"); JCheckBox checkBox2 = new
		 * JCheckBox ("C"); JCheckBox checkBox3 = new JCheckBox ("C++"); JCheckBox
		 * checkBox4 = new JCheckBox ("Python");
		 * 
		 * JRadioButton radioButton = new JRadioButton ("Java");
		 */

		// Add check box to the panel

		/*
		 * panel.add(checkBox1); panel.add(checkBox2); panel.add(checkBox3);
		 * panel.add(checkBox4); panel.add(radioButton);
		 */

		/*
		 * This is only work with using borderlayout JButton buttonWest = new JButton
		 * ("west"); panel.add(buttonWest, BorderLayout.WEST);
		 * 
		 * JButton buttonSouth = new JButton ("south"); panel.add(buttonSouth,
		 * BorderLayout.SOUTH);
		 * 
		 * JButton buttonNorth = new JButton ("north"); panel.add(buttonNorth,
		 * BorderLayout.NORTH);
		 * 
		 * JButton buttonEast = new JButton ("east"); panel.add(buttonEast,
		 * BorderLayout.EAST);
		 */
		// return it
		return panel;
	}
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			button.setText("I have been clicked");
			
		}
	}
	

}
