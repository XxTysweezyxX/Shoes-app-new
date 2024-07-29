package shoesappnew;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

public class MenuPage extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuPage();
            }
        });
    }

    public MenuPage() {
        // Set up the JFrame
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        // Create the buttons
        JButton redButton = new JButton("Red Page");
        JButton blueButton = new JButton("Blue Page");
        JButton yellowButton = new JButton("Yellow Page");

        // Increase the button size
        redButton.setPreferredSize(new Dimension(150, 50));
        blueButton.setPreferredSize(new Dimension(150, 50));
        yellowButton.setPreferredSize(new Dimension(150, 50));

        // Add action listeners to the buttons
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new RedPage(); // Instantiate the RedPage class
            }
        });

        blueButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new BluePage(); // Instantiate the BluePage class
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new YellowPage(); // Instantiate the YellowPage class
            }
        });

        // Add the buttons to the button panel
        buttonPanel.add(redButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(yellowButton);

        // Set the layout manager of the content pane to BorderLayout
        getContentPane().setLayout(new BorderLayout());

        // Create a JPanel to hold the background image and buttons
        JPanel backgroundPanel = new JPanel(new BorderLayout());

        // Create a JLabel to hold the background image
        JLabel backgroundLabel = new JLabel();
        backgroundLabel.setIcon(new ImageIcon("img/menu background edited.jpg"));

        // Add the background label to the background panel
        backgroundPanel.add(backgroundLabel, BorderLayout.CENTER);

        // Add the button panel to the background panel
        backgroundPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Add the background panel to the content pane
        getContentPane().add(backgroundPanel, BorderLayout.CENTER);

        // Display the frame
        setVisible(true);
    }
}





