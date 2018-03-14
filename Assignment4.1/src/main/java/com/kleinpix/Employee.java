package com.kleinpix;

/*
    Name    :   Heinrich Klein
    Student#:   195032659
    Date    :   09 March 2018
    Descript:   A small program using TDD method to demonstrate "Encapsulation",
                one of the three core principals of Object Oriented Programming.
 */
public class Employee extends Person
{
    //private String name;
    //private String surname;
    private int idNum;
    //private String address;

    //default constructor
    public Employee()
    {

    }
    //parameterized constructor
    public Employee(String name,String surname,int age,double salary, String address)
    {
        super(name, surname, age, salary, address);
        this.idNum = idNum;
    }
    //METHODS
    //Getters - Accessors
    /*public String getName()
    {
        return name;
    }*/
    /*public String getSurname()
    {
        return surname;
    }*/
    public int getIdNum()
    {
        return idNum;
    }
    /*public double getAddress()
    {
        return address;
    }*/
    //Setter - Mutators
    /*public void setName(String name)
    {
        this.name = name;
    }*/
    /*public void setSurname(String surname)
    {
        this.surname = surname;
    }*/
    public void setIdNum(int idNum)
    {
        this.idNum = idNum;
    }
    /*public void setSalary(double salary)
    {
        this.salary = salary;
    }*/
}