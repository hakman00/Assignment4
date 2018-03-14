package com.kleinpix.DIP.DIPViolated;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   DIPViolated: shows the DIP being violated.
 */

public class OpsManager
{
    private String name;

    //Def constructor
    public OpsManager()
    {

    }
    //parameterized constr
    public OpsManager(String name)
    {
        this.name = name;
    }
    //Methods
    //Getters - Accessors
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public double empSalary()
    {
        return 42000.00;
    }
}
