package gui;

import constants.Constant;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

    public GamePanel() {
        initializeVariables();
    }

    private void initializeVariables() {
        setPreferredSize(new Dimension(Constant.PANEL_WIDH,Constant.PANEL_HEIGHT));
        setFocusable(true);
    }
}
