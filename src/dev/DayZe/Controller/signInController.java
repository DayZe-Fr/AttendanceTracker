package dev.DayZe.Controller;

import dev.DayZe.View.GUI;
import dev.DayZe.tools;

import javax.swing.*;
import java.awt.*;

public class signInController {
    private GUI _mainGUI;
    private JButton _trySubmit;
    private tools _tools;

    public signInController(tools Toolset, GUI mainGUI)  {
        _tools = Toolset;
        //
        _mainGUI = mainGUI;
        _trySubmit = mainGUI.trySubmit;




        // event set
        _trySubmit.addActionListener(e -> proccess_LogIn(_mainGUI.getEnteredUser(), _mainGUI.getEnteredPass()));
    }

    private void proccess_LogIn(String user, String password) {
        _tools.print(user);
        _tools.print(password);
    }


}
