/***************************************************
 File: Proj07runner.java
 Author: Fred Butoma
 Purpose: Proj07Runner.java is a class that deals with
        Swing, mouse events, JPanel and a JFrame object
 ***************************************************/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Proj07Runner {
    private JFrame displayWindow;
    private MyPanel drawingPanel;

    // Constructor for Proj07Runner
    public Proj07Runner() {
        // Print the certification statement
        System.out.println("I certify that this program is my own work\n" +
                "and is not the work of others. I agree not\n" +
                "to share my solution with others.\n" +
                "Fred Butoma");

        // Create a new JFrame object, set size and title
        displayWindow = new JFrame();
        displayWindow.setSize(300, 100);
        displayWindow.setTitle("Fred Butoma");

        // Create the JPanel that will handle mouse events and drawing
        drawingPanel = new MyPanel();
        // Set preferred size of JPanel
        drawingPanel.setPreferredSize(new Dimension(286, 63));

        // Add the panel to the frame
        displayWindow.add(drawingPanel);

        // Terminate the program when the user closes the JFrame
        displayWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adjust frame size to accommodate insets
        displayWindow.pack();

        // Set the JFrame to appear in the center of the screen
        displayWindow.setLocationRelativeTo(null);

        // Make the JFrame visible
        displayWindow.setVisible(true);
    }

    // Method to return the JFrame object
    public JFrame getJFrame() {
        return displayWindow;
    }

    // Method to return the JPanel object
    public JPanel getJPanel() {
        return drawingPanel;
    }

    // Inner class MyPanel to handle mouse events and painting
    class MyPanel extends JPanel {
        int clickX = -1;
        int clickY = -1;

        MyPanel() {
            // Register mouse event listener
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    // Get X and Y coordinates of mouse pointer
                    clickX = e.getX();
                    clickY = e.getY();
                    repaint(); // Repaint the panel to show the new coordinates
                }
            });
        }

        // Override paintComponent instead of paint for JPanel
        protected void paintComponent(Graphics g) {
            // Call superclass method first to make sure the background is properly rendered
            super.paintComponent(g);
            // Set text color to black
            g.setColor(Color.BLACK);
            if (clickX >= 0 && clickY >= 0) {
                // Draw the coordinates above and to the right of the click point by 10 pixels
                g.drawString(clickX + ", " + clickY, clickX, clickY - 10);
            }
        }
    }
}
