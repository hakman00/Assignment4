package com.kleinpix.LSP.LSPRefactored;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   LSPRefactored: shows adherance to LSP.
 */

public class Bus extends  Vehicle
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
    //Vehicle vehicle = new Bus();
    //vehicle.getSpeed();

    //Methods
    //Getters - Accessors
    public String getEmergencyExit()
    {
        return emergencyExit;
    }
    @Override
    public int getSpeed()
    {
        return speed;
    }
    @Override
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
