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
        x = 0;
        y = 0;
    }

    /**
     * Constructor with name
     * @param kiwiName name of kiwi
     */
    Kiwi(String kiwiName) {
        name = kiwiName;
    }

    /**
     * Constructor with name and starting position
     * @param kiwiName name of kiwi
     * @param start_x starting position on x-axis
     * @param start_y starting position on y-axis
     */
    Kiwi(String kiwiName, int start_x, int start_y) {
        name = kiwiName;
        x = start_x;
        y = start_y;
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
