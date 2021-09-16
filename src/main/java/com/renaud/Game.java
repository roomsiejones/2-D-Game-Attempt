package com.renaud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JPanel is what allows it into the JFrame, ActionListener is what allows us to create the loop using Timer
public class Game extends JPanel implements ActionListener {
    // by using this, we give Game a serial version
    private static final long serialVersionUID = 1L;

    Timer gameLoopTimer;

    public Game(){
        // allows user to move in the game without having to click on the game
        setFocusable(true);
        // runs through this code ever "delay" in milliseconds
        gameLoopTimer = new Timer(1000, this);
        gameLoopTimer.start();
    }



    public void paint(Graphics g){
        // we will be painting with the variable g using the super class
        super.paint(g);
        // using a caste system converting g variable from a Graphics variable into a Graphics 2D variable g2d
        Graphics2D g2d = (Graphics2D) g;
    }

    // needed to get rid of the error from the implementation of the ActionListener
    @Override
    public void actionPerformed(ActionEvent arg0) {
        // an in-built method with paint that re-calls the paint class and this runs with the gameloop timer currently
        repaint();
    }
}
