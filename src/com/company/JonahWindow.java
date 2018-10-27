package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class JonahWindow {

    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lb1;
    private JLabel lb2;

    private String loggedInUser = "";
    private String usedPassword = "";

    public JonahWindow()
    {
        this.loggedInUser = "Noch kein User bekannt";
    }

    public void launch(String username, String password, String asdf){

        this.loggedInUser = username;
        this.usedPassword = password;
        gui(asdf);
    }

    public void setUsedPassword(String pw)
    {
        this.usedPassword = pw;
    }

    private void gui(String launchCommand) {

        f = new JFrame("MyFrame");
        f.setVisible(true);
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        p.setBackground(Color.GRAY);

        b1 = new JButton(launchCommand);
        lb1 = new JLabel("Wellcome JoMaster");
        lb2 = new JLabel("Logged in as: " + this.loggedInUser + " With password: " + this.usedPassword);

        p.add(lb1);
        p.add(b1);
        p.add(lb2);

        f.add(p);

    }
}
