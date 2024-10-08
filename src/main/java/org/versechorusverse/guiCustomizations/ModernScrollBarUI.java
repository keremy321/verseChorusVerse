package org.versechorusverse.guiCustomizations;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class ModernScrollBarUI extends BasicScrollBarUI {

    @Override
    protected void configureScrollBarColors() {
        this.thumbColor = new Color(0xef1e5e);
        this.trackColor = new Color(0x16181b);
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return createZeroButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return createZeroButton();
    }

    private JButton createZeroButton() {
        JButton button = new JButton();
        button.setPreferredSize(new Dimension(0, 0));
        button.setMinimumSize(new Dimension(0, 0));
        button.setMaximumSize(new Dimension(0, 0));
        return button;
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        g.setColor(trackColor);
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        g.setColor(thumbColor);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Set the width of the thumb to be thinner (e.g., 8 pixels wide)
        int thumbWidth = 8;
        g2.fillRoundRect(thumbBounds.x, thumbBounds.y, thumbWidth, thumbBounds.height, 10, 10);
        g2.dispose();
    }

    @Override
    public Dimension getPreferredSize(JComponent c) {
        // Set a fixed width for the vertical scrollbar, ensuring it remains constant
        return new Dimension(8, 0); // 8 pixels wide for vertical scrollbars
    }

}