package guiPractice;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;



/**
 * Class description:
 *
 * @author Hoa Le (855432)
 *
 */

public class AnimalWindow extends JFrame {

	//Fields
	private JPanel cardPanel;
	private CardLayout cards;
	private JButton dogButton;
	private JButton catButton;
	private JButton homeButton1;
	private JButton homeButton2;



	public AnimalWindow() {

		//Call the superclass constructor
		super("Welcome to the Pet Selector");

		// set the size 
		this.setSize (400,200);

		//set what happen when the window closes
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//create and add panel()
		//JPanel panel = createPanel();
		//this.add(createHomePanel());
		//create a panel that represent all of the content
		cardPanel = new JPanel();

		//apply the card layout to that panel

		cards = new CardLayout ();
		cardPanel.setLayout(cards);

		//add the specific panel to each card
		cardPanel.add("home", createHomePanel());
		cardPanel.add("dog", createDogPanel());
		cardPanel.add("cat", createCatPanel());
		//cardPanel.add("home", createDogPanel());

		//pick card to show		
		cards.show(cardPanel, "home");

		// add this the frame

		this.add(cardPanel);

	}
	private JPanel  createHomePanel () {
		JPanel panel = new JPanel();
		//change the layout
		panel.setLayout(new BorderLayout());

		//add top panel --> 
		panel.add(createTopPanel());
		//add bottom panel
		panel.add(createBottonPanel(), BorderLayout.SOUTH);
		//or JPanel topPanel = createTopPanel();
		// panel.add(topPanel);
		return panel;
	}

	private JPanel createTopPanel () {
		JPanel panel = new JPanel();

		//label
		JLabel lable = new JLabel ("What is best");
		panel.add(lable);

		return panel;
	}

	private JPanel createBottonPanel() {
		JPanel panel = new JPanel();

		//two bottoms
		dogButton = new JButton("Dog");	
		catButton = new JButton("Cat");

		// add action to the button
		dogButton.addActionListener(new MyActionListener ());
		catButton.addActionListener(new MyActionListener ());
		panel.add(dogButton);
		panel.add(catButton);

		return panel;


	}
	/**
	 * create dog card
	 * @return dog card panel
	 */
	private JPanel createDogPanel () {
		JPanel panel = new JPanel();
		JLabel lable = new JLabel ("yes, yes this a dog");
		panel.add(lable);
		//create home button at the dog card
		homeButton1 = new JButton("Home");
		//panel.setLayout(new BorderLayout());
		// add button into the dog card

		panel.add(homeButton1);
		homeButton1.addActionListener(new MyActionListener ());
		return panel;
	}
	/**
	 * create cat card
	 * @return cat card panel
	 */
	private JPanel createCatPanel () {
		JPanel panel = new JPanel();
		JLabel lable = new JLabel ("wow wo this is a cat");

		panel.add(lable);
		//create home button at the dog card
		homeButton2 = new JButton("Home");

		// add button into the dog card

		panel.add(homeButton2);
		homeButton2.addActionListener(new MyActionListener ());


		return panel;
	}
	private class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==dogButton) {
				cards.show(cardPanel, "dog");
			}

			else if(e.getSource()==catButton) {
				cards.show(cardPanel, "cat");
			}
			else if(e.getSource()==homeButton1) {
				cards.show(cardPanel, "home");
			}
			else if(e.getSource()==homeButton2) {
				cards.show(cardPanel, "home");
			}




		}

	}
}
