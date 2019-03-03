package com.thirdmeow;


/**
 * Kiwi is one of the in-game 'characters' or players
 * It can move around the 2d game environment
 *
 * @author John Shea
 * @version 0.0.1
 */
public class Kiwi extends Animal {
    // Human readable name for kiwi
    public String name;

    /**
     * Constructor
     */
    Kiwi() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructor with name
     * @param name human readable name of kiwi
     */
    Kiwi(String name) {
        this(name, 0, 0);
    }

    /**
     * Constructor with name and starting position
     * @param name human name of kiwi
     * @param x starting position on x-axis
     * @param y starting position on y-axis
     */
    Kiwi(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    /**
     * toString() overload
     * prints kiwi status
     * eg.
     *  "Kiwi Obj; name: jeff; pos: (3,4)"
     */
    @Override
    public String toString() {
        return String.format("Kiwi Obj; name: %s; pos: (%d,%d)", name, x, y);
    }

}
