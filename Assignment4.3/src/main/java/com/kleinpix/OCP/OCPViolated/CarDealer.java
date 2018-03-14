package com.kleinpix.OCP.OCPViolated;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   OCPViolated: shows the OCP being violated.
 */

public class CarDealer
{
    public void vehicleStatus(Vehicle vehicle)
    {
        if(vehicle instanceof LuxurySedan)
        {
            securelyParked();
            washSedan();
        }
        else if(vehicle instanceof SUV)
        {
            cleandInside();
            odometerReading();
        }
    }
    //LuxurySedan behaviour at the CarDealership:
    public void securelyParked()
    {
        System.out.println("The Luxury Sedan is securely parked for the night. ");
    }
    public void washSedan()
    {
        System.out.println("The Luxury Sedan is clean for the showroom. ");
    }
    //SUV behaviour at the CarDealership:
    public void cleandInside()
    {
        System.out.println("The SUV is clean inside. ");
    }
    public void odometerReading()
    {
        System.out.println("The SUV has zero odometer reading. ");
    }
}
