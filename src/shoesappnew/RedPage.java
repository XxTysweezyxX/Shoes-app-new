package shoesappnew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RedPage extends JFrame {

	public RedPage() {
	    // Set up the JFrame
	    setTitle("Red Page");
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	    setLocationRelativeTo(null);

	    // Create a panel to hold the components
	    JPanel mainPanel = new JPanel(new BorderLayout());

	    // Create the heading label
	    JLabel headingLabel = new JLabel("This is the Jordan 1 chicago High (not really)");
	    headingLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    headingLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    mainPanel.add(headingLabel, BorderLayout.NORTH);

	    // Create the image panel
	    JPanel imagePanel = new JPanel();
	    ImageIcon imageIcon = new ImageIcon("img/red jordan.jpg");
	    JLabel imageLabel = new JLabel(imageIcon);
	    imagePanel.add(imageLabel);
	    mainPanel.add(imagePanel, BorderLayout.WEST);

	    // Create the text area
	    JTextArea textArea = new JTextArea("The Jordan 1 Chicago High features a classic and timeless design. It pays homage to the original Air Jordan 1 silhouette that was first released in 1985. The shoe features a predominantly white leather upper with contrasting red overlays on the toe box, heel, and ankle collar. The iconic black Nike Swoosh is prominently displayed on the sides, while black detailing can also be found on the Wings logo, laces, and outsole. The midsole is white, while the outsole is done in a vibrant red color. Overall, the design exudes a clean and bold aesthetic.");
	    textArea.setEditable(false);
	    textArea.setFont(textArea.getFont().deriveFont(20f));
	    textArea.setLineWrap(true);
	    textArea.setWrapStyleWord(true);
	    textArea.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add empty border with margin values
	    mainPanel.add(textArea, BorderLayout.CENTER);

	    // Create the buttons panel
	    JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    JButton previousButton = new JButton("Previous Shoe");
	    JButton menuButton = new JButton("Menu");
	    JButton nextButton = new JButton("Next Shoe");

	    // Add action listeners to the buttons
	    previousButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            new YellowPage();
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
	            new BluePage();
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


