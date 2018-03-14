package com.kleinpix.DIP.DIPRefactored;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   DIPRefactored: shows adherance to DIP.
 */

public class Employee implements Salaries
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
