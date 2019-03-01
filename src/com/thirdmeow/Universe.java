package com.thirdmeow;

/**
 * Game universe
 *
 * @author John Shea
 * @version 0.0.1
 */
public class Universe {
    Kiwi mainPlayer;

    /**
     * Constructor
     */
    Universe() {
        mainPlayer = new Kiwi();
    }

    /**
     * Kick off
     */
    public void run() {
        System.out.println(mainPlayer.toString());
        mainPlayer.moveUp(1);
        System.out.println(mainPlayer.toString());
    }

}
