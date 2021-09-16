package com.renaud;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {
    // by using this, we give Game a serial version
    private static final long serialVersionUID = 1L;

    public Game(){
        // allows user to move in the game without having to click on the game
        setFocusable(true);
    }

    public void paint(Graphics g){
        // we will be painting with the variable g using the super class
        super.paint(g);
        // using a caste system converting g variable from a Graphics variable into a Graphics 2D variable
        Graphics2D g2d = (Graphics2D) g;

        
    }
}
