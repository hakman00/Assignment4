package com.kleinpix.LSP.LSPRefactored;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   LSPRefactored: shows adherance to LSP.
 */

public class Car extends Vehicle
{
    private boolean isHatchBack;
    private int speed;
    private int capacity;

    //Default constructor
    public Car()
    {

    }
    //parameterized constructor
    public Car(int speed,int capacity, boolean isHatchBack)
    {
        this.isHatchBack = true;
    }
    //Methods

   //Getters - Accessors
    public boolean isHatchBack()
    {
        return isHatchBack;
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
    public void setHatchBack(boolean hatchBack)
    {
        isHatchBack = hatchBack;
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
