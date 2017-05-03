package models;

/**
 * Created by Paul on 4/26/2017.
 */
public class Frame {

    private int rollOne;
    private int rollTwo;

    public Frame(int rollOne, int rollTwo) {
        this.rollOne = rollOne;
        this.rollTwo = rollTwo;
    }

    public int getRollOne() {
        return rollOne;
    }

    public void setRollOne(int rollOne) {
        this.rollOne = rollOne;
    }

    public int getRollTwo() {
        return rollTwo;
    }

    public void setRollTwo(int rollTwo) {
        this.rollTwo = rollTwo;
    }
}
