package com.thirdmeow;

import java.util.Random;

public class Worm extends Animal {
    /**
     * Constructor
     * @param x x-axis position
     * @param y y-axis position
     */
    Worm(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void autoMove() {
        if (Math.random() > 0.5) {
            this.moveUp(1);
        } else {
            this.moveDown(1);
        }
        if (Math.random() > 0.5) {
            this.moveLeft(1);
        } else {
            this.moveRight(1);
        }
    }

    @Override
    public String toString() {
        return String.format("Worm Obj; position: (%d, %d)", x, y);
    }
}
