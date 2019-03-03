package com.thirdmeow;

/**
 * Animal class is base class for all in-game animal entities
 *
 * @author John Shea
 * @version 0.0.1
 */
public class Animal {
    // Position
    public int x, y;

    public void moveUp(int dis) {
        y += dis;
    }
    public void moveDown(int dis) {
        y -= dis;
    }
    public void moveLeft(int dis) {
        x -= dis;

    }
    public void moveRight(int dis) {
        x += dis;
    }
}
