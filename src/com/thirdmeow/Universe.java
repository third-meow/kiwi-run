package com.thirdmeow;

/**
 * Game universe
 *
 * @author John Shea
 * @version 0.0.1
 */
public class Universe {
    Kiwi mainPlayer;
    Worm firstWorm;

    /**
     * Constructor
     */
    Universe() {
        mainPlayer = new Kiwi();
        firstWorm = new Worm(0,0);
    }

    /**
     * Kick off
     */
    public void run() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(firstWorm.toString());
            System.out.println(mainPlayer.toString());
            mainPlayer.moveUp(1);
            firstWorm.autoMove();
        }
    }

}
