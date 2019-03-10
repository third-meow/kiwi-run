package com.thirdmeow;

import java.util.Scanner;

/**
 * Simple 2d game
 *
 * @author John Shea
 * @version 0.0.1
 */
public class Main {

    public static void main(String[] args) {
        Universe uni = new Universe();

        Scanner scr = new Scanner(System.in);
        scr.useDelimiter("");
        char cmd;

        do {
            uni.printStatus();
            cmd = scr.next().charAt(0);

            switch (cmd) {
                case 'h':
                    if (uni.mainPlayer.x > 0)
                        uni.mainPlayer.moveLeft(1);
                    break;
                case 'j':
                    if (uni.mainPlayer.y > 0)
                        uni.mainPlayer.moveDown(1);
                    break;
                case 'k':
                    if (uni.mainPlayer.y < uni.MAX_Y)
                        uni.mainPlayer.moveUp(1);
                    break;
                case 'l':
                    if (uni.mainPlayer.x < uni.MAX_X)
                        uni.mainPlayer.moveRight(1);
                    break;
                default:
                    break;
            }
            uni.firstWorm.autoMove();

            if (uni.firstWorm.x == uni.mainPlayer.x
                && uni.firstWorm.y == uni.mainPlayer.y) {
                uni.printStatus();
                uni.printWinMsg();
                break;
            }
        } while (cmd != 'q');
    }
}
