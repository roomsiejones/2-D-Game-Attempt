package com.renaud.objects;

import com.renaud.GlobalPosition;

import java.awt.*;

public class Player extends GlobalPosition {

    public Player(int x, int y) {
        // refers back to the parent class x and y
        super(x, y);
    }

    // empty methods used later to update our player and paint them
    public void update(){

    }

    public void draw(Graphics2D g2d){

    }
}
