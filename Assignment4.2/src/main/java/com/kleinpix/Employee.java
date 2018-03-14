package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   Modified code to use an alternative solution to inheritance.
 */
public class Employee
{
    private int idNum;
    private Person person;

    //default constructor
    public Employee()
    {

    }
    //parameterized constructor
    public Employee(int idNum, Person person)
    {
        this.idNum = idNum;
        this.person = person;
    }
    //METHODS
    //Getters - Accessors
    public int getIdNum()
    {
        return idNum;
    }
    public Person getPerson()
    {
        return person;
    }
    //Setters - Mutators
    public void setIdNum(int idNum)
    {
        this.idNum = idNum;
    }
    public void setPerson(Person person)
    {
        this.person = person;
    }
}