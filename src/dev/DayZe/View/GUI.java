package dev.DayZe.View;

import java.awt.*;
import javax.smartcardio.Card;
import javax.swing.*;

public class GUI extends JFrame {
    private JPanel _mainPanel;

    private CardLayout layout;

    ///error key
    private JLabel errorText;
    private Color errorColour = new Color(255, 0, 0);


    // =================================================
    // sign in
    private JPanel _signIn;
    // username
    private JLabel _LBL_username;
    private JTextField _INP_user;
    //password
    private JLabel _LBL_password;
    private JPasswordField _INP_pass;
    //other
    public JButton trySubmit;

    public GUI(int Height, int Width) {
        var screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        _mainPanel = new JPanel();


        // ==============================================
        _signIn = new JPanel();
        // user
        _LBL_username = new JLabel("Username");
        _LBL_username.setAlignmentX(Component.CENTER_ALIGNMENT);
        _LBL_username.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        _INP_user = new JTextField(30);

        // pass
        _LBL_password = new JLabel("Password");
        _LBL_password.setAlignmentX(Component.CENTER_ALIGNMENT);
        _LBL_password.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        _INP_pass = new JPasswordField(30);
        _INP_pass.setAlignmentX(Component.CENTER_ALIGNMENT);

        //other
        trySubmit = new JButton("Sign In");


        //setting panel
        _signIn.setLayout(new GridLayout(10, -1));
        _signIn.setAlignmentX(Component.CENTER_ALIGNMENT);
        //adding user
        _signIn.add(_LBL_username);
        _signIn.add(_INP_user);
        //adding pass
        _signIn.add(_LBL_password);
        _signIn.add(_INP_pass);
        //adding other
        _signIn.add(trySubmit);



        // ==============================================
        //adding components

        _mainPanel.add(_signIn, "SignIn");





        this.add(_mainPanel);


        // setting stuff
        this.setResizable(false);
        this.setTitle("AT Sign In");
        this.setSize(Math.clamp(Width, 500, screenSize.width), Math.clamp(Height, 500, screenSize.height));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /// Get the entered User
    public String getEnteredUser() {
        return _INP_user.getText();
    }

    /// Get the entered password
    public String getEnteredPass() {
        return _INP_pass.getText();
    }

    /// Clean the log in fields
    public void cleanLogin() {
        _INP_user.setText("");
        _INP_pass.setText("");
        _signIn.remove(errorText);
        errorText = null;
    }

    /** Displays an Error on GUI
    @param sentError "Error Text" **/
    public void displayError(String sentError) {
        if (errorText == null) {
            errorText = new JLabel(sentError);
            errorText.setForeground(errorColour);
            _signIn.add(errorText);
            _signIn.revalidate();
            _signIn.repaint();
        } else {
            errorText.setText(sentError);
        }
    }






}
