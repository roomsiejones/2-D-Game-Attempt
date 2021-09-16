package com.renaud;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // we are using the JFrame avaiable to us through imports
        JFrame frame = new JFrame();
        frame.pack();
        // sets size of window
        frame.setSize(640, 480);
        // makes it so user can't resize
        frame.setResizable(false);
        // along with frame.pack, this code centers the JFrame when program is run
        frame.setLocationRelativeTo(null);
        // if this was not here, program would continue running in the background even when JFrame is gone
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // This creates a new object of Game and adds it to the JFrame
        frame.add(new Game());
        // pretty obvious...
        frame.setVisible(true);



    }
}
