package com.kleinpix.OCP.OCPRefactored;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   OCPRefactored: adherering to OCP.
 */

public class LuxurySedan implements Vehicle
{
    private double price;

    //parameterized constructor, inheriting from super class
    public LuxurySedan (String make, String model,String colour, double price)
    {
        //super(make,model,colour);
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
    //abstarct methods
    //LuxurySedan behaviour at the CarDealership:
    public void securelyParked()
    {
        //System.out.println("The Luxury Sedan is securely parked for the night. ");
    }
    public void washSedan()
    {
        //System.out.println("The Luxury Sedan is clean for the showroom. ");
    }
    //SUV behaviour at the CarDealership:
    public void cleandInside()
    {
        //System.out.println("The SUV is clean inside. ");
    }
    public void odometerReading()
    {
        //System.out.println("The SUV has zero odometer reading. ");
    }

}
