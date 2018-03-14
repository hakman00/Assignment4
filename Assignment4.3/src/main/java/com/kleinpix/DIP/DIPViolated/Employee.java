package com.kleinpix.DIP.DIPViolated;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   DIPViolated: shows the DIP being violated.
 */

public class Employee
{
    private String name;

    public Employee()
    {

    }
    //para const
    public Employee(String name)
    {
        this.name = name;
    }
    //Methods
    //Getters - Accessors
    public String getName()
    {
        return name;
    }
    //Setters - Mutators
    public void setName(String name)
    {
        this.name = name;
    }

    public double empSalary()
    {
        return 19000.00;
    }
}
