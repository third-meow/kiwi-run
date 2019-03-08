package com.thirdmeow;

import java.util.Random;

public class Worm extends Animal {

    // Position limits
    public int x_limit, y_limit;

    /**
     * Constructor
     * @param x x-axis position
     * @param y y-axis position
     */
    Worm(int x, int y, int x_limit, int y_limit) {
        this.x = x;
        this.y = y;

        this.x_limit = x_limit;
        this.y_limit = y_limit;
    }

    public void autoMove() {
        if (Math.random() > 0.5) {
            if (this.y < this.y_limit)
                this.moveUp(1);
        } else {
            if (this.y > 0)
                this.moveDown(1);
        }
        if (Math.random() > 0.5) {
            if (this.x > 0)
                this.moveLeft(1);
        } else {
            if (this.x < this.x_limit)
                this.moveRight(1);
        }

    }

    @Override
    public String toString() {
        return String.format("Worm Obj; position: (%d, %d)", x, y);
    }
}
