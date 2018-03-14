package com.kleinpix.OCP.OCPRefactored;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   OCPRefactored: adherering to OCP.
 */

public class CarDealer implements Vehicle
{
    //abstract methods
    //SUV behaviour at the CarDealership:
    public void cleandInside()
    {
        //System.out.println("The SUV is clean inside. ");
    }
    public void odometerReading()
    {
        //System.out.println("The SUV has zero odometer reading. ");
    }
    //LuxurySedan behaviour at the CarDealership:
    public void securelyParked()
    {
        //System.out.println("The Luxury Sedan is securely parked for the night. ");
    }
    public void washSedan()
    {
        //System.out.println("The Luxury Sedan is clean for the showroom. ");
    }
}
