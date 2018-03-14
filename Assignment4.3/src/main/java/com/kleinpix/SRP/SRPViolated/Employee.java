package com.kleinpix.SRP.SRPViolated;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   SRPViolated: showing a violation to SRP.
 */

public class Employee
{
    private String name;
    private String surname;
    private double newSalary;

    public Employee()
    {
        this.name = name;
        this.surname = surname;
        this.newSalary = newSalary;
    }
    //Methods
    //Getters - Accessors
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public double getSalary()
    {
        return newSalary;
    }
    //Settres - Mutators
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public void setNewSalary(double newSalary)
    {
        this.newSalary = newSalary;
    }
    //toString method to display
    public String toString()
    {
        return ("EMPLOYEE: " + "\n" +
                "NAME: " + name + "\n" +
                "SURNAME: " + surname + "\n" +
                "SALARY: " + newSalary);
    }
}