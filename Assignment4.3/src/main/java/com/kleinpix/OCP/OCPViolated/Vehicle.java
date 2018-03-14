package com.kleinpix.OCP.OCPViolated;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   OCPViolated: shows the OCP being violated.
 */

public class Vehicle
{
    private String make;
    private String model;
    private String colour;

    //default constructor
    public Vehicle()
    {

    }
    //parameterized constructro
    public Vehicle(String make,String model, String colour)
    {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }
    //Methods
    //Getters - Accessors
    public String getMake()
    {
        return make;
    }
    public String getModel()
    {
        return model;
    }
    public String getColour()
    {
        return colour;
    }
    //Setters - Mutators
    public void setMake(String make)
    {
        this.make = make;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }
}
