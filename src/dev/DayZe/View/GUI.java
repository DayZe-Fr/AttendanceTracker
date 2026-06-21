package dev.DayZe.View;

import java.awt.*;
import javax.smartcardio.Card;
import javax.swing.*;

public class GUI extends JFrame {
    private JPanel _mainPanel;

    private CardLayout layout;

    private JPanel signIn;
    private JLabel _LBL_signIn;

    public GUI(int Height, int Width) {
        var screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        _mainPanel = new JPanel();





        // setting stuff
        this.setResizable(false);
        this.setTitle("AT Sign In");
        this.setSize(Math.clamp(Width, 500, screenSize.width), Math.clamp(Height, 500, screenSize.height));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }








}
