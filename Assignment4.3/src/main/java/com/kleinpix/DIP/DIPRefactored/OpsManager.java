package com.kleinpix.DIP.DIPRefactored;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   DIPRefactored: shows adherance to DIP.
 */

public class OpsManager implements Salaries
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
