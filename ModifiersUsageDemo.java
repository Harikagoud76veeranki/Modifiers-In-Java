package com.apjfsa;

public class ModifiersUsageDemo {
    // Public variable, accessible from anywhere
    public double val1;

    // Protected variable, accessible within the package and in subclasses
    protected double val2;

    // Private variable, accessible only within the same class
    private double val3;

    // Default variable, accessible within the package
    double val4;

    // Getter method to access private variable val3
    public double getVal3() {
        return val3;
    }

    // Setter method to modify private variable val3
    public void setdouble3(double val3) {
        this.val3 = val3;
    }
}
