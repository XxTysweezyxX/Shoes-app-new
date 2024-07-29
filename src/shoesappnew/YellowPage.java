package shoesappnew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class YellowPage extends JFrame {

	public YellowPage() {
	    // Set up the JFrame
	    setTitle("Yellow Page");
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	    setLocationRelativeTo(null);

	    // Create a panel to hold the components
	    JPanel mainPanel = new JPanel(new BorderLayout());

	    // Create the heading label
	    JLabel headingLabel = new JLabel("This is the Jordan 1 Mid new love Sneaker");
	    headingLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    headingLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    mainPanel.add(headingLabel, BorderLayout.NORTH);

	    // Create the image panel with GridBagLayout
	    JPanel imagePanel = new JPanel(new GridBagLayout());
	    mainPanel.add(imagePanel, BorderLayout.WEST);

	    // Create the image label
	    ImageIcon imageIcon = new ImageIcon("img/yellow jordan new.jpg"); // Replace with your image path
	    JLabel imageLabel = new JLabel(imageIcon);
	    imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

	    // Set up GridBagConstraints for imageLabel
	    GridBagConstraints constraints = new GridBagConstraints();
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.fill = GridBagConstraints.BOTH;
	    constraints.weightx = 1.0;
	    constraints.weighty = 1.0;
	    imagePanel.add(imageLabel, constraints);

	    // Create the text area
	    JTextArea textArea = new JTextArea("The Air Jordan 1 Mid \"New Love\" is a popular sneaker model released by Nike's Jordan Brand. It is a variation of the iconic Air Jordan 1 silhouette, which was originally introduced in 1985. The \"New Love\" colorway is inspired by Michael Jordan's love for the game of basketball and his passion for the sport.");
	    textArea.setEditable(false);
	    textArea.setFont(textArea.getFont().deriveFont(20f));
	    textArea.setLineWrap(true);
	    textArea.setWrapStyleWord(true);
	    textArea.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	    JScrollPane scrollPane = new JScrollPane(textArea);
	    scrollPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
	    mainPanel.add(scrollPane, BorderLayout.CENTER);

	    // Create the buttons panel
	    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    JButton previousButton = new JButton("Previous Shoe");
	    JButton menuButton = new JButton("Menu");
	    JButton nextButton = new JButton("Next Shoe");

	    // Add action listeners to the buttons
	    previousButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            new BluePage();
	            dispose();
	        }
	    });

	    menuButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            new MenuPage();
	            dispose();
	        }
	    });

	    nextButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            new RedPage();
	            dispose();
	        }
	    });

	    // Add the buttons to the button panel
	    buttonPanel.add(previousButton);
	    buttonPanel.add(menuButton);
	    buttonPanel.add(nextButton);
	    mainPanel.add(buttonPanel, BorderLayout.SOUTH);

	    // Add the main panel to the frame
	    add(mainPanel);

	    // Display the frame
	    setVisible(true);
	}

	
}



