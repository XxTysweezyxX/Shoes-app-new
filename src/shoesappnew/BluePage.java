package shoesappnew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class BluePage extends JFrame {

	public BluePage() {
	    // Set up the JFrame
	    setTitle("Blue Page");
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	    setLocationRelativeTo(null);

	    // Create a panel to hold the components
	    JPanel mainPanel = new JPanel(new BorderLayout());

	    // Create the heading label
	    JLabel headingLabel = new JLabel("This is the Jordan 1 Retro High Obsidian");
	    headingLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    headingLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    mainPanel.add(headingLabel, BorderLayout.NORTH);

	    // Create the image panel with GridBagLayout
	    JPanel imagePanel = new JPanel(new GridBagLayout());
	    mainPanel.add(imagePanel, BorderLayout.WEST);

	    // Create the image label
	    ImageIcon imageIcon = new ImageIcon("img/blue jordan new.png"); // Replace with your image path
	    JLabel imageLabel = new JLabel(imageIcon);
	    imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    imagePanel.add(imageLabel);
	    mainPanel.add(imagePanel, BorderLayout.WEST);

	    // Set up GridBagConstraints for imageLabel
	    GridBagConstraints constraints = new GridBagConstraints();
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    constraints.fill = GridBagConstraints.BOTH;
	    constraints.weightx = 1.0;
	    constraints.weighty = 1.0;
	    imagePanel.add(imageLabel, constraints);

	    // Create the text area
	    JTextArea textArea = new JTextArea("The Jordan 1 Retro High Obsidian draws inspiration from the original Air Jordan 1 silhouette, which was first introduced in 1985. It features a combination of leather and synthetic materials in its construction. The shoe's upper is predominantly dressed in an obsidian blue color, which is a deep navy shade. The Sail color is used for the midsole, while the outsole is done in a contrasting university blue tone. The iconic Jordan Wings logo is present on the side of the shoe, and the Nike Swoosh appears on both sides.");
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
	            new RedPage();
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
	            new YellowPage();
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


