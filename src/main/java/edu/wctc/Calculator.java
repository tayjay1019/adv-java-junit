package edu.wctc;

/**
 * This class acts like a basic arithmetic calculator.
 * Is's really great and perfectly written.
 *
 * @author Taylor Joseph
 */
public class Calculator {

    private String name;
    private double memory;

    public void addToMemory (double ammount) {
        memory += ammount;
    }

    public void clearMemory() {
        memory = 0;
    }

    public double getMemory() {
        return memory;
    }


    /**
     * Creates a new calculator
     * @throws IllegalArgumentException if name is null or empty
     * @param name The calculator's name
     */
    public Calculator(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("must have a name");
        }
            this.name = name;
    }


    /**
     * Returns the sum of two numbers.
     * @param augend The first number
     * @param addend The second number
     * @return The sum
     */

    public double add(double augend, double addend) {
        return augend + addend;
    }

    /**
     * Returns the difference of two numbers.
     * @param minuend The first number
     * @param subrahend The second number
     * @return The difference
     */
    public double subtract(double minuend, double subrahend) {
        return minuend - subrahend;
    }

}



/*
one game
10 frames
each frame has at most 2 attempts

if atpt1 + atpt2 != 10
frameScore = atpt1 + atpt2

if atpt1 + atpt2 = 10
frameScore = 10 + atp1 of next frame

if atpt1 = 10
frameScore = 10 + atpt1 of next frame + atpt2 of next frame

if frame = index 9
same rules apply but if a strike or spare is made, one additional attempt is added (max 3).
 */


