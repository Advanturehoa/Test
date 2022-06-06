package HomePracticeGui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
* Class description:
*
* @author Hoa Le (855432)
*
*/

public class AnimalWindow extends JFrame {
	//fiels
	
	JPanel  cardPanel;
	CardLayout cards;
	JButton dogButton;
	JButton catButton;
	JButton dogHomeButton;
	JButton catHomeButton;
	public AnimalWindow () {
		//call super class constructor
		super("Pet Program");
		// set a size
		setSize(400,150);
		// set what happen when window closes
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * // create and add panel(s)
		 * 
		 * add(createHomePanel());
		 */
		
		/* create a new panel and add home panel into it to meet card layout */
		// create a new panel represent all of the contents
		cardPanel = new JPanel();
		// apply this card layout to that panel
		 cards = new CardLayout();
		cardPanel.setLayout(cards);
		// add specific panels to each card
		cardPanel.add("home", createHomePanel());
		cardPanel.add("dog", createDogPanel());
		cardPanel.add("cat", creatCatPanel());
		// pick which card to show
		
		cards.show(cardPanel, "home");
		
		//finally add to the frame
		this.add(cardPanel);
	}
	private JPanel createHomePanel () {
		JPanel panel = new JPanel();
		
		//change layout
		
		panel.setLayout(new BorderLayout());
		// add top
		JPanel topPanel = createTopPanel();
		panel.add(topPanel);
		// add bottom
		panel.add(createBottomPanel(), BorderLayout.SOUTH);
		//or
		/*
		 * JPanel bottonPanel = createBottomPanel(); panel.add(bottonPanel);
		 */
		return panel;
	}
	private JPanel createTopPanel () {
		JPanel panel = new JPanel ();
		
		
		//label
		
		JLabel lable = new JLabel("Choose your option");
		panel.add(lable);
		
		return panel;		
	}
	
	private JPanel createBottomPanel () {
		JPanel panel = new JPanel ();
		
		//2 bottoms
		
		catButton = new JButton("cat"); 
		dogButton = new JButton("dog");
		
		
		// connect to button
		
		dogButton.addActionListener(new MyActionListener());
		catButton.addActionListener(new MyActionListener());
		// add button to panel
		panel.add(catButton);
		panel.add(dogButton);
		return panel;
	}
	
	private JPanel createDogPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		//create a top half of dog panel
		JPanel topPanel = new JPanel();
		
		//add content 
		JLabel label = new JLabel ("Welcome to Dog Program");
		//add content to top panel
		topPanel.add(label);
		
		//add position to topPanel
		panel.add(topPanel, BorderLayout.NORTH);
		
		//create top half panel
		JPanel bottomPanel = new JPanel();
		
		//add content to bottom panel
		
		//create home button at dog panel
		
		dogHomeButton = new JButton("Home");
		// add home bottom into the frame
		bottomPanel.add(dogHomeButton);
		//connect action into button
		
		dogHomeButton.addActionListener(new MyActionListener());
		//add position to the bottom panel
		panel.add(bottomPanel, BorderLayout.SOUTH);
				
		
		return panel;
	}
	
	private JPanel creatCatPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		//create top of half cat panel
		JPanel topPanel = new JPanel();
		
		//add content to top panel
		JLabel label = new JLabel ("Wecome to cat Program");
		topPanel.add(label);
		
		// add position into top panel
		panel.add(topPanel, BorderLayout.NORTH);
		
		//create bottom half cat panel
		
		JPanel bottonPanel = new JPanel();
		//create button to bottom half panel
		
		catHomeButton = new JButton("Home");
		//add this button into panel
		bottonPanel.add(catHomeButton);
		//connect action event into catHomeButton
		catHomeButton.addActionListener(new MyActionListener());
		//add position into button panel
		
		panel.add(bottonPanel,BorderLayout.SOUTH);
		return panel;
	}
	
	private class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==dogButton) {
			cards.show(cardPanel,"dog");
			}
			else if(e.getSource()==catButton) {
				cards.show(cardPanel,"cat");
			}
			else if(e.getSource()==dogHomeButton) {
				cards.show(cardPanel,"home");
			}
			else if(e.getSource()==catHomeButton) {
				cards.show(cardPanel,"home");
			}
			
		}
	}

	
}
