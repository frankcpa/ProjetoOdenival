/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.login;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.border.Border;

public final class IconPassField extends JPasswordField{

    private static final int ICON_SPACING = 4;
    private Border mBorder;
    private Icon mIcon;
    private final String hint;
    private String placeholder;

    public IconPassField(String nomeIcone, String hint) {
        //super(hint);
        this.hint = hint;
        setPlaceholder(this.hint);
        //this.showingHint = true;
       //super.addFocusListener(this);

        //URL path = null;
        //path = new URL("https://i.imgur.com/WKfl8uV.png");
        //icone = ImageIO.read(path);
        //this.setIcon(new ImageIcon(icone));
        ImageIcon img = new ImageIcon(getClass().getResource("/icones/" + nomeIcone));
        this.setIcon(img);
    }

    @Override
    public void setBorder(Border border) {
        mBorder = border;

        if (mIcon == null) {
            super.setBorder(border);
        } else {
            Border margin = BorderFactory.createEmptyBorder(0, mIcon.getIconWidth() + ICON_SPACING, 0, 5);
            Border compoud = BorderFactory.createCompoundBorder(border, margin);
            super.setBorder(compoud);
        }
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        if (mIcon != null) {
            Insets iconInsets = mBorder.getBorderInsets(this);
            mIcon.paintIcon(this, graphics, iconInsets.left, iconInsets.top);
        }
        // ----------- Para o place holder -----------------
        if (placeholder == null || placeholder.length() == 0 || getText().length() > 0) {
            return;
        }

        final Graphics2D g = (Graphics2D) graphics;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(getDisabledTextColor());
        g.drawString(placeholder, getInsets().left, graphics.getFontMetrics().getMaxAscent() + getInsets().top);
    }

    public void setIcon(Icon icon) {
        mIcon = icon;
        resetBorder();
    }

    private void resetBorder() {
        setBorder(mBorder);
    }

    //************ Para o Placeholder
    public void setPlaceholder(final String s) {
        placeholder = s;
    }
    
    public String getPlaceholder() {
        return placeholder;
    }
}
