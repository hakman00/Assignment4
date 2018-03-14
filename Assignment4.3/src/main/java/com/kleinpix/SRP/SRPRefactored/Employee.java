package com.kleinpix.SRP.SRPRefactored;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   SRPRefactored: showing adhereance to SRP.
 */

public class Employee
{
    private String name;
    private String surname;
    //default constructor
    public Employee()
    {

    }
    //paparmeterized constructor
    public Employee(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
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
    //Setters - Mutators
    public void setName(String name)
    {
        this.name = name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    //toString method to display
    public String toString()
    {
        return ("EMPLOYEE: " + "\n" +
                "NAME: " + name + "\n" +
                "SURNAME: " + surname + "\n");
    }
}
