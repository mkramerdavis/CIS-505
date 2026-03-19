/*  Assignment 1.3.1

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by M. Kramer-Davis 2026

*/

// package declaration for the Fan class. //
package Module_1.FanApp;

/*
 *  The Fan class represents a fan with 
 *  speed, on/off state, radius, and color.
 */
public class Fan {

    // Constants for fan speeds. //
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private data fields. //
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /*
     * Default constructor
     * Creates a fan with default values
     */
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    /*
     * Argument constructor
     * @param speed fan speed
     * @param on fan on/off state
     * @param radius fan radius
     * @param color fan color
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters and Setters //

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*
     * toString method
     * @return string description of the fan.
     */
    @Override
    public String toString() {
        if (on) {
            return "The fan speed is set to " + speed +
                   " with a color of " + color +
                   " and a radius of " + radius;
        } else {
            return "The fan is " + color +
                   " with a radius of " + radius +
                   " and the fan is off";
        }
    }//end of toString method.//
}//end of class Fan.//
    