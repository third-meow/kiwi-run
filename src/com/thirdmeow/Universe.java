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

    static final int MAX_X = 10;
    static final int MAX_Y = 10;

    /**
     * Constructor
     */
    Universe() {
        mainPlayer = new Kiwi();
        firstWorm = new Worm(5,5, MAX_X, MAX_Y);
    }

    public void printStatus() {
        // Create char array to print to screen
        char[][] printArray = new char[MAX_Y][MAX_X]; // TODO: don't redeclare this over and over

        // Fill with '.'
        for (int i = 0; i < MAX_Y; ++i) {
            for (int j = 0; j < MAX_X; ++j) {
                printArray[i][j] = '.';
            }
        }

        // Change print array at kiwis position to '@'
        printArray[mainPlayer.y][mainPlayer.x] = '@';

        // Change print array at worms position to '%'
        printArray[firstWorm.y][firstWorm.x] = '%';

        for (int i = MAX_Y - 1; i >= 0; --i) {
            System.out.println();
            for (int j = 0; j < MAX_X; ++j) {
                System.out.print(printArray[i][j]);
            }
        }
        System.out.println();

    }

    public void printWinMsg() {
        System.out.println("Main Player has won!");
    }
}
