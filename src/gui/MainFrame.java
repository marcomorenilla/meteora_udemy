package gui;

import constants.Constant;
import javax.swing.JFrame;

public class MainFrame extends JFrame{

    public MainFrame() {
        initializeVariables();
    }

    //building basic aspects of MainFrame.
    private void initializeVariables() {
        add(new GamePanel());
        pack();
        setTitle(Constant.GAME_TITLE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);

    }
}
