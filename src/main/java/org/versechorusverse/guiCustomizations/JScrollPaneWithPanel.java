package org.versechorusverse.guiCustomizations;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneWithPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scrollable JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a panel with a GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3, 10, 10)); // Grid with 3 columns

        // Add multiple buttons (or any other components) to the panel
        for (int i = 1; i <= 50; i++) {
            panel.add(new JButton("Button " + i));
        }

        // Wrap the panel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(panel);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}