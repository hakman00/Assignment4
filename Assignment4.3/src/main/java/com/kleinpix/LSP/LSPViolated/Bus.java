package com.kleinpix.LSP.LSPViolated;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   LSPViolated: shows the LSP being violated.
 */

public class Bus extends Vehicle
{
    private String emergencyExit;
    private int speed;
    private int capacity;

    //Default constructor
    public Bus()
    {

    }
    //parameterized constructor
    public Bus(int speed, int capacity, String emergencyExit)
    {
        this.emergencyExit = emergencyExit;
    }
    //Methods
    //Getters - Accessors
    public String getEmergencyExit()
    {
        return emergencyExit;
    }
    public int getSpeed()
    {
        return speed;
    }
    public int getCapacity()
    {
        return capacity;
    }
    //Setters - Mutator
    public void setEmergencyExit()
    {
        emergencyExit = emergencyExit;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
}
