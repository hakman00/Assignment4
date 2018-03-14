package com.kleinpix.LSP.LSPViolated;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   LSPViolated: shows the LSP being violated.
 */

public class Vehicle
{
    private int speed;
    private int capacity;

    //default constructor
    public Vehicle()
    {

    }
    //parameterized constructor
    public Vehicle(int speed,int capacity)
    {
        this.speed = speed;
        this.capacity = capacity;
    }
    //Methods
    //Getters -Accessors
    public int getSpeed()
    {
        return speed;
    }
    public int getCapacity()
    {
        return capacity;
    }
    //Setters - Mutators
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
}
