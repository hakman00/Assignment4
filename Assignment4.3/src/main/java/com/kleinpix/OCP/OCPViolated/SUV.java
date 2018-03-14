package com.kleinpix.OCP.OCPViolated;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   OCPViolated: shows the OCP being violated.
 */

public class SUV extends Vehicle
{
    private double price;

    //parameterized constructor
    public SUV(String make, String model, String colour, double price)
    {
        super(make,model,colour);
        this.price = price;
    }
    //Methods
    //Getters - Accessors
    public double getPrice()
    {
        return price;
    }
    //Setters - Mutators

    public void setPrice(double price)
    {
        this.price = price;
    }
}

