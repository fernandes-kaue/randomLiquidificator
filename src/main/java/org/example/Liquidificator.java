package org.example;

public class Liquidificator {
    private final int maxSpeed;
    private int currentSpeed;
    private boolean isFull;
    private boolean isOn;

    public Liquidificator() {
        maxSpeed = 10;
        currentSpeed = 0;
        isFull = false;
        isOn = false;
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public void setSpeed(int x) {
        if (x > maxSpeed || x < 0) {
            System.out.println("Invalid speed, please inform a valid one.");
        } else if (currentSpeed != x) {
            if (currentSpeed < x) {
                for (int i = 0; i < x; i++) {
                    currentSpeed++;
                    System.out.println("The current speed now is " + currentSpeed);
                }
            } else if (currentSpeed > x) {
                for (int i = currentSpeed; i < x; i--) {
                    currentSpeed--;
                    System.out.println("The current speed now is " + currentSpeed);
                }
            }
        } else if (x == currentSpeed) {
            System.out.println("This is the current speed");
        }
    }

    public boolean isFull() {
        if (isFull != false) {
            return true;
        } else {
            return false;
        }
    }

    public void fill() {
        System.out.println("Filling the liquidificator...");
        isFull = true;
    }

    public void empty() {
        System.out.println("Emptying the liquidificator...");
        isFull = false;
    }

    public void start(int x) {
        this.fill();
        System.out.println("Starting the liquidificator...");
        this.setSpeed(x);
        System.out.println("Finished the blending process...");
        this.setSpeed(0);
        System.out.println("Turning the liquidificator off...");
        this.isOn = false;
        this.empty();
    }



}
